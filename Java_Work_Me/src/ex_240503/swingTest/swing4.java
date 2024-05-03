package ex_240503.swingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class swing4 extends JFrame {

	public swing4() {
		setTitle("300x300 스윙 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫으면서 메모리반납

		Container contentPane = getContentPane(); // 컨텐트팬 알아내기

		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정

		contentPane.setLayout(null); // 컨텐트팬의 배치관리자 제거 >> 직접 위치 잡아야함
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(300, 50); // la를 (130,50) 위치로 지정 (오른쪽, 아래)
		la.setSize(200, 20); // la를 200x20 크기로 지정
		contentPane.add(la); // la를 컨텐트팬에 부착
		
		// 9개의 버튼 컴포넌트를 생성하고 동일한 크기로 설정한다.
		// 위치는 서로 겹치게 설정한다.
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성
			b.setLocation(i * 15, i * 15); // 버튼의 위치 설정
			b.setSize(200, 150); // 버튼의 크기는 동일하게 50x20
			contentPane.add(b); // 버튼을 컨텐트팬에 부착
		}
		
		JButton tempButton = new JButton("tempbtn");
		tempButton.setLocation(300,400);
		tempButton.setSize(200,150);
		contentPane.add(tempButton);

		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swing4 sw = new swing4();
	}

}
