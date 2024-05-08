package util.eventListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class MyItemListener implements ItemListener {
	private int sum = 0; // 가격의 합
	private JCheckBox[] fruits;
	private JLabel sumLabel;
	
	
	public MyItemListener(JCheckBox[] fruits, JLabel sumLabel) {
		super();
		this.fruits = fruits;
		this.sumLabel = sumLabel;
	}

	
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getItem() == fruits[0])
				sum += 1000;
			else if (e.getItem() == fruits[1])
				sum += 1200;
			else if (e.getItem() == fruits[2])
				sum += 2000;
			else if (e.getItem() == fruits[3])
				sum += 1800;
			else
				sum += 1400;
		} else {
			if (e.getItem() == fruits[0])
				sum -= 1000;
			else if (e.getItem() == fruits[1])
				sum -= 1200;
			else if (e.getItem() == fruits[2])
				sum -= 2000;
			else if (e.getItem() == fruits[3])
				sum -= 1800;
			else
				sum -= 1400;
		}
		sumLabel.setText("현재 " + sum + "원 입니다.");
	}
}