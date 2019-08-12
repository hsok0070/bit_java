package java_11_ex;

public abstract class Shape {
	private int numSides;

	public Shape() {super();}
	
	public Shape(int numSides) {
	super();
	this.numSides = numSides;
	}
	
	public void setNumSides() {
		this.numSides=numSides;
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	public abstract double getArea() ;
	
}
