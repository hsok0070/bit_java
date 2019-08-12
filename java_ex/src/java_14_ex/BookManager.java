package java_14_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class BookManager {

//	private Book[] booklist ;
//	int count = 0;
	
	//List<Book> list = null;
	List<Book> list = null;
	//List<Book> list = null;

	public BookManager() {
		 list = new ArrayList<Book>();
//		 list = new Vector<Book>();
//		 list = new LinkedList<Book>();
//		위 3가지 전부 호환 가능.		 
	}
	
	public BookManager(List<Book> list) {
		this.list = list;
		
	}

//	public Book[] getBooklist() {
//		return booklist;
//	}


	public void addBook(Book book) {
			list.add(book);
			
		}
	
	
	public void searchTitleBook(String title) {
		System.out.println((title + "검색"));
		Iterator<Book> it = list.iterator();
				while (it.hasNext()) {
					Book data = it.next();
					if(data.getTitle().toUpperCase().contains(title.toLowerCase())) {
						System.out.println(data);
					}
				}
	}
//	public void DeleteBook(Book book) {
//		for (int i=0 ; i<count; i++)
//		booklist[count] = book;
//		count --;
//	}
	public void DeleteBook(String title) {
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().equals(title)) {
				System.out.println(data+" => 삭제 됩니다.");
				it.remove();
				
			}
		}
	}
	public void bookListPrint() {
		System.out.println(" ====== Book List ======");
		list.forEach(i->System.out.println(i));
		System.out.println("=========================");
	}

	
}


