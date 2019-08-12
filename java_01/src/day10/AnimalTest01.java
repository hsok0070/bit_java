package day10;

import java.util.Arrays;

public class AnimalTest01 {
	public static void main (String [] args) {
		
		
		Animal a1 = new Animal();
		a1.breath();
		
		Animal a2 = new Animal("Dog");
		a2.breath();
		
		Dog d1 = new Dog("시베리안허스키","케리");
		d1.breath();
		d1.dogprint();
		
		Dog d2 = new Dog("Dog","진돗개","케리") ;
		d2.breath();
		d2.dogprint();
		
		String animalkind = d2.getSuperKind();
		System.out.println(animalkind);
		
	}

}
