package java_02_ex;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	String cmd ;
	Scanner input = new Scanner(System.in);
	System.out.println("번호선택");
	cmd = input.nextLine();
	
	switch (cmd) {
	case "1":
		System.out.println("등록 해주세요.");
		break;
	case "2":
		System.out.println("삭제 해주세요.");
		break;
	case "3":
		System.out.println("수정 해주세요.");
		break;
	case "4":
		System.out.println("정말 종료 하시겠습니까? q/Q");
		String quit=input.nextLine().trim();
		if(quit.equals("q") || quit.equals("Q")) {
		System.out.println("종료");
		input.close();
		input=null;
		return;	
	    }
		
	}
 }
}
