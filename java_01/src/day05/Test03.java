// char , String 변환 
package day05;

import java.util.Arrays;

public class Test03 {
public static void main (String[] args) {
		String msg = "hello JAVA ~~~" ;
		String msg2 = "hi ~~~ SQL " ;
		
		// char[] c = {'h','e','l'};
		char [] c = new char[msg.length()];
		//for (int i=0 ; i<msg.length();i++) {
		//	c[i] = msg.charAt(i);
		//}
		char [] cc = msg.toCharArray(); // 복사
		cc[0] = 'Q';
		
		String ne = new String(cc);
		
		System.out.println(msg);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(cc));
		System.out.println(ne);
	}

}
