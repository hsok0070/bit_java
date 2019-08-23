package Test;

 class SuperClass {
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("super Object");
	}

}

class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw();
		
	}
	void draw () {
		System.out.println("sub Object");
	}
}

public class Test08{
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		
		ex.paint();
		
	}
}
