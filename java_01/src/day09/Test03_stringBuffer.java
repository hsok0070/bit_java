package day09;

import java.util.Date;

public class Test03_stringBuffer {
	
	public static void main (String[] args) {
		String msg = "";
		
		msg = msg +"hello "+new java.util.Date()+"java"+"test";
		System.out.println(msg);
		
		String msg2 = "";
		
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		sb.append("hello ");
		sb.append(new Date());
		sb.append("java");
		sb.append("test");
		sb.append('A');
		sb.append(89);
		
		//msg2 = sb.toString(); // 아래와 같은 결과.
		msg2 = new String(sb); // 위와 같은 결과.
		System.out.println(msg2);
	}
	

}
