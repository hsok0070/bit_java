package day04;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	System.out.println("알파벳 아스키 코드 값 확인");
	
	char a = 'a';
	char b = 'A';
	for (int i=0; i < 26;i++) {
		System.out.println(a+" : "+(int)a++ +","+b+" : "+(int)b++);
	}
		/*
		 * 변수ch에 저장된 문자가 대문자 인 경우에만 소문자로 변경하는 코드
		 */
	Scanner scanner = new Scanner(System.in);
	System.out.println("문자열을 입력하세요.");
	String msg = scanner.nextLine();
	
	for (int i = 0; i<msg.length() ; i++) {
	char ch = msg.charAt(i);
	char s = (ch>='A' && ch<='Z') ? (char)(ch+32) : ch ;
	//system.out.print(ch + " => " + a);
	System.out.print(s);
	//소문자 => 대문자
	//대문자 => 소문자
	}
	
  }
}
