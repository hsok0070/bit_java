package day10;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		char[] c = "ABCDEF".toCharArray(); // toCharAArray : 문자열로 값 입력후 char로 변경
		int count = 6;
		int d = 0;
		
		System.out.println(Arrays.toString(c));
		System.arraycopy(c, d+1, c, d, count-d-1);
		count --;
		c[--count] = ' '; 
		System.out.println(Arrays.toString(c));
	}
}
