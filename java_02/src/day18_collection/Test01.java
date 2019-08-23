package day18_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		String[] names1 = {"이순신","김순신","박순신","강순신"};
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1); // 배열 sort 
		System.out.println(Arrays.toString(names1));
		
		List<String> list = new ArrayList<String>();
		list.add("김길동");
		list.add("고길동");
		list.add("홍길동");
		list.add("최길동");
		list.add("박길동");
		list.add("고길동");
		
		System.out.println(list);
		Collections.sort(list); // 콜렉션 sort
		System.out.println(list);
		
		List<String> list2 = new ArrayList<String>(list.subList(1, 2));
		System.out.println(list2);
		
	
		System.out.println(list);
	
		// 리스트를 오브젝트 배열로 변환
		Object[] obj = list.toArray(); // object 타입 다운캐스팅에 불편함;;
		System.out.println("obj ->"+Arrays.toString(obj));
		//
		
		// 리스트를 스트링 배열로 변환
		String[] obj2 = new String[list.size()];
		list.toArray(obj2);
		System.out.println("obj2 ->"+Arrays.toString(obj2));
		//
		
		//ss 배열을 list로 변환
		String[] sss = {"111","999","777","333"};
		List<String> sslist = new ArrayList<String>(Arrays.asList(sss));
		System.out.println(sslist);
		//
		
		System.out.println(" ===== list 다루기 =====");
		System.out.println(list);
		System.out.println(list.contains("홍길동"));
		
		for (String data : list) {
			System.out.println(data +"   ");
		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String data = it.next();
			if (data.equals("홍길동")) {
				System.out.println("삭제되었습니다.");
				it.remove();
			}
		}

		
		
		
	}
}

