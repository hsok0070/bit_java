package Test;

import java.util.Scanner;

public class Test02 {	
	public static void main(String[] args) {
		
		int a , b ;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a<b) {
			for(int i = a ; i<=b ; i++) {
				sum += i;
			}
				System.out.println(sum);
			}
			
			else if (a>b) {
				for(int i = b ;i<=a ; i++ ) {
					sum +=i ;
				}
				System.out.println(sum);
			}else {
				sum = a;
				System.out.println(sum);
				}
		}
}
		
		
		
	

	


