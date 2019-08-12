package day06;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int num;
		String name;
		
		new Tv();
		
		Employee emp1 = new Employee();
		System.out.println(emp1.age + ":" + emp1.name + ":" + emp1.dept);
		
		Employee emp2 = new Employee();
		emp2.age = 201901;
		emp2.name = "홍길동";
		emp2.dept = "인사부";
		System.out.println(emp2);
		System.out.println(emp2.age + ":" + emp2.name + ":" + emp2.dept);
		Employee emp3 = new Employee();
		emp3.age = 201907;
		emp3.name = "김민우";
		emp3.dept = "개발부";
		System.out.println(emp3);
		System.out.println(emp3.age + ":" + emp3.name + ":" + emp3.dept);
	}

}
