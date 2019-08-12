package java_09_ex;

public class Employee extends Person {

	private String dept ;
	
	public Employee () {
		super ();
	}
	
	public Employee(String name, int age, String dept) {
		super(name,age);
		this.dept = dept ;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void eprint () {
		
		System.out.printf("[이름 :%s 나이 :%d 부서:%s]%n",super.getName(),super.getAge(),this.dept);
	}
	
	
}