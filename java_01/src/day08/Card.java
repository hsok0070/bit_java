package day08;

public class Card {

	final static int WIDTH = 100; // 상수값으로 수정 불가// 공유 자원 (모든 카드의 사이즈는 고정 ) // 클래스 variable
 	final static int HEIGHT = 250; 
	String kind = "다이아몬드"; // 인스턴스  variable
	int number ; 
	
	public static void main(String[] args) {
		System.out.println(WIDTH+" * "+HEIGHT); // static 자원으로 메모리 생성 되어 있기때문에 바로 출력 가능. 
		System.out.println(new Card().kind); // new 함수로 객체 생성 후 출력. 
	}
}
