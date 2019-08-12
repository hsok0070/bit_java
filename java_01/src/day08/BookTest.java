package day08;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		
		BookManager mgr = new BookManager(5);
		mgr.addBook(new Book("JAVA",20000));
		mgr.addBook(new Book("DB",10000));
		mgr.addBook(new Book("SQL",10000));
		mgr.addBook(new Book("Html",10000));
		mgr.addBook(new Book("SSL",10000));
		mgr.addBook(new Book("Hash",10000));
		
		mgr.bookListPrint();
	
		System.out.println("총합계 : " + mgr.bookprice());
			
//		System.out.println(Arrays.toString(mgr.getBooklist()));
//		for (Book data : mgr.getBooklist()) {
//			System.out.println(data);
//		}
	}
}
