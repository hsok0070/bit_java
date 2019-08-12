package java_11_ex;

public class RectTriangle extends Shape {
	private double width, height;
	
	public RectTriangle () {super();}
	
	public RectTriangle (double w, double h) {
			super();
			width = w;
			height = h;
		
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth() {
		this.width=width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight() {
		this.height=height;
	}
	
	@Override
	public double getArea() {
		return width * height /2;
	}
	
	
}
