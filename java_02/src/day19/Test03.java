package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Test03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("java01", "1234");
		map.put("java02", "1234");
		map.put("admin", "admin");
		map.put("test01", "test");
		
		for(int i = 0 ; i < 30 ; i++) {
			map.put("test"+i, (int)(Math.random()*3)+"aa");
		}
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(" 로그인 처리 ");
			System.out.println("ID/PW 형식으로 입력해주세요.");
			String data = scanner.nextLine();
			String[] idpw = data.split("/");
			String id = idpw[0];
			String pw = idpw[1];
//			if (map.containsKey(idpw[0])) {
			if (map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("재로그인 해주세요.");
				}
				
			}else {
				System.out.println("존재하지 않는 ID 입니다.");
				System.out.println("회원가입 후 이용해주세요.");
			}
			
		}
		System.out.println("서비스 이용 가능.");
	}
		
}
