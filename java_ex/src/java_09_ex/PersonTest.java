package java_09_ex;

public class PersonTest {

	public static void main(String[] args) {
		

		Student s1 = new Student("홍길동",20,200102);
		s1.sprint();
		
		Teacher t1 = new Teacher("이순신",30,"java");
		t1.tprint();
		
		Employee e1 = new Employee("유관순",40,"교무과");
		e1.eprint();
	}

}
