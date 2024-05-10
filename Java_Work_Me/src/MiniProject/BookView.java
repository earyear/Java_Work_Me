package MiniProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import MiniProject.Book_DB;


public class BookView extends JPanel{
	JTable table;
	DefaultTableModel model; // DfaultTableModel이 같이 필요함
	ArrayList<BookDTO> bookList;
	
	String header[] = { "도서 번호", "도서명", "출판사", "저자명", "도서가격", "카테고리" };
	String categoryNames[] = { "IT도서", "소설", "비도서", "경제", "사회" };
	public Book_DB db = new Book_DB();
	
	// 패널 선언
	JPanel p;
	JComboBox<String> categoryCombo;
	JLabel bookid[] = new JLabel[header.length]; 
	JTextField tf[] = new JTextField[header.length - 1]; // JTextfield는 5개 필요! 카테고리는 제외
	JButton btnAdd = new JButton("도서추가");
	JButton btnselect = new JButton("도서조회");
	
	public BookView() {
		setLayout(new BorderLayout());
		
		categoryCombo = new JComboBox<String>(categoryNames); 

		p = new JPanel();
		p.setLayout(new GridLayout(4, 4)); // 하단에 정렬하기 위해 grid 사용

		for (int i = 0; i < header.length; i++) {
			bookid[i] = new JLabel(header[i]);
			p.add(bookid[i]); // 구역이 나눠진 p에 라벨 넣기
			if (i < header.length - 1) { 
				tf[i] = new JTextField();
				p.add(tf[i]);
			} 
			else {// i가 5가 됐을때 카테고리 콤보 넣어주기
				p.add(categoryCombo);
			}
		}
		
		// 도서선택 앞에 빈칸 2개 추가 (버튼 나중에 추가) > 삭제같은거..
		for (int i = 0; i < 2; i++) {
			p.add(new JLabel(" "));
		}
		
		// 버튼 추가
		p.add(btnselect);
		p.add(btnAdd);
	}
	
	//JTable
	public void initView() {
		model = new DefaultTableModel(header, bookList.size()) { // 편집이 됨
			
			@Override
			public boolean isCellEditable(int row, int column) { // 패널에 저장되어 있는
				return false; // 편집안됨
			}
		};
		
		// 컬럼들의 너비 설정
		table = new JTable(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(50);

		// 스크로바 만들기
		JScrollPane scroll = new JScrollPane(table);

		putResult();

		add("Center", scroll); // 위치 순서 상관없음
		add("South", p);

	}
	
	// DefaultTableModel에 도서 정보들을 설정
	public void putResult() { //결과의 값들 잘 설정되도록
		// model 행 개수 설정
		model.setRowCount(bookList.size()); // 화면에 나오게 하는것 중요
		// 지역변수 선언
		BookDTO vo = null;
		for (int i = 0; i < bookList.size(); i++) {
			vo = bookList.get(i);
			// i : 행 번호 0 : 열번호
			// 값을 설정한다 sell값을 설정하는 메소드
			model.setValueAt(vo.getBookid(), i, 0);
			model.setValueAt(vo.getBookName(), i, 1);
			model.setValueAt(vo.getPublish(), i, 2);
			model.setValueAt(vo.getAuthor(), i, 3);
			model.setValueAt(vo.getPrice(), i, 4);
			model.setValueAt(vo.getCategory(), i, 5);
		}
	}
	
	public void setBookList(ArrayList<BookDTO> bookList) {
		this.bookList = bookList;
	}
	public void a() {
		BookDTO vo = new BookDTO();
		vo.setBookid(Integer.parseInt(tf[0].getText()));
		vo.setBookName(tf[1].getText());
		vo.setPublish(tf[2].getText());
		vo.setAuthor(tf[3].getText());
		vo.setPrice(Integer.parseInt(tf[4].getText()));
		vo.setCategory((String) categoryCombo.getSelectedItem());
		
		db.selectMember(vo);
	}
	
	public BookDTO InsertData() {
		BookDTO vo = new BookDTO();
		vo.setBookid(Integer.parseInt(tf[0].getText()));
		vo.setBookName(tf[1].getText());
		vo.setPublish(tf[2].getText());
		vo.setAuthor(tf[3].getText());
		vo.setPrice(Integer.parseInt(tf[4].getText()));
		vo.setCategory((String) categoryCombo.getSelectedItem());
		
		//DB에 삽입
		db.insertbook(vo);
		return vo; 
	}

	//삽입되고 나서 textfield 지워주기(이쁨)
	public void initInsertData() {
		for (int i = 0; i < tf.length; i++) {
			tf[i].setText("");
		}
		categoryCombo.setSelectedIndex(0);
	}
}
