package day03;

public class Test02 {

	public static void main(String[] args) {
		int num = 99 ;
		
	//	System.out.println(num > 0 ? "양수" : "음수");
	//	System.out.println(num > 0 ? "양수" : (num==0 ? "0":"음수"));
		
		String result = num > 0 ? "양수" : (num==0 ? "0":"음수");
		System.out.printf("%s : %d", result,num);
		
	}

}
