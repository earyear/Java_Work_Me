package ex_240503.swingTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

class MyPanel extends JPanel {

	
}


public class swing1 extends JFrame{
	
	public swing1() {
		setTitle("300x300 스윙 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫으면서 메모리반납
		
//		Container contentPane = getContentPane(); //컨텐트팬 생성
//		JButton button = new JButton("Click"); //버튼 컴포넌트 생성
//		contentPane.add(button); // 컨텐트팬에 버튼 부착
		
		// frame의 컨텐트팬을 MyPanel 객체로 변경
//		frame.setContentPane(new MyPanel());
		
				
		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,20,50)); // 컨텐트팬에 FlowLayout > html의 flex와 동일, 가로순차배치
		
		// 배치관리자 달기
		contentPane.add(new JButton("OK")); // OK 버튼 달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기
		
		setSize(300, 150); 
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swing1 sw = new swing1();
	}

}
