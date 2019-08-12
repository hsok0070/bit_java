package day08;

public class BookManager {

	private Book[] booklist ;
	int count = 0;
	
	public BookManager() {
		
		this(10);
	}
	
	public BookManager(int size) {
		booklist = new Book[size];
		
	}
//	public Book[] getBooklist() {
//		return booklist;
//	}

	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}
	public void addBook(Book book) {
		if (count == booklist.length) {
			Book[] copy = new Book[booklist.length*2];
			System.arraycopy(booklist, 0, copy, 0, booklist.length);
			booklist = copy ;
		}
		booklist[count] = book;
		count++;
	}
	public void bookListPrint() {
		for (int i=0 ; i <count ; i++) {
			booklist[i].print();
		}
	}
	public int bookprice() {
		int sum = 0 ;
		for (int i=0 ; i < count ; i++) {
			sum += booklist[i].getPrice();
			
		}
		return sum;
	
	}
}

