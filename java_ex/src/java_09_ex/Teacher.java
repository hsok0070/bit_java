package java_09_ex;

public class Teacher extends Person  {

	private String subject ;
	
	
	public Teacher() {
		super();
	}
	public Teacher (String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
		
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void tprint() {
		System.out.printf("[이름 :%s 나이 :%d 담당과목 :%s]%n",super.getName(),super.getAge(),this.subject);
	}
}
