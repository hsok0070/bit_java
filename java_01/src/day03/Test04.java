package day03;

public class Test04 {

	public static void main(String[] args) {
		int i;
		for (i = 1; i < 10; i++) {
			System.out.println("Hello java"+i);
		}
		System.out.println(i);
		
		int j = 10;
		while(j>0) {
			System.out.println("while" + j);
			j--;
		}
			boolean flag = true;
			while(flag) {
				j++;
				System.out.println("~~~~~~~"+j);
				if(j==5) flag = !flag;
			}
			
		while(j<5) {
			System.out.println("do while"); // 동작안함
		}
		
		do {
			System.out.println("do while"); // 동작함
			
		}while(j<5);
		
		
	}

	}


