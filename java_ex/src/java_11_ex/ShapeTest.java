package java_11_ex;

public class ShapeTest {

	public static void main(String[] args) {
			
			Rectangle r1 = new Rectangle(5,6);
		
			RectTriangle r2 = new RectTriangle(6,2); 
						
			Shape[] s = {r1,r2};
			
			for(Shape data :s) {
				System.out.println("area :"+data.getArea());
				if(data instanceof Resizable) {
					
					((Resizable)data).resize(0.5);
					System.out.println("New area : "+data.getArea());
				}
					
					
				}
			}
	}
