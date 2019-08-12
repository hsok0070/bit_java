package day11;

import day10.Animal;

public class Fish extends Animal {
	
	private String name ;
	
	public Fish() {
		super();
	}
	
	public Fish (String name) {
		super("물고기");
		this.name = name;
	}
	
	public String getName() {
		return name;		
	}
	
	public void setName(String name) {
		this.name = name ;
				
	}
	
	public void fishPrint() {
		System.out.printf("[%s : %s] %n",kind,name);
	}
	
	//메소드 오버라이딩
	@Override // 오버라이딩 확인.
	public void breath() {
		System.out.println(kind+" : 아가미로 숨쉬기 ~~~");
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("[%s]",name);
	}
}
