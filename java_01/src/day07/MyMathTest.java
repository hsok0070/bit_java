package day07;

import java.util.Arrays;

import util.MyUtil;

public class MyMathTest {

	public static void main(String[] args) {
		System.out.println(MyUtil.add(33, 99));
		System.out.println(MyUtil.add(33.3, 99.4));
		System.out.println(MyUtil.add(33.3, 99.4,90));
		System.out.println(MyUtil.add(33.3, 99.4, 90, 55.9));
		//System.out.println(MyMath.add(1,2,3,4,5,6,7));
		System.out.println(MyUtil.add(new double[] {1,2,3,4,5,6,7}));
		double[] d = new double[] {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(d));
		
		int i = 100;
		
		//Integer i1 = new Integer(100);
		Integer i1 = i;
		i= i1;
		System.out.println(i1);
	}

}
