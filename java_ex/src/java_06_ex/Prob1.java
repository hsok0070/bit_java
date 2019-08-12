package java_06_ex;

public class Prob1 {
	public static void main(String args[]) {
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("bit", 6, '#') );
		System.out.println( prob1.leftPad("a", 5, '$') ); 
		System.out.println( prob1.leftPad("bit4", 2, '&') ); 
	}
	public String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		String str1 = str ;
		int size1 = size - str1.length();
				for (int i=0 ; i<size1 ; i++) {
					//str1 += padChar;
					str1 = padChar + str1 ;
				}
				return str1;
	}
}
/*
 * for (; str.length()<size ;) { 
 * str = padChar + str; } 
 * return str;
 */