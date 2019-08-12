package java_05_ex;

public class Animal {
	private boolean live ;
	private int age;
	private String name;
	
	public void display() {
		System.out.printf("나이 :%d , 이름 :%s , 생존여부 :%b ",this.age,this.name,this.live);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public boolean isLive() {
		return live;
				
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main (String[] args) {
		Animal a = new Animal();
		a.name = "~~~~"; // instance varable
		a.display(); // instance method
	}
}
