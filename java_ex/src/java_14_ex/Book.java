package java_14_ex;

public class Book extends Object implements Comparable<Book>  {
	//Book 만든후 BookMgr을 collection 기반으로 바꾸어서 CURD 기반으로 바꾸기.
  private String title;
  private int price;
  private int isbn;

 public Book() {
	 
 }
  
 public Book(String title, int price) {
 	this.title = title;
 	this.price = price;
 }
 
 
public Book(int isbn, String title, int price) {
	this.isbn = isbn;
	this.title = title;
	this.price = price;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public int getIsbn() {
	return isbn;
}

public void setIsbn(int isbn) {
	this.isbn = isbn;
}

public void print() {
	System.out.printf("Book[%2s : %2d원]\n",title,price);
}

@Override
public String toString() {
	return "Book [title=" + title + ", price=" + price + ", isbn=" + isbn + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + isbn;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (isbn != other.isbn)
		return false;
	return true;
}

@Override
public int compareTo(Book o) {
	return title.compareTo(o.title);
	//return title - o.title;       title은 String 타입으로 -연산을 할수 없다. String타입안에 
									//compareTo함수를 이용하면된다.
}




}
