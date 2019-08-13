package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BookTest {
	public static void main(String [] args) {
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("c://lib//sample.txt"));
			// .txt파일 내용 출력
			while(scanner.hasNextLine()) {
				String[] data = scanner.nextLine().replace('_','/').split("/");
				//System.out.println(Arrays.toString(data));
				Book book = null;

				Book b1 = new Book(data[0], Integer.parseInt(data[1]));

				System.out.println(b1);
			}//
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
		try {
		Book b1 = new Book("java", 90000);
		System.out.println(b1);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("END");
	}
}	
	

