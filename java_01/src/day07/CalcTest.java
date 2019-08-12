package day07;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c1 = new calc();
		System.out.println(c1.add(11, 99));
		calc c2 = new calc();
		calc c3 = new calc();
		calc c4 = new calc();
		calc[] c = {c1,c2,c3,c4};
		
		//c1.add(11, 99);
		//System.out.println(c1.add(11, 99));
		System.out.println(c1.sub(11, 99));
		System.out.println(c1.multi(11, 99));
		System.out.println(c1.mod(11, 99));
	}

}
