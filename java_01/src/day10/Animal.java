package day10;

public class Animal {

	protected String kind = "동물의 종류";
	
	public Animal() {    }
	
	
	
	public Animal(String kind) {
		super();
		this.kind = kind ;
		
	}
	
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public void breath() {
		System.out.println(kind+"폐숨~~~~");
	}
	public void print() {
		System.out.println(kind+"Anamal : ");
	}
	
}