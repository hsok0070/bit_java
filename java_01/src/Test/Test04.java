package Test;

import java.util.Properties;

class Test04{	
	public boolean sosu(int num) {
		
		if(num == 1) {
			return false;
		}
		
		for(int i = 2 ; i<num ; i++) {
			if(num%i == 0) {
				return false;
			}
			
		}
		return true;
		
	}
	
}
	
	
	class Test05{
	public static void main(String [] args) {
		Properties
		Test04 test = new Test04();
		
		for (int i=1 ; i<=10 ; i++)
			if(test.sosu(i)) {
				System.out.println(i);
			}
	}
}

	


