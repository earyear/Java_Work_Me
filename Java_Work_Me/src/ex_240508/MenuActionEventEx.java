package ex_240508;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuActionEventEx extends JFrame {
	private JLabel imgLabel = new JLabel(); // 빈 레이블

	public MenuActionEventEx() {
		setTitle("Menu에 Action 리스너 만들기 예제");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		
		String name=JOptionPane.showInputDialog("이름을 입력하세요.");
		JLabel nameJLabel = new JLabel("입력한 이름 : "+name);
		getContentPane().add(nameJLabel);
		
		setSize(250, 200);
		setVisible(true);
	}

	public void createMenu() {
		JMenuBar mb = new JMenuBar(); // 메뉴바 생성
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = { "Load", "Hide", "ReShow", "Exit" };
		JMenu screenMenu = new JMenu("Screen");
		MenuActionListener listener = new MenuActionListener();
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb); // 메뉴바를 프레임에 부착
	}

	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) { // 메뉴 아이템의 종류 구분
			case "Load":
				if (imgLabel.getIcon() != null)
					return;
// 이미 로딩되었으면 리턴
				imgLabel.setIcon(new ImageIcon("src/util/images/sea2_300.png"));
				break;
			case "Hide":
				imgLabel.setVisible(false);
				break;
			case "ReShow":
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new MenuActionEventEx();
	}
}
