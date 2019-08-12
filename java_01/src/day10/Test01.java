package day10;

public class Test01 {

	public static void main (String[] args) {
		System.out.println("Java progRaming".equals("java programing"));
		System.out.println("---------------------------1");
		System.out.println("Java progRaming".equals("JAVA programing"));
		System.out.println("---------------------------2");
		System.out.println("Java progRaming".equalsIgnoreCase("java programing"));
		System.out.println("---------------------------3");
		System.out.println("Java progRaming".equalsIgnoreCase("JAVA programing"));
		System.out.println("---------------------------4");
		System.out.println("Java progRaming".contains("JAVA"));
		System.out.println("---------------------------5");
		System.out.println("Java progRaming".toLowerCase().contains("JAVA"));
		System.out.println("---------------------------6");
		System.out.println("Java progRaming".toLowerCase().contains("JAVA".toLowerCase()));
		
		
	}
}
