package day04;

public class Test02 {
	public static void main(String[] args) {	
	   for (int j = 0 ; j<5 ; j++) {
		// System.out.println("j="+j);
		  for (int i=0 ; i<j+1 ; i++) {
		//System.out.print("i=" + i);
		System.out.print('*');
	    }
		System.out.println();
	   }
	   
	   for (int j = 0 ; j<5 ; j++) {
			  for (int i=5 ; i>j+1 ; i--) {
			System.out.print('*');
		    }
			System.out.println();
	   }
	}
}