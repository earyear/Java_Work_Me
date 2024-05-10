package MiniProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {

	BookDAO dao = new BookDAO();
	ArrayList<BookDTO> bookLIst = dao.select();
	BookView view = new BookView();

	public Main() {
		setTitle("도서 관리 시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bookLIst = dao.select();
		view.setBookList(bookLIst);
		view.initView(); //table 보여주기
		
		JButton btnAdd = view.btnAdd; 
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//InsertData() : JTextField에 입력된 값들과 JCombobox의 값 삽입
				//BookVO에 필드값들을 초기화하여 BookVO 객체에 참조값을 변환하는 메소드
				BookDTO vo = view.InsertData();
				dao.insert(vo);
				bookLIst = dao.select();
				view.setBookList(bookLIst);//bookVOLIst를 다시 view에 넣어주기
				view.putResult(); 
				view.initInsertData(); //기존의 입력됐던 값 초기화
			}
		}); //버튼을 클릭했을때(
		
		JButton btnselect = view.btnselect;
		btnselect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				BookDTO vo = view.a();
//				dao.insert(vo);
//				bookLIst = dao.select();
				bookLIst = (ArrayList<BookDTO>) new Book_DB().selectMember();
				view.setBookList(bookLIst);
				view.putResult();
				
			}
		});
		
		
		add(view, "Center"); //view 가운데에 추가
		
		
		
		setSize(600, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Main();
	}

}
