package ex_240508;

import javax.swing.*;
import java.awt.*;


public class buttonImage extends JFrame{

	public buttonImage() {
		// TODO Auto-generated constructor stub
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("src/util/images/sea2_300.png");
		ImageIcon rolloverIcon = new ImageIcon("src/util/images/sea2_300.png");
		ImageIcon pressedIcon = new ImageIcon("src/util/images/sea2_300.png");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon); // pressedIcon용 이미지 등록
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
		
		c.add(btn);
		
		setSize(500,400);
		setVisible(true);

	} 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new buttonImage();
	}

}
