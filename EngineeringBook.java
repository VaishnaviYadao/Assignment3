package Assignment3;

class Book
{
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
   
 public class EngineeringBook extends Book
   {
	   
       
	private String Category;

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
	
   
   public static void main(String[] args)
   {
	   EngineeringBook eBook = new EngineeringBook();
	   eBook.setBookNo(12);
	   System.out.println("Book id is:" + eBook.getBookNo());
	   
	     
   }
   }


