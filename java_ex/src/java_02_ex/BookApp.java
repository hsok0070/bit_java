package java_02_ex;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("****** 명령 선택 ******\n1.insert(등록)\n2.delete(삭제)\n3.update(수정)\n"
				+ "4.quit(종료)\n***********************\n수행할 명령어를 선택하세요!\n1 2 3 4 중 하나를 선택하세요..");
		/*
		 * System.out.println("****** 명령 선택 ******");
		 * System.out.println("1.insert(등록)"); System.out.println("2.delete(삭제)");
		 * System.out.println("3.update(수정)"); System.out.println("4.quit(종료)");
		 * System.out.println("*********************");
		 * System.out.println("수행할 명령어를 선택하세요!\n1 2 3 4 중 하나를 선택하세요..");
		 */	
		int num = input.nextInt();
		
		// num = input.extInt()+"";
		// input.nextLine();
		// num = scanner.nextLine().trim();
		
		switch (num) {
		case 1:
			System.out.println("등록하세요.");
			break;
		case 2:
			System.out.println("삭제하세요.");
			break;
		case 3:
			System.out.println("수정하세요.");
			break;
		case 4:
			System.out.println("정말 종료?");
			// string quit = scanner.nextLine().trim();
			// if(quit.equals("q") || quit.equals("Q") 
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