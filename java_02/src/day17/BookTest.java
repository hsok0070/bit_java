package day17;

import day16.Book;

public class BookTest {
	public static void main (String[] args) {
		
		Book book = new Book();
		book.setTitle("java");
		try {
			book.setPrice(-10000);			
		}catch (PriceException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			//System.err.println(e.getMessage());
		}
		System.out.println(book);
		System.out.println("----------------");
		Book b2 = null;
		try {
			b2 = new Book("jsp", 90000);
		}catch (PriceException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(b2);
	}

}
