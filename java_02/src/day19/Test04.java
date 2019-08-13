package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Test04 {
	public static void main(String[] args) {
		// HashMap map 구조를 이용하여 employee 클래스 관리
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

//		Employee[] emp = {
//				new Employee(2017002,"김씨","마케팅부")
//		};
		
		map.put(2017002, new Employee(2017002, "김씨", "마케팅부"));
		map.put(2017003, new Employee(2017003, "김씨", "마케팅부"));
		map.put(2017004, new Employee(2017004, "홍씨", "영업부"));
		map.put(2017005, new Employee(2017005, "박씨", "마케팅부"));
		map.put(2017006, new Employee(2017006, "김씨", "영업부"));
			
		// 사원 조회 사번을 입력 하세요.
		System.out.println(" 2017003 사번의 사원 조회 내역");
		System.out.println(map.get(2017003));
		
		// 마케팅부 사원 목록 출력
		System.out.println(" 마케팅부 사원 목록 출력");
		
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer name = it.next();
			Employee emp = map.get(name);
			if(emp.dept.equals("마케팅부")) {
				System.out.println(emp);
			}
		}
		
		// 사원 사번기준 삭제
		System.out.println("2017002 사번의 사원 삭제.");
		System.out.println("삭제 정보 : "+map.remove(2017002));
		System.out.println("2017002 사원 정보 =>"+map.get(2017002));
		System.out.println("삭제 정보 : "+map.remove(2017002));
		
	}

}
