package day10;

public class Dog extends Animal{

	private String kind = "강아지 종류";
	private String name = "강아지 이름";
	
	public Dog() {
		super("강아지과");      // super()
	}
		
	public Dog(String kind, String name) {
		super("강아지과");
		this.kind = kind;
		this.name = name;
		
	}
	
	public Dog(String superkind,String kind, String name) {
			super(superkind);
			//super.kind = superkind;
			this.kind = kind ;
			this.name = name ;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void dogprint() {
		System.out.printf("[%s:%s:%s]\n",super.kind,this.name,this.kind);
	}
	
	public String getSuperKind() {
		return super.kind;
	}
	@Override
	public void breath() {
		System.out.println(kind+"폐로 숨쉬기~~");
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("[%s,%s]%n",this.name,this.kind);
	}
	
}
