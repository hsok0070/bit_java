package java_11_ex;

public class Rectangle extends Shape implements Resizable {
	private double width, height;
	
	public Rectangle () {super();}
	
	public Rectangle (double w, double h) {
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
		return (width * height) ;
	}
	@Override
	public void resize(double s) {
		width = width * s;
		height = height *s;
	}
}
