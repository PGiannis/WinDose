import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

class Home extends JFrame  {
	
	/* Class variables */
	
	private Container c;
	private JLabel title;
	private JButton option1;
	private JButton option2;
	private JButton option3;
	private JButton option4;
	private JButton option5;



public Home() {
	
	setTitle("Welcome"); 
    setBounds(300, 90, 900, 600); 
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    setResizable(false);

    c = getContentPane(); 
    c.setLayout(null);
    
    /* Page Title */
    title = new JLabel("Welcome"); 
    title.setFont(new Font("Arial", Font.PLAIN, 30)); 
    title.setSize(300, 30); 
    title.setLocation(380, 30); 
    c.add(title);
    
    /* New Registration choice method */
    option1 = new JButton("New Registration"); 
    option1.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option1.setSize(170, 40); 
    option1.setLocation(360, 100); 
    c.add(option1); 
    
    /* Contacts Registration choice method */
    option2 = new JButton("Contacts Registration"); 
    option2.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option2.setSize(170, 40); 
    option2.setLocation(360, 180); 
    c.add(option2); 
    
    /* Statics choice method */
    option3 = new JButton("Statistics"); 
    option3.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option3.setSize(170, 40); 
    option3.setLocation(360, 260); 
    c.add(option3); 
    
    /* Data Processing choice method */
    option4 = new JButton("Data Processing"); 
    option4.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option4.setSize(170, 40); 
    option4.setLocation(360, 340); 
    c.add(option4); 
    
    /* Contact Processing choice method */
    option5 = new JButton("Contact Processing"); 
    option5.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option5.setSize(170, 40); 
    option5.setLocation(360, 420); 
    c.add(option5); 
    
    setVisible(true);
}
public void actionPerformed(ActionEvent e) {
	if  (e.getSource() == option1 || e.getSource() == option2 ) {
	
	First_page h = new First_page();
       	
	h.show();
        
	dispose();

	} 	
}
}