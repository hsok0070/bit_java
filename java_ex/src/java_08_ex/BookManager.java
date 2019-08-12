package java_08_ex;

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
	public void DeleteBook(String title) {
		for (int i=0; i<count ;i++) {
			if(booklist[i].getTitle().equals(title)) {
				System.arraycopy(booklist, i+1, booklist, i, count-i-1);
				count --;
				System.out.println(title+" 삭제되었습니다.");
				return;
			}
		
		}
//		booklist[count] = book;
//		count --;
	
	}
	public void searchTitleBook(String title) {
		System.out.println(title+"검색");
//			for (int i = 0 ;i<booklist.length ;i++)
			for (Book data : booklist) {
				if(data == null)return;
				if(data !=null && data.getTitle().toUpperCase().contains(title.toUpperCase())) {
					data.print();
				}
			}
		
		
		System.out.println("------------------------------------");
	}
	public void bookListPrint() {
		System.out.println("====== Book List ======");
		for (int i=0 ; i <count ; i++) {
			booklist[i].print();
		}
		System.out.println("총 " + count + " 권");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public int bookprice() {
		int sum = 0 ;
		for (int i=0 ; i < count ; i++) {
			sum += booklist[i].getPrice();
			
		}
		return sum;
	
	}
}

