package src;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ID {

	public static void main(String[] args) {
		// TODO code application logic here
		JFrame frame = new JFrame("Hell user");
		JPasswordField pwd = new JPasswordField();
		JLabel lbl = new JLabel("Enter ID");
		lbl.setBounds(70, 100, 120, 30);
		pwd.setBounds(120, 100, 130, 30);
		frame.add(lbl);
		frame.add(pwd);
		frame.setSize(400, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
