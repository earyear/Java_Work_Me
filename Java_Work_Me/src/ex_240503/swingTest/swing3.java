package ex_240503.swingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class swing3 extends JFrame{
	
	public swing3() {
		setTitle("300x300 스윙 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫으면서 메모리반납
		
				
		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		contentPane.setLayout(new GridLayout(3,4,20,10)); // 컨텐트팬에 GridLayout 
														  //> html의 grid와 동일, 행과 열로 지정
		
		// 배치관리자 달기
		contentPane.add(new JButton("OK")); // OK 버튼 달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기
		contentPane.add(new JButton("Click"));
		contentPane.add(new JButton("Home1"));
		contentPane.add(new JButton("Home2"));
		contentPane.add(new JButton("Home3"));
		contentPane.add(new JButton("Home4"));
		contentPane.add(new JButton("Home5"));
		contentPane.add(new JButton("Home6"));
		contentPane.add(new JButton("Home7"));
		contentPane.add(new JButton("Home8"));
		
		
		setSize(300, 300); 
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swing3 sw = new swing3();
	}

}
