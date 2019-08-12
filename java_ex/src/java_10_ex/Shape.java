package java_10_ex;

public abstract class Shape {
	
//	private double area;
	protected double area;
	private String name;
	
	public Shape() { super();}
	
//	public Shape(String name,  double area) {
//		super();
//		this.name = name;		
//		this.area = area;
//	}
	public Shape(String name) {
		super();
		this.name = name;

	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void  calculationArea();
	
	
	public void print() {
		System.out.println(name + "의 면적은" + area);
	}

}
