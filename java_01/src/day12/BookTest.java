package day12;

public class BookTest {
	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1.toString());
		//System.out.println(msg1.equals(msg2));
		System.out.println(msg2);
		
		
		NewBook b1 = new NewBook(2200,"java");
		NewBook b2 = new NewBook(2200,"java");
		System.out.println(b1.toString());
		System.out.println(b1.equals(b2));
		System.out.println(b2);
		
		b1.close();
		b2.close();
		b1 = null;
		b2 = null;
		
		
		System.gc();
		System.out.println("=== main end ===");
	}

}
