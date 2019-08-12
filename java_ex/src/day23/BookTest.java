package day23;

import javax.swing.plaf.SliderUI;

public class BookTest {
	public static void main(String[] args) {
		
		BookMgr bookmgr = new BookMgr();
		
		
		bookmgr.add(new Book("java", 10000));
		bookmgr.add(new Book("db", 20000));
		bookmgr.add(new Book("html", 30000));
		bookmgr.add(new Book("c", 40000));
		
		bookmgr.save();
		
		bookmgr.getBookList().forEach(i -> System.out.println(i));

//		mgr.add(new Book("~~~~~",0));
//		
//		mgr.save();
	}

}
