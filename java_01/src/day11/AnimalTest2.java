package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest2 {
	public static void main(String[] args) {
	Animal[] a = {	new Dog("진돗개","쫑이"),
					new Fish("구피"),
					new Dog("말티즈","댕댕이")
				};
//	for(Animal data : a) {
//		data.breath();
//		data.print();
//		
//	   }
	Dog a1 = new Dog("진돗개","쫑이");
	Fish f1 = new Fish("구피");
	callD(a1);
	callD(f1);
	callD(a[0]);
	callD(a[1]);
	
	
  }
	public static void callD(Dog d) {
		d.breath();
	}
	public static void callD(Fish d) {
		d.breath();
	}

	public static void callD(Animal d) {
		d.breath();
	}
}
