package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		System.out.println(" main start ");
		//Scanner scanner = new Scanner(new File("c://lib//sample.txt"));
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("c://lib//sample.txt"));
			// .txt파일 내용 출력
			while(scanner.hasNextLine()) {
				String[] data = scanner.nextLine().split("/");
				System.out.println(Arrays.toString(data));
			}//
			System.out.println("파일 준비 완료");
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(scanner != null)
				scanner.close();
				scanner = null;
				System.out.println("자원 반납 완료");
		}
		
		
		
		
		System.out.println(" main end");
		
		
	}

}
