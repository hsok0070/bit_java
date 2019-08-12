package java_04_ex;

import java.util.Arrays;

public class Test {
	public static void main (String[] args) {
		int [] num = null;
		num = new int[6];
		//System.out.println(num.length);
		for (int i=0 ; i<num.length ; i++) {
			num[i] = (int) (Math.random() * 45) + 1 ;
			for (int j=0 ; j<i ; j++ ) {
				if (num[i]==num[j]) {
					 i --;
					 break;
				}
				
			}
		}
		int count = 0;
		for (int i = 0 ; i<num.length-1 ; i++) {
			int min = i;
			for (int j = i+1 ; j<num.length ; j++) {
				if (num[min] > num[j]) {
					min = j ;
					
				}
			}
			if (i != min) {
				int tamp = num[i];
				num[i] = num[min];
				num[min] = tamp;
			    count ++;
			}
			//System.out.println(i + " => " + count);	
		}
		System.out.println(Arrays.toString(num));
	}
	
}
