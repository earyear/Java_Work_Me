package ex_240426;

public class Book {

	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public Book() {}
	
	public Book(String bookName, String bookAuthor, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	
	public void showinfo(){
		System.out.println(bookName+","+bookAuthor+","+bookPrice);
	}

}
