package day17;

public class Test02 {
	public static void main(String[] args) {
		
		Book b1 = new Book("java", 10000); // 생략하고 객체를 만들면 => (Object타입을 갖는다.)
		if(b1.getTitle() instanceof String)
		System.out.println(((String)(b1.getTitle())).charAt(0));
//		Book<String, Integer> b1 = new Book<String, Integer>("java", 10000);
//		System.out.println(b1.title.charAt(0));
		
		
		
		Book<String, Integer> b2 = new Book<String, Integer>("sql",900);
		System.out.println(b2);
		
		Book<?, Integer> b3 =new Book<String, Integer>("String",400);
		System.out.println(b3.getTitle()); // ? -> Object 
		
		Book<?, ? extends Number> b4 =new Book<String, Integer>("String",400);
		System.out.println(b4.getPrice()); // ? -> Number Number의 자식
		
		Book<?, ? super Number> b5 =new Book<String, Object>("String",400);
		System.out.println(b4.getPrice()); // ? -> Object Number의 부모
	}

}
