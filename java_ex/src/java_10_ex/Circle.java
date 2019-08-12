package java_10_ex;

public class Circle extends Shape {
	
	private double redius;

	
	
	
	public Circle(String name, double redius) {
		super(name);
		this.redius = redius;
	}
	
	

	public double getRedius() {
		return redius;
	}
	
	public void setRedius(double redius) {
		this.redius = redius;
		
	}
	
	@Override
	public void calculationArea() {
		area =redius * redius * Math.PI;
		
	}
	
}
