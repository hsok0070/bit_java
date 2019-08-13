package day24;

import javax.sql.rowset.spi.SyncFactory;


public class MyStack {
	
	int[] stack;
	int size;
	int top ;
	
	public MyStack() {
			
			size = 10;
			stack = new int[size];
	}
	public MyStack(int size) {
		if (size < 0) {
			stack = new int[10];
		}else
			stack = new int[size];
//		if(size < 0) {
//			this.size = 10;
//		}else {
//			this.size = size;
//		}
	}
		
	synchronized void push(int data) {
			if (isFull()) {
			//	System.out.println("Full.");
			//return;
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			stack[top] = data ;
			top++;
			System.out.println("Push =>" + data);
			notifyAll();
	}

	Boolean isEmpty() {
		return top == 0 ? true : false ;
		
	}
	

	Boolean isFull() {
		return top == stack.length ? true : false ;
		
	}
	synchronized int top(){
		if(isFull()) return -1;
			return stack[top-1];
	}
	
	synchronized int pop(){
		if(isEmpty()) { //return -1;
		//return  stack[--top];
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int data = stack[--top];
		System.out.println("                            pop ==>"+data);
		notifyAll();
		return data;
		
	}
	
}

