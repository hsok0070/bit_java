package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Stream;

import javax.xml.stream.StreamFilter;

public class Test01 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);

		list.forEach(i -> System.out.print(i+" "));
		System.out.println();
	
		list.removeIf(i -> i%2 == 0);
		list.forEach(i -> System.out.print(i+" "));
		
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2017001, "홍길동", "영업부"));
		emp.add(new Employee(2018002, "고길동", "전산부"));
		emp.add(new Employee(2017011, "최길동", "인사부"));
		emp.add(new Employee(2019011, "이길동", "인사부"));
		
	//	emp.stream().filter(i->i.getNumber() > 2018001).count();
		emp.stream().filter(i -> i.getNumber() > 2018001).count();
		emp.stream()
		.filter(i ->i.getNumber() > 2018001)
		.forEach(i ->System.out.println(i));
	
		
		Employee[]  e = {
		new Employee(2017001, "홍길동", "영업부"),
		new Employee(2017002, "고길동", "전산부"),
		new Employee(2017011, "최길동", "인사부"),
		new Employee(2017011, "이길동", "인사부")
		};
	
		System.out.println(" === Array Stream 처리 ===");
		
		Stream.of(e)
		.filter(i -> i.getDept().equals("인사부"))
		.forEach(i->System.out.println(i));
		System.out.println("========================================");
		Stream.of(e).sorted().forEach(i->System.out.print(i));
		
//		Stream.of(e).sorted(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		}).forEach(i -> System.out.println(i));
//		}
	Stream.of(e)
	.sorted(( o1, o2) -> o1.getName().compareTo(o2.getName()))
	.forEach(i -> System.out.println(i));
}
}
