package day18_collection;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		Student[] s = new Student[10];
		
		Student[] ss = {
				new Student("말순이",64,75),
				new Student("딤순이",23,67),
				new Student("김순이",45,62),
				};
		
		List<Student> list = new ArrayList<Student>();
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
class Student extends Object implements Comparable<Student>{
	String name;
	int ko;
	int math;
	double avg;

	public Student() {}
	
	public Student (String n, int k , int m) {
		name = n;
		ko = k;
		math = m;
		setAvg();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = (ko+math)/2.;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		//return (int)(avg - o.avg);
		return name.compareTo(o.name);
	}
  } 


