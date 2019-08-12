package util;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MyUtil {

		public static long add(int a , int b) {
			return a+b;
		}
		
		public static double add(double a, double b) {
			return a+b;
		}
		
		public static double add(double a, double b, double c) {
			return a+b+c;
		}
		
		//가변인자 , 제일 마지막 위치만 허용
	
	
	  public static double add (double ... nums) { // [] (배열처리)
	  
	  double sum=0;
	  
	  for (double data : nums) { 
	  
	  sum += data;
	  
	    }
	  
	  return sum; 
	  }
	  // 숫자를 넘겨 받아 가장 큰수를 리턴하는 함수 max
	  
	  public static int max (int ... nums) {
		  int max = Integer.MIN_VALUE; // Integer.MIN_VALUE 가장 작은 값.
		  for(int data:nums) { // : 대입연산자
			  if(max < data) max = data;
			  
		  }
		  	return max;
		  }
	  
	  // leftPad 함수 //
	public static String leftPad(String str, int size, char padChar) {
		if (str.length() > size) {
			return str;
		}
		int count = size - str.length();
		for (int i = 0; i < count; i++) {
			str = padChar + str;
		}
		return str;
	}
	

	  // rightPad 함수 //
	  
	public static String rightPad(String str, int size, char padChar) {
		if (str.length() > size) {
			return str;
		}
		int count = size - str.length();
		for (int i = 0; i < count; i++) {
			str = str + padChar;
		}
		return str;
	}
	   
}
	 
	 
	 
	
/*
 * public static double add (double[] a) { double sum=0;
 * 
 * for (double data : a) { sum += data;
 * 
 * }
 * 
 * return sum; }
 * 
 * }
 */


 
 