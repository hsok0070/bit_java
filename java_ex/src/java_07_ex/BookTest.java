package java_07_ex;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		
		BookManager bookmanager = new BookManager(5);
		bookmanager.addBook(new Book("JAVA",20000));
		bookmanager.addBook(new Book("DB",10000));
		bookmanager.addBook(new Book("SQL",10000));
		bookmanager.addBook(new Book("Html",10000));
		bookmanager.addBook(new Book("SSL",10000));
		bookmanager.addBook(new Book("Hash",10000));
		
		
		System.out.println(Arrays.toString(bookmanager.getBooklist()));

	}

}
