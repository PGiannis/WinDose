import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Change_state extends JFrame implements ActionListener {

	private Container c;
	private JLabel mess;
	private JComboBox State;
	private JButton commit;
	
	private String state[]
			= {"-//-", "Symtoms","No symtoms","ECU","Past away"
					};
	
	public Change_state() {
		
		setTitle("Change state"); 
        setBounds(300, 90, 600, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
		
		
	  c = getContentPane(); 
      c.setLayout(null); 
      
      
	mess = new JLabel("change patient state");
	mess.setFont(new Font("Arial", Font.PLAIN, 15)); 
    mess.setSize(150, 20); 
    mess.setLocation(110, 100); 
     c.add(mess); 
	
	
     
	 State = new JComboBox(state); 
     State.setFont(new Font("Arial", Font.PLAIN, 15)); 
     State.setSize(120, 30); 
     State.setLocation(250, 95); 
     c.add(State);
     
     commit = new JButton("Commit"); 
     commit.setFont(new Font("Arial", Font.PLAIN, 15)); 
     commit.setSize(120, 30); 
     commit.setLocation(250, 230); 
     commit.addActionListener(this); 
     c.add(commit);
     
     
     
	
     setVisible(true);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.exit(0);
	}

}