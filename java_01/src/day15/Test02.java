package day15;

public class Test02 {
	public static void main(String[] args) {
		A a = new A();
		//a.p();
		
		A.B b = new A("AA").new B();
		b.print();
		
//		A.C c = new A().new C();
//		c.print();
		A.C.print();
		//C.print();
	}

}
class A{
	String name = "A";
	
	public A () {};
	
	public A (String n) {
		name = n ;
	
	}
	
	
	void p() {
		System.out.println("A 에서 호출");
		new B().print();
	}
	
	
	class B{
		String name = "B";
		   //A a; 
			void print() {
				System.out.println(this.name);
				System.out.println(A.this.name);
			}
 }
	static class C{
		static void print() {
			System.out.println("~~~~~~~~~~");
		}
	}
	class D {
		void p() {
			class E{
		}
	}
 }
}
