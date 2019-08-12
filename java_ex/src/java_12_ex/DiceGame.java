package java_12_ex;

public class DiceGame {
	public static void main(String[] args)  {
		DiceGame game = new DiceGame();
		int result1 = 0 ;
		int result2 = 0 ;
			

		try {
			result1 = game.countSameEye(10);
			result2 = game.countSameEye(-10);
		}catch(Exception e) {
			System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result1);
			System.out.println("면의 개수가 8개인 주사위 2개를 던쳐서 같은 눈이 나온 횟수 : " + result2);
			System.err.println(e.getMessage());
		}
		
			

		}


	int countSameEye(int n) throws Exception {
		int count = 0;
		if (n < 0) {
			throw new Exception("음수는 안됨.");
		}
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		
		for (int i = 0; i < n; i++) {
			int a = d1.play();
			int b = d2.play();
			System.out.printf("1번 : %d / ",a);	
			System.out.println("2번"+b);
			if (a == b) {
				count++;
			}

		}

//		for (int i = 0; i < n; i++) {
//			System.out.printf("1번 : %d / ",a);	
//			System.out.println("2번"+b);
//			if (d1.play() == d2.play()) {
//				count++;
//			}
//			
//		}
		return count;
	}
 
}

class Dice {

	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}
