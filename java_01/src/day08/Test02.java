package day08;

public class Test02 {
	public static void main(String[] args) {
		
		Student[] students = {
				 new Student ("홍길동",2019001,75,92,73),
				 new Student ("김길동",2019002,60,69,53),
				 new Student ("이길동",2019003,30,39,33)
		};
			for (Student data : students)
		//if (data.getGrade() == 'F') {
					data.print();
				
				}
		
		
	}
//}
		

class Student {
	private String name ;
	private int number;
	private int kor ;
	private int eng ;
	private int math ;
	private char grade;
	
	public Student (String name,int number,int kor,int eng,int math) {
		this.name = name ;
		this.number = number ;
		this.setKor(kor);
		//this.kor = kor ;
		this.setEng(eng);
		//this.eng = eng ;
		this.setMath(math);
		//this.math = math;
	}
	public Student (String data) {
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		if(!check(kor)) return;
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		if(!check(eng)) return;
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		if(!check(math)) return;
		this.math = math;
	}


	public char getGrade() {
		this.setGrade();
		return grade;
	}


	private void setGrade() {
		double avg = (int)(kor+eng+math)/3.;
		this.grade = avg>=90 ? 'A':(avg>=80 ? 'B':(avg>=70?'C':(avg>=60 ?'D':'F')));
	}
	
	
	private boolean check (int num) {
		boolean flag = true ; 
		
		if (!(num>=0 && num<=100)) {
			System.out.println(num+"점수가 유효하지 않습니다.");
			flag = false;
			}
		return flag;	
	}
	
	public void print() {
		System.out.printf("이름 : %s, 평균 :%.0f, 등급: %c\n",name,(kor+eng+math)/3.,this.getGrade());
	}
	
}