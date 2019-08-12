package day10;

public class CellPhone {
	String model;
	String number;
	int chord;
	
	
	public CellPhone () {
		super();
	}
	
	public CellPhone(String model, String number, int chord) {
		this.model = model;
		this.number = number ;
		this.chord = chord ;
	}
	
	
	public CellPhone(int size) {
		
	}
	
	public void setNumber(String n) {
		number = n;
		
	}
	
	public String getmodel() {
		return model;
	}
	
	
	public String getnumber() {
		return number;
	}
	
	public int chord() {
		return chord;
	}
	
}
