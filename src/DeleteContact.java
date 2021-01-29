package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DeleteContact extends JFrame implements ActionListener {

	private static JLabel userLabel;
	private static JTextField userText;

	private static JButton loginButton;
	private static JLabel success;

	public DeleteContact() {

		JFrame j = new JFrame("Contact ID");

		j.setSize(600, 400);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		j.add(panel);

		j.setVisible(true);

		panel.setLayout(null);

		userLabel = new JLabel("Contact ID");
		userLabel.setBounds(135, 100, 80, 25);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setBounds(210, 100, 165, 25);
		panel.add(userText);

		loginButton = new JButton("Next");
		loginButton.setBounds(230, 180, 120, 35);

		loginButton.addActionListener(this);
		panel.add(loginButton);

		success = new JLabel("");
		success.setBounds(10, 100, 300, 25);
		panel.add(success);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String user = userText.getText();
		try {
			Contact.deleteContact(Integer.parseInt(user));
			dispose();
			Test m = new Test();
			m.show();
			dispose();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(loginButton, "Contact id should be a number.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(loginButton, e.getMessage());
		}
		

	}

}