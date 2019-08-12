package day14;

import java.io.IOException;
import java.nio.CharBuffer;

public class Test01 {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(4,4),3);
//		System.out.println(c1);
//		c1.move(1);
//		c1.toString();
//		System.out.println(c1);
//		c1.draw();
		
		Rectangle r1 = new Rectangle(new Point(11,11),3,7);
//		Rectangle r1 = new Rectangle(new Point(11,11),3,7);
//		System.out.println(r1);
//		r1.move(3);
//		r1.draw();
		
		Shape [] shapes = {c1,r1};
		for (Shape data : shapes) {
			System.out.println(data);
			System.out.println(data.area());
			data.move(3);
			data.draw();
			System.out.println(data);
		}
	}
	

}
