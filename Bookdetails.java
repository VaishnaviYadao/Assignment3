package Assignment3;

import java.util.Scanner;

class Book {
  private int bookNo;
  private String title;
  private String author;
  private float price;

  public int getBookNo() {
	return bookNo;
}
public void setBookNo(int bookNo) {
	this.bookNo = bookNo;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

}
class Bookdetails{
	
	 public static void main(String[] args)
	 {
		 Book b= new Book();
         System.out.println("Book number:" +b.getBookNo());
         Scanner s=new Scanner(System.in);
        
  		System.out.println("Enter the book no:");
  		String bookNo=s.nextLine();
  		System.out.println("Book No is " + bookNo);
  		
  		System.out.println("Enter the book title:");
  		String booktitle=s.nextLine();
  		System.out.println("Book title is " + booktitle);
  		
  		System.out.println("Enter the author:");
  		String author=s.nextLine();
  		System.out.println("Book author is " + author);
  		
  		System.out.println("Enter the price:");
  		String price=s.nextLine();
  		System.out.println("Book price is " + price);
	 }
}
