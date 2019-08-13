package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test07 {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(201702,"김씨","영업부"));
		list.add(new Employee(201703,"박씨","기술부"));
		list.add(new Employee(201704,"이씨","기술부"));
		list.add(new Employee(201705,"최씨","마케팅부"));
		list.add(new Employee(201705,"박씨","마케팅부"));
		list.add(new Employee(201705,"최씨","기술부"));
		
		System.out.println("****** Iterator 기반 목록 출력 ******");
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee data = it.next();
			System.out.println(data);
			
		}
		System.out.println();
		//foreach 기반 목록 출력
		System.out.println("**** foreach 기반 목록 출력 ****");
		list.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee t) {
				System.out.println(t);
			}
			});
		System.out.println();
		// foreach 형식을 람다 방식으로 표현
		System.out.println("***** foreach 람다 1 ******");
		list.forEach(
			(Employee t) -> {
				System.out.println(t);
			}
		);
		System.out.println();
		System.out.println("***** foreach 람다 2 ******");
		list.forEach(t -> System.out.println(t));
		System.out.println("***** foreach 람다 3 ******");
		list.forEach(System.out::println);
	}

}
