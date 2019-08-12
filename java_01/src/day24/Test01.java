package day24;

import java.util.ArrayList;
import java.util.Vector;

public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		Account account = new Account("2019001","홍길동",999000);
		
		Job1 j1 = new Job1(account);
		Job1 j2 = new Job1(account);
		
		Thread t1 = new Thread(j1,"통장");
		Thread t2 = new Thread(j2,"카드");
		
		t1.start();
		t2.start();
		
		ArrayList a; // synchronized x (API참고)
		Vector b; // synchronized o (API참고)
		
		
		System.out.println("main end");
	}

	
}

class Job1 implements Runnable{
	Account ac;

	public Job1() {}
	public Job1(Account ac) {
		this.ac = ac;
	}
	
	@Override
	public void run() {
		
		for (int i=0 ; i<5 ; i++) {
			int money = (int)(Math.random()*7+1)*1000;
			ac.withdraw(money);
		}
	}
	
}

class Account{
	String number;
	String name;
	int money;

	public Account() {}
	
	public Account(String a,String b , int c) {
		number= a;
		name = b;
		money = c;
		
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", money=" + money + "]";
	}
	
	public synchronized void withdraw(int c) {
		//money = c ;
		System.out.println(" *****출금 "+ c + " ******");
		System.out.println(Thread.currentThread());
		if(money >= c){
		money -= c;
		System.out.println("잔고 : " + money);
		System.out.println("출금완료 : " + c);
		System.out.println("찬고 : " + money);
		}else {
			System.out.println("잔액 부족");
		}
		
		System.out.println("***************************");
	}
}
