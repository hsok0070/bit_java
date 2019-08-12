package java_05_ex;

public class Test1 {

	boolean live;
	int age;
	String name;
	
	public void dispaly( ) {
		System.out.println(name+" : "+age+" : "+live);
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
