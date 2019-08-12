package day08;

import util.MyUtil;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5} ;
	
		System.out.println(MyUtil.max(nums));
		
		System.out.println(MyUtil.max(6,7,-8,9));

		System.out.println(MyUtil.max(new int[] {10,11,12,-13}));
	}
	 // 가장 작은 값 min 
}
