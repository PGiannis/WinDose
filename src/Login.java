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

public class Login extends JFrame implements ActionListener {

	private static JLabel userLabel;
	private static JTextField userText;

	private static JButton loginButton;
	private static JLabel success;

	public Login() {

		JFrame j = new JFrame("LOGIN PLATFORM");

		j.setSize(600, 400);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		j.add(panel);

		j.setVisible(true);

		panel.setLayout(null);

		userLabel = new JLabel("AMKA");
		userLabel.setBounds(160, 100, 80, 25);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setBounds(210, 100, 165, 25);
		panel.add(userText);

		loginButton = new JButton("login");
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
		PatientDAO pd = new PatientDAO();
		Patient p = null;
		try {
			p = pd.getPatient(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p);
		if (p != null) {
			dispose();
			MiniMenu m = new MiniMenu(p);
			m.show();
			dispose();
			
		}
		else {
			JOptionPane.showMessageDialog(loginButton, "Invalid AMKA");

		}
	}

}