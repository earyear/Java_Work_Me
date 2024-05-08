package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ex_240426.callByMothod;

public class TextArea_mini extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private JTextField email = new JTextField(20);
	private JTextField pw = new JTextField(20);
	private JTextField checkpw = new JTextField(20);

	private JLabel label = new JLabel();

	private JTextArea ta = new JTextArea(7, 20);

	public TextArea_mini() {
		setTitle("회원가입 미니 실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

//		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(new JLabel("이름 "));
		c.add(tf);

		c.add(new JLabel("이메일 "));
		c.add(email);

		c.add(new JLabel("패스워드 "));
		c.add(pw);

		c.add(new JLabel("패스워드 확인 "));
		c.add(checkpw);

		JButton btn = new JButton("회원 가입");
		JButton clearbtn = new JButton("지우기");

		//익명클래스
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (pw.getText().equals(checkpw.getText())) {
					System.out.println("비번 확인완료");
					//라벨에 붙히기
					label.setText("이름 : " + tf.getText() + "  " + "이메일 : " + email.getText() + "  " + "패스워드 :"
							+ pw.getText());
					//textarea에 붙히기
					ta.setText(tf.getText() + "\n" + email.getText() + "\n");
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

		clearbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ta.setText(" ");
			}
		});

		// 이벤트 처리기. 익명클래스
//		tf.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JTextField t = (JTextField) e.getSource();
//				label.setText("이름 : "+ t.getText());
//			}
//		});

		c.add(btn);
		c.add(clearbtn);

		c.add(label);
		c.add(new JScrollPane(ta));

		setSize(250, 300);
//		setResizable(false); //창 크기 고정 변경 불가능!;
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextArea_mini();
	}
}