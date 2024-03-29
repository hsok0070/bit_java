package java_13_ex;

import javax.security.auth.login.FailedLoginException;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	int[] stack;
	int size;
	int p = 0;
	
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
		
	void push(int num) {
			if (isFull()) {
				System.out.println("Full.");
			}return;
			stack[p] = num;
			p++;
		
			//stack[p++] = num;
		
	}
//	Boolean isEmpty() {
//		 if ( p == 0) {
//				System.out.println("비어있습니다.");
//			}return true;
//		
//	}
	Boolean isEmpty() {
		return p == 0 ? true : false ;
		
	}
	
//	Boolean isFull() {
//		if ( p == 10) {
//			System.out.println("가득차있습니다.");
//		}return true;
//		
//	}
	Boolean isFull() {
		return p == stack.length ? true : false ;
		
	}
	int top(){
		if(isFull()) return -1;
			return stack[p-1];
	}
	int pop(){
		if(isEmpty()) return -1;
		return  stack[--p];
		
	}
	
}