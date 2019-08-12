package util;

import java.util.Arrays;

public class Sort {
	
	public static int[] sort(int[] nums) {
		// 배열 원본은 변경이 되지 않도록 하고
		// 오름차순으로 정렬된 int[] 를 리턴한다.
		int [] aa = new int[nums.length];
		System.arraycopy(nums, 0, aa, 0, nums.length);
		
		int tamp = 0 ;
		for(int i=0 ; i<aa.length-1 ; i++ ) {
			for(int j = i+1 ; j<aa.length ; j++) {
				if (nums[i]>nums[j])
						tamp=nums[i];
						nums[i]=nums[j];
						nums[j]=tamp;
			}
		}
		return aa;
	}
}