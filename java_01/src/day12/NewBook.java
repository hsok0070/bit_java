package day12;

public class NewBook {
	
	String title;
	int price;
	
	
	public NewBook() { }
	
	public NewBook(int price, String title) {
		super();
		this.price = price;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book정보 / title:");
		sb.append(title);
		sb.append(", 가격:");
		sb.append(price);
		return sb.toString();
		//return "Book정보 / title:"+title+", 가격:"+price;
	}

	@Override
		public boolean equals(Object obj) {
		boolean flag = false;
		if(obj == null || !(obj instanceof NewBook)) {
			return false;
		}
		NewBook data = (NewBook)obj;
		if(price == data.price && title.equals(data.title)) {
			flag = true;
			
		}
		return flag;
	}
	
	@Override
	protected void finalize() throws Throwable {
		//객체가 소멸되기 직전에 호출되는 메소드 이지만 자바에서는 사용안하고 
		//별도의 자원 반납 기능을 만들어 사용한다. ex) close()
		System.out.println("자원 반납 코드");
	}
	
	public void close() {
		System.out.println("close()   자원 반납 코드");
	}
}

	