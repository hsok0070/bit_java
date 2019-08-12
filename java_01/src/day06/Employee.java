package day06;

public class Employee {
	//데이터(변수) + 기능(메소드)
	
	private String name; // public = 다른 패키지에서도 사용가능.(공공적으로 사용가능)
	private String dept;
	private int age; // ex)201901
	
	private boolean single;
	
	public void display() {
	   System.out.printf("나이:%-10s,이름:%10s,부서:%10s,싱글 : %b\n",getAge(),getName(),this.dept,this.single);
		return;
		
	}
	
	public void setAge(int age) {
		if (!(age>0 && age <= 100)) {
			System.out.println("age(나이) 정보가 올바르지 않아.");
			return ;
			
		}
		this.age = age;
		return ;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}
		
}
