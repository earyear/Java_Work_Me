package ex_240509;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class signup_jdbc_mini extends JFrame {
	
	private JTextField id = new JTextField(20);
	private JTextField tf = new JTextField(20);
	private JTextField email = new JTextField(20);
	private JTextField pw = new JTextField(20);
	private JTextField checkpw = new JTextField(20);

	private JLabel label = new JLabel();
	private JTextArea ta = new JTextArea(7, 20);
	
	public member501_db db = new member501_db();

	public signup_jdbc_mini() {
		setTitle("회원가입 미니 실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("ID "));
		c.add(id);
		
		c.add(new JLabel("이름 "));
		c.add(tf);

		c.add(new JLabel("이메일 "));
		c.add(email);

		c.add(new JLabel("패스워드 "));
		c.add(pw);

		c.add(new JLabel("패스워드 확인 "));
		c.add(checkpw);

		JButton insertbtn = new JButton("회원 가입");
		JButton selectbtn = new JButton("회원 조회");
		JButton updatebtn = new JButton("회원 수정");
		JButton deletebtn = new JButton("회원 삭제");

		//익명클래스
		insertbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ta.setText(" ");
				if (pw.getText().equals(checkpw.getText())) {
					System.out.println("비번 확인완료");
					//라벨에 붙히기
					label.setText("이름 : " + tf.getText() + "  " + "이메일 : " + email.getText());
					//textarea에 붙히기
//					ta.setText(tf.getText() + "\n" + email.getText() + "\n");
//					String name = tf.getText();
					
					db.insertMember(tf.getText(), email.getText(), pw.getText());
					id.setText(" ");
					tf.setText(" ");
					email.setText(" ");
					pw.setText(" ");
					checkpw.setText(" ");
					
				}
				else if(pw.getText().isEmpty()) {
					System.out.println("비번 비었슈");
				}
				else if(checkpw.getText().isEmpty()) {
					System.out.println("비번확인 비었슈");
				}
				else {
					System.out.println("비번 다름");
					ta.setText("비밀번호가 다릅니다!");
				}

			}
		});

		selectbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ta.setText(" ");
				ta.setText(db.selectMember());
				
				id.setText(" ");
				tf.setText(" ");
				email.setText(" ");
				pw.setText(" ");
				checkpw.setText(" ");
			}
		});
		
		updatebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				db.updateMember(id.getText(), tf.getText(), email.getText(), pw.getText());
				id.setText(" ");
				tf.setText(" ");
				email.setText(" ");
				pw.setText(" ");
				checkpw.setText(" ");
			}
		});
		
		deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				db.deleteMember(id.getText());
				ta.setText("ID가 "+id.getText()+"인 레코드가 삭제되었습니다.");
				id.setText(" ");
				tf.setText(" ");
				email.setText(" ");
				pw.setText(" ");
				checkpw.setText(" ");
			}
		});


		c.add(insertbtn);
		c.add(selectbtn);
		c.add(updatebtn);
		c.add(deletebtn);

		c.add(label);
		c.add(new JScrollPane(ta));

		setSize(250, 500);
//		setResizable(false); //창 크기 고정 변경 불가능!;
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new signup_jdbc_mini();
	}
}