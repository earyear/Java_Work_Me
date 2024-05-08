package ex_240508;

import javax.swing.*;
import java.awt.event.*;
import java.io.Console;
import java.util.Random;
import java.awt.*;

import util.RandomSelectNumber;
import util.eventListener.MyItemListener;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[5];
	private String[] names = { "라면", "삼김", "우유", "주스", "얼음컵" };
	private JLabel sumLabel;

	public CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("라면 1000원, 삼김 1200원, 우유 2000원, 주스 1800원, 얼음컵 1400원"));
		sumLabel = new JLabel("현재 0 원 입니다.");
		
		MyItemListener listener = new MyItemListener(fruits, sumLabel);
		
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		
		//자동메뉴 추천
		JButton randomButton = new JButton("자동 메뉴 추천");
		
		randomButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//JButton b = (JButton) e.getSource();
				//초기화
				for (int i = 0; i < fruits.length; i++) {
					fruits[i].setSelected(false);
				}
				
//				int num = RandomSelectNumber.selectInt(names.length);
				int select = RandomSelectNumber.selectInt(names.length)+1;
				
				for(int i=0; i<select; i++) {
					int num = RandomSelectNumber.selectInt(names.length);
					fruits[num].setSelected(true);
				}
				
			}
		});
		
		
		c.add(randomButton);
		c.add(sumLabel);
		
		setSize(450, 200);
		setVisible(true);
	}

// Item 리스너 구현
//	class MyItemListener implements ItemListener {
//		private int sum = 0; // 가격의 합
//
//		//
//		public void itemStateChanged(ItemEvent e) {
//			if (e.getStateChange() == ItemEvent.SELECTED) {
//				if (e.getItem() == fruits[0])
//					sum += 1000;
//				else if (e.getItem() == fruits[1])
//					sum += 1200;
//				else if (e.getItem() == fruits[2])
//					sum += 2000;
//				else if (e.getItem() == fruits[3])
//					sum += 1800;
//				else
//					sum += 1400;
//			} else {
//				if (e.getItem() == fruits[0])
//					sum -= 1000;
//				else if (e.getItem() == fruits[1])
//					sum -= 1200;
//				else if (e.getItem() == fruits[2])
//					sum -= 2000;
//				else if (e.getItem() == fruits[3])
//					sum -= 1800;
//				else
//					sum -= 1400;
//			}
//			sumLabel.setText("현재 " + sum + "원 입니다.");
//		}
//	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
