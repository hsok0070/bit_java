package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal d = new Dog("진돗개","캐리");
		if(d instanceof Dog) ((Dog)d).dogprint();
		d.breath();
		
		Dog dd = (Dog) d;
		if (d instanceof Fish) {
			Fish ff = (Fish) d;
		}
		
//		Fish f = new Fish("쿠피");
//		
//		f.fishPrint();
//		f.breath();
		
		Animal f = new Fish("루피");
		if(f instanceof Fish) ((Fish)f).fishPrint();
		f.breath();
		((Fish)f).breath();
	
	}

}
