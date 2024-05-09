package MiniProject;

import java.util.ArrayList;

public class BookDAO {

	ArrayList<BookDTO> bookList = new ArrayList();
	
	//insert : ArrayList에 학생정보객체를 추가
	public void insert(BookDTO book) {
		bookList.add(book);
	}
	
	//select : 전체 책 정보 반환
	public  ArrayList<BookDTO> select() {
		return bookList;
	}
}