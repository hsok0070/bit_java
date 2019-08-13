package day16;

import java.io.IOException;

public class Test04 {
	public static void main (String[] args) {
		System.out.println(" main start");
		int jumsu = 500;
		
		//new RuntimeException(" 에러 발생 ");
		try {
			if (!(jumsu >=0 && jumsu <=100)) 
			throw new IOException(" jumsu가 유효하지 않습니다. ");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			
		}finally {
			
		}
		//System.out.println(" main end");
	}

}
