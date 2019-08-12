package java_14_ex;

import java.util.Scanner;

public class BookApp {
	static int number;
	
	public static void main(String[] args) {
		
		//BookManager mgr = new BookManager(10);
		BookManager2 mgr = new BookManager2();
		Scanner input = new Scanner(System.in);
	
		while(true) {
//		System.out.println("****** 명령 선택 ******\n1.insert(등록)\n2.delete(삭제)\n3.목록 출력\n"
//				+ "4.quit(종료)\n***********************\n수행할 명령어를 선택하세요!\n1 2 3 4 중 하나를 선택하세요..");
		
		  System.out.println("****** 명령 선택 ******\n");
		  System.out.println("1.insert(등록)\n"); System.out.println("2.delete(삭제)\n");
		  System.out.println("3.목록 출력(출력)\n"); System.out.println("4.quit(종료)\n");
		  System.out.println("*********************\n");
		  System.out.println("수행할 명령어를 선택하세요!\n1 2 3 4 중 하나를 선택하세요..\n");
		 	
		
		// num = input.extInt()+"";
		// input.nextLine();
		// num = scanner.nextLine().trim();
		
		String num = input.nextLine();

		switch (num.trim()) {
		case "1":
			System.out.println("등록하세요.");
			System.out.println("Book title입력하세요.");
			String title = input.nextLine();
			
			System.out.println("Book 가격 입력하세요.");
			int price = input.nextInt();
			
			input.nextLine();
			mgr.addBook(new Book(++BookApp.number,title,price));
			break;
		
		case "2":
			System.out.println("삭제하세요.");
			System.out.println("Book title 입력하세요.");
			String title1 = input.nextLine();
			input.nextLine();
			System.out.println("삭제가 완료되었습니다.");
			//mgr.DeleteBook(new Book(title,price));
			mgr.DeleteBook(title1);
			break;
		
		case "3":
			System.out.println("목록.");
			mgr.bookListPrint();
			break;
		
		case "4":
			System.out.println("정말 종료?");
//			 string quit = scanner.nextLine().trim();
//			 if(quit.equals("q") || quit.equals("Q") 
			System.out.println("종료.");
			input.close();
			input = null;
			return; // 현재의 함수 종료 의미
			//System.exit(0);

		//break;
		
			default:
				System.out.println("잘못된 값을 입력했습니다.");
				break;
		 }
	  }
	}
}