package java_14_ex;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;


public class BookManager2 {

//	private Book[] booklist ;
//	int count = 0;
	
	Map<Integer, Book> map =null;
	
	public BookManager2() {
		 map = new HashMap<Integer, Book>();
//		 list = new Vector<Book>();
//		 list = new LinkedList<Book>();
//		위 3가지 전부 호환 가능.		 
	}
	


//	public Book[] getBooklist() {
//		return booklist;
//	}


	public void addBook(Book book) {
		map.put(book.getIsbn(),book);
			
		}
	
	
	public void searchTitleBook(String title) {
		//Iterator<String> it = map.keySet().iterator();
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
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
		Iterator<Integer>it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer isbs = it.next();
			Book data = map.get(isbs);
			if(data.getTitle().equals(title)) {
				System.out.println(data + " 삭제됩니다.");
				//map.remove(isbs);
				it.remove();
			}
		}
				
			}
		
	
	public void bookListPrint() {
		System.out.println(" ====== Book List foreach 기반 ======");
		//list.forEach(i->System.out.println(i));
		
//		map.forEach(new BiConsumer<Integer, Book>() {
//
//			@Override
//			public void accept(Integer key, Book value) {
//				System.out.println(key + " : " + value);
//			}
		
			map.forEach((k,v) -> System.out.println(k + " : " + v));
			//list.forEach(i->System.out.println(i));
			
		System.out.println("=========================");
	}

	
}


