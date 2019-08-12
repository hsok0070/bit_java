package java_04_ex;

import java.util.Arrays;

public class Prob2 {
	public static void main(String[]args) {
		int[] num = new int[Integer.parseInt(args[0])];
		for(int i=0 ; i<num.length ; i++) {
				num[i]= (int) (Math.random()*45)+1;
				for (int j=0 ; j<i ; j++) {
					if (num[i]==num[j]) {
						i--;
				}
			}
		}
		int count = 0;
		for(int i=0 ; i<num.length; i++) {
			for (int j=i+1 ; j<num.length; j++) {
				if (num[i]<num[j]) {
					int tamp = num[j];
						num[j] = num[i];
						num[i] = tamp;
						count ++ ;
					
			}
	   }
  }
		System.out.println(Arrays.toString(num));
		System.out.println(count);
 }
}
