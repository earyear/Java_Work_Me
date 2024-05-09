package MiniProject;

public class BookDTO {
	
	private int bookid; // 도서번호
	private String bookName; // 책이름
	private String author; // 저자명
	private String publish; // 출판사
	private int price; // 가격
	private String category; // 카테고리

	public BookDTO() {

	}
	
	public BookDTO(int bookid, String bookName, String author, String publish, int price, String category) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.author = author;
		this.publish = publish;
		this.price = price;
		this.category = category;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	@Override
	public String toString() {
		return "BookDTO [bookid=" + bookid + ", bookName=" + bookName + ", author=" + author + ", publish=" + publish
				+ ", price=" + price + ", category=" + category + "]";
	}
	
	
}
