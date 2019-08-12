package day09;

import java.io.Closeable;
import java.util.Scanner;

public class test {  

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num1+num2);
		
		String string = scanner.nextLine();
		int num = Integer.parseInt(string);
		
		System.out.println(string);
		
		scanner.close();
		
	}
}

