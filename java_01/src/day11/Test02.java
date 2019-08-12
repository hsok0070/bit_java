package day11;

public class Test02 {
	public static int main(String[] args) {
		Person[] p = {
						new Student("홍길동",26,200201),
						new Teacher("이순신",30,"JAVA"),
						new Employee("유관순",40,"교무과") 
		};
		for(Person data :p) {
			data.printA(); //부모Person() 영역의 자원들 접근할때는 접근 가능
			System.out.println();
			
		}
		System.out.println("================================");
		
		for(Person data:p) {
			//for에서의 캐스팅 (instanceof) 자식 영역의 자원을 접근할때는 다운 캐스팅 필요.
			//반드시 하단부에 어떤 객체가 바인딩 되어 있는지 타입 체크!
			if(data instanceof Student) ((Student)data).print();
			if(data instanceof Teacher) ((Teacher)data).print();
			if(data instanceof Employee) ((Employee)data).print();
		}
		return 0;
	}
	
}
