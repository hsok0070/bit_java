package day06;

import java.util.Arrays;

public class Test04 {
	public static void main(String[]args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Null");
		emp1.setDept("Null");
		//System.out.println(emp1.getName()+emp1.getDept());

		Employee emp2 = new Employee();
		emp2.setAge(27);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		
		Employee emp3 = new Employee();
		emp3.setAge(27);
		emp3.setName("고길동");
		emp3.setDept("영업부");
		emp3.setSingle(true);
		
		Employee emp4 = new Employee();
		emp4.setAge(28);
		emp4.setName("김민우");
		emp4.setDept("개발부");
		emp4.setSingle(true);
		
		Employee[] emp = {emp1,emp2,emp3,emp4};
		System.out.println(Arrays.toString(emp)); // 배열 주소값 확인.
		System.out.println(emp);
		
		System.out.println("== 영업부에 근무하는 사원 목록 ==");
		double sum = 0 ;
		int count = 0;
		for (int i=0; i<emp.length; i++) { //Employee data : emp
			if (emp[i].getDept() !=null && emp[i].getDept().equals("영업부")) { //data.getDept().equals("영업부")
			sum += emp[i].getAge();
			count ++;
			emp[i].display();
				//data.display();
		}
		
	}
		System.out.println("== single인 사원 목록 ==");
		for (int i=0 ; i<emp.length ; i++) {
			//System.out.println(emp[i].isSingle());
			if (emp[i].isSingle()) {
			emp[i].display();
		}
  }
		System.out.printf("영업부 평균 나이 :", (int)sum/count);
	}

}