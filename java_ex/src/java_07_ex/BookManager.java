package java_07_ex;

public class BookManager {

	private Book[] booklist;
	
	int count=0 ;
	
	public BookManager() {
		
		this(10);
	}
	
	public BookManager(int size) {
		booklist = new Book[size];
		
	}
	
	public Book[] getBooklist() {
		return booklist;
	}

	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}

	public void addBook(Book book) {
		if (count == booklist.length) {
			Book[]copy = new Book[booklist.length*2];
			System.arraycopy(booklist, 0, copy, 0, booklist.length);
		}
		booklist[count] = book;
		count++;
			
	}
	public void printBooklist() {
		System.out.println("==== 책목록 ====\n");
	}
	public void printTotalPrice() {
		System.out.println();
	}

}

