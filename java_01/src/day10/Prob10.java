package day10;

public class Prob10 {
	public static void main(String [] args) {
		
		new Student("홍길동",26,200201).print();
		new Teacher("이순신",30,"JAVA").print();
		new Employee("유관순",40,"교무과").print();
		
		
	}

}



class Person {
	private String name;
	private int age;
	
	
	public Person( ) {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name ;
		this.age = age ;
		//this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age ;
		
	}
	public void printA() {
		System.out.printf("이름 : %s 나이 : %d",getName(),getAge());
	}
}

class Student extends Person {
	private int id;
	
	public Student () { super(); }
	
	public Student(String name, int age, int id) {
		super(name,age);
		this.id = id;
		

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		super.printA();
		System.out.printf("학번 : %d %n",id);
	}
}

class Teacher extends Person {
	private String subject;
	
	public Teacher() {
	
}
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject=subject;
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void print() {
		super.printA();
		System.out.printf("담당과목 : %s %n",subject);
	}
}
class Employee extends Person {
	private String dept;
	
	public Employee( ) {super();}
	
	public Employee(String name, int age, String dept) {
		super(name,age);
		this.dept=dept;
	}
	
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		super.printA();
		System.out.printf("부서 : %s %n",dept);
	
	}
	
}