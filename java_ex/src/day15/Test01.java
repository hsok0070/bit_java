package day15;

import util.MyUtil;

public class Test01 {
	public static void main(String[] args) {
		MyUtil u = new MyUtil();
		String s = u.leftPad("ejb", 15,'^'); // instance method
		System.out.println(s);
		System.out.println(MyUtil.rightPad("java", 10, '#')); // static method
		System.out.println(util.MyUtil.leftPad("java",10,'#')); // static method
		System.out.println(MyUtil.add(4,5,6,7,8));
	}

}
