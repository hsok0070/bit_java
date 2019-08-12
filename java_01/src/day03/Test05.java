package day03;

public class Test05 {

	public static void main(String[] args) {
		int sum = 0;
		int sum4 = 0;
		for	(int i = 1 ; i<=10 ; i++){
			sum += i ;
			
			if(i%4 == 0) 
				sum4 += i ;
			
		}
		System.out.println(sum);
		System.out.println(sum4);
	}

}
