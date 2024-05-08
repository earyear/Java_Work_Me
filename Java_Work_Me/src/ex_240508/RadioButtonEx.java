package ex_240508;

import javax.swing.*;

import util.eventListener.MyItemListener;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel Label= new JLabel("아무것도 선택하지 않았습니다.");
		
		ButtonGroup g = new ButtonGroup(); // 버튼 그룹 객체 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리");
		
//		Listener listener = new Listener();
		
// 버튼 그룹에 3개의 라디오버튼 삽입
		g.add(apple);
		g.add(pear);
		g.add(cherry);
// 컨텐트팬에 3개의 라디오버튼 삽입
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		c.add(Label);
		
		
		setSize(250, 150);
		setVisible(true);
	}
//	class Listener implements ItemListener{
//		private String fruit ="사과";
//
//		@Override
//		public void itemStateChanged(ItemEvent e) {
//			// TODO Auto-generated method stub
//			if()
//		}
//		
//		
//	}
	

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}