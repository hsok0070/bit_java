package day19;

import java.util.Scanner;

public class Test05_Command {
	public static void main(String[] args) {
		
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command insert = new InsertCommand();
		Command select = new SelectCommand();
	
		//String cmd = args[0]; // 위 변수중 하나 대입.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert,update,select,delete중 하나 입력.");
		String cmd = scanner.nextLine();
		switch(cmd) {
			case "insert" :
				insert.exec();
				break;
			case "update" :
				update.exec();
				break;
			case "select" :
				select.exec();
				break;
			case "delete":
				delete.exec();
				break;
				
				default:
					System.out.println("잘못입력했습니다.");
					break;
		}
			
		}
		
}
