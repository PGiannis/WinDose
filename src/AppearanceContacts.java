package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

import javax.swing.*;

import net.proteanit.sql.DbUtils;




public class AppearanceContacts extends JFrame {
	private JPanel contentPane;
	private JTable table;	
	
	
	
	
	
	Connection connection = null;	
	public AppearanceContacts() {
		connection=DB.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 453);
		contentPane = new JPanel ();
		contentPane.setBorder (new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoadTable = new JButton ("Load contacts Data");
		btnLoadTable.addActionListener(new ActionListener); {
			public void actionPerformed(ActionEvent arg0)  {
				try {
					PreparedStatement pst = null;
					String query="select * from Contacts";
					pst = connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e) {
					e.printStackTrace();
					
				}
			}
		};
		btnLoadTable.setBounds(247, 23, 168, 23);
		contentPane.add(btnLoadTable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(151, 81, 371, 295);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
}
}
