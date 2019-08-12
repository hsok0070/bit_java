package day06;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		int num;
		String name;
		
		new Tv();
		Employee emp1 = new Employee();
		emp1.display();
		
		Employee emp2 = new Employee();
		//emp2.age = 201901;
		emp2.setAge(-201901);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		//emp2.name = "홍길동";
		//emp2.dept = "인사부";
		
		emp2.display();
		
		Employee emp3 = new Employee();
		//emp3.age = 201907;
		emp3.setAge(201907);
		emp3.setName("김민우");
		emp3.setDept("개발부");
		emp3.setSingle(true);
		//emp3.name = "김민우";
		//emp3.dept = "개발부";
		emp3.display();
		
	}

}
