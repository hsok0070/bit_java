package day23;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMgr {
	
	List<Book> list = new ArrayList<Book>();
	String filename ;
	
	BookMgr(){
		this("book.dat");
	}
	
//	BookMgr(String fileName){
//		this.filename = fileName;
//		try {
//			list = (List<Book>) MyFile.load(fileName);
//		} catch (FileNotFoundException e) {
//			list = new ArrayList<Book>();
//		}
//			
//	}
	BookMgr(String fileName){
		this.filename = fileName;
			list = (List<Book>) MyFile.load(fileName);
			if(list == null) {
				list = new ArrayList<Book>();
			}
			Thread t1 = new AutoSave();
			t1.start();
	
		
	}
	
public void add(Book data) {
	list.add(data);
}

public List<Book> getBookList() {
	return list;
}

public List<Book> delete(String title) {
	Iterator<Book> it = list.iterator();
	while (it.hasNext()) {
		Book data = it.next();
		if(data.getTitle().equals(title)) {
			System.out.println(data+" => 삭제 됩니다.");
			it.remove();
			}
	}
	return list;
}

public List<Book> searchBook(String title) {

	List<Book> slist = new ArrayList<Book>();
	Iterator<Book> itr = list.iterator();
	while (itr.hasNext()) {
		Book data = itr.next();
		if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
			slist.add(data);  
		}
	}
	return slist;

}



public void save() {
	MyFile.save(filename, list);

}

class AutoSave extends Thread{
	@Override
	public void run() {
		while(true) {
			
			try{
				Thread.sleep(1000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			save();
			System.out.println("AutoSave() ~~~~");
			
		}
		
	}
}
}





