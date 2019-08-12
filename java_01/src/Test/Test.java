package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		String[] b = {"홍길동","이길동","최길동"};
		
		
		//출력 결과 : 홍@@ 점수는 : 30점
		
		for (int i = 0; i < a.length; i++) {				
		
			System.out.printf("이름 : %s@@ ,점수 :%d %n",b[i].charAt(0),a[i]);
			
			
			
			
		}
		
	}

}
