package day24;

public class Test02 {
	public static void main(String[] args) {
		
		System.out.println(" main start");
		
		MyStack stack = new MyStack();
		
		Push job1 = new Push(stack);
		Pop job2 = new Pop(stack);
		
		Thread t1 = new Thread(job1,"push");
		Thread t2 = new Thread(job2,"pop");
		
		t1.start();
		t2.start();
		
		
		
		
		System.out.println(" main end");
		
		
	}

}

class Push implements Runnable{
	MyStack stack;

	
	public Push() {}
	
	public Push(MyStack stack) {
		this.stack = stack;
				
	}
	@Override
	public void run() {
		for(int i = 0 ; i<10 ; i++) {
			//stack.push(i);
			stack.push(i);
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Pop implements Runnable {
	MyStack stack;
	
	public Pop(MyStack stack) {
	this.stack = stack;
	}
	
	public void run() {
		for (int i= 0 ; i<10 ; i++)
			stack.pop();
		try {
			Thread.sleep((int)(Math.random()*100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
