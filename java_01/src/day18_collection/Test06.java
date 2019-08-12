package day18_collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
		public static void main(String[] args) {
			
			Set<Employee> set = new TreeSet<Employee>();
		
			boolean flag = set.add(new Employee(201701,"홍씨","영업부"));
			if(flag) System.out.println("등록되었습니다.");
			
			System.out.println("사원 목록 ");
			flag = set.add(new Employee(20010701,"홍씨","영업부"));
			if(!flag) System.out.println("이미 존재하는 데이터입니다.");
			
		
			set.add(new Employee(201702,"김씨","영업부"));
			set.add(new Employee(201703,"박씨","기술부"));
			
			Iterator<Employee> it = set.iterator();
			while(it.hasNext()) {
				Employee data = it.next();
						System.out.println(data);
			}
			
			it = set.iterator();
			System.out.println("검색 결과입니다.");
			while(it.hasNext()) {
				Employee data = it.next();
				if(data.number == 201703) {
					System.out.println(data);
				}
				}
			

		}
}


