package java_03_ex;

public class Prob4 {
	public static void main (String[] args) {
		String sourceString = 
				"everyday we have is one more than we deserve";
				String encodedString = "";
				
				for (int i=0 ; i<sourceString.length() ; i++) {
				 char ch = sourceString.charAt(i);
				 	if (ch >= 'a' && ch <='w'   ) {
				 		encodedString += (char)(ch+3);
					}
				 	else if (ch >= 'x' && ch<='z') {
				 		encodedString += (char)(ch-23);
				 				
				 	}
				 	else {
				 		encodedString += ch ;
				 		
				 	}
				}
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : "  + encodedString);
				
				int sum = 0 ;
				int total = 0 ;
				for (int i=1 ; i<=10 ; i++) {
					sum += i;
					//System.out.println(sum);
							total +=sum;
							//System.out.println(total);
				}
				System.out.println(total);
						
				
	}
}
