package day09;

import java.util.StringTokenizer;

public class P191 {
	
	StringTokenizer st;
	
	public P191(String str) {
		System.out.println("str :" + str);
		st = new StringTokenizer(str);
	}
	
	public P191(String str, String delim) {
		System.out.println("str : " + str);
		st = new StringTokenizer(str,delim);
	}
	
	public void print() {
		System.out.println("Token count :" + st.countTokens());
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public static void main(String[] args) {
		P191 st1 = new P191("Happy day");
		st1.print();
		
		P191 st2 = new P191("2005/08/15","/");
		st2.print();
	}
	
}
