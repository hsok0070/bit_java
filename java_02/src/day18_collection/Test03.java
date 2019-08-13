package day18_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03 {
	public static void main(String[] args) {
		Student[] s = new Student[10];
		
		Student[] ss = {
				new Student("말순이",64,75),
				new Student("딤순이",23,67),
				new Student("김순이",45,62),
				};
		
		Vector<Student> list = new Vector<Student>(5,10);
		System.out.println("Capecity :"+list.capacity());
		System.out.println("size :"+list.size());
		list.add(new Student("홍순이",89,99));
		list.add(new Student("말순이",64,75));
		list.add(new Student("딤순이",23,67));
		list.add(new Student("김순이",45,62));
		//System.out.println(list);
	
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student data = it.next();
			if(data.getAvg() >= 90)
			System.out.println(data);
		}
		System.out.println(list.contains(new Student("고순이",80,91)));
		
		//list.add(new Student("홍길동",60,43));
		
		Student s1 =new Student("홍길동",90,90);
		boolean flag = list.add(s1);
		if(flag) {
			System.out.println(s1+ "등록되었습니다.");
		}else {
			System.out.println(s1+"등록실패되었습니다.");
		}
		
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
		if(data.name.equals("홍길동"))
			data.ko = 100;
			data.math = 100;
			data.setAvg();
			System.out.println("수정되었습니다.");
	}
		it = list.iterator();
		while(it.hasNext()) {
			Student data =it.next();
				System.out.println(list);
				
			}
		it = list.iterator();
				Student data = it.next();
				while (it.hasNext()) {
				if (data.equals(s1));
				it.remove();
				System.out.println(s1+"삭제되었습니다.");
				
			}
				Collections.sort(list);
				
				it=list.iterator();
				while(it.hasNext()) {
					System.out.println(list);
				
		}
		
	}
}
