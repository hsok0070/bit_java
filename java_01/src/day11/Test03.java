package day11;

public class Test03 {
	public static int main(String[] arge) {
		Person p = new Person("고길동",22);
		
		Person s = new Student("홍길동",20,2019001);
		Employee e = new Employee("유관순",40,"교무과");
		Object o = new Teacher("이순신",30,"JAVA");
		Object msg = new String("hello java");
		
		//s.print();
		((Student)p).print();
		return 0;
	}

}
