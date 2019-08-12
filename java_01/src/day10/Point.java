package day10;

public class Point {
	int x , y;

	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void print () {
		System.out.printf("Point(x:%d, y:%d)\n",x,y);
		
	}
	
//	public void print (int x, int y) {
//		System.out.println("좌표");
//		
//	}
	
	
	}

