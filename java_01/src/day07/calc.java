package day07;

public class calc {
	
	static int data = 0 ; // class 변수
	
	// static method = class method
	public long add(int a, int b) { // class method
		System.out.println(data);
		System.out.println(Math.random());
		return a+b;
	}
	public static long sub(int a, int b) { // instance method
		return a-b;
	}
	public static long multi(int a, int b) {
		return a*b;
	}
	public static long mod(int a, int b) {
		if(b==0) return 0;
		return a/b;
	}
}
