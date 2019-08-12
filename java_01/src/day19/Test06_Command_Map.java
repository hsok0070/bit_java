package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test06_Command_Map {
	public static void main(String[] args) {
		//Map구조
//		Command delete = new DeleteCommand();
//		Command update = new UpdateCommand();
//		Command insert = new InsertCommand();
//		Command select = new SelectCommand();
		
	
	
//		String cmd = args[0]; // 위 변수중 하나 대입.
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert,update,select,delete중 하나 입력");
		String cmd = scanner.nextLine(); // 위 변수중 하나 대입.
		Map<String, Command> map = new HashMap<String, Command>();
		
		map.put("delete", new DeleteCommand());
		map.put("select", new SelectCommand());
		map.put("insert", new InsertCommand());
		map.put("update", new SelectCommand());
		map.put("new", new Command() {
			
			@Override
			public void exec() {
				System.out.println("기능 추가");
			}
		});
		
//		map.get(cmd).exec();
		
		Command command = map.get(cmd);
		if(command != null) command.exec();
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("insert,update,select,delete중 하나 입력.");
//		String cmd = scanner.nextLine();
//		switch(cmd) {
//			case "insert" :
//				insert.exec();
//				break;
//			case "update" :
//				update.exec();
//				break;
//			case "select" :
//				select.exec();
//				break;
//			case "delete":
//				delete.exec();
//				break;
//				
//				default:
//					System.out.println("잘못입력했습니다.");
//					break;
//		}
			
		}
		
}

