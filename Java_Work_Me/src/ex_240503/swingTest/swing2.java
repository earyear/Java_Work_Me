package ex_240503.swingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;


public class swing2 extends JFrame{
	
	public swing2() {
		setTitle("300x300 스윙 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫으면서 메모리반납
		
				
		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		contentPane.setLayout(new BorderLayout()); // 컨텐트팬에 BorderLayout (상하좌우센터)
		
		// 배치관리자 달기
		contentPane.add(new JButton("OK"), BorderLayout.WEST); // OK 버튼 달기
		contentPane.add(new JButton("Cancel"), BorderLayout.EAST); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore"), BorderLayout.NORTH); // Ignore 버튼 달기
		contentPane.add(new JButton("Click"), BorderLayout.SOUTH);
		contentPane.add(new JButton("Home"), BorderLayout.CENTER);
		
		setSize(300, 150); 
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swing2 sw = new swing2();
	}

}
