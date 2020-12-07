
package swing_example;

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
    title.setLocation(350, 30); 
    c.add(title);
    
    /* New Registration choice method */
    option1 = new JButton("New Registration"); 
    option1.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option1.setSize(150, 40); 
    option1.setLocation(350, 150); 
    c.add(option1); 
    
    /* Statics choice method */
    option2 = new JButton("Statistics"); 
    option2.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option2.setSize(150, 40); 
    option2.setLocation(350, 250); 
    c.add(option2); 
    
    /* Data Processing choice method */
    option3 = new JButton("Data Processing"); 
    option3.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option3.setSize(150, 40); 
    option3.setLocation(350, 350); 
    c.add(option3); 
    
    /* Contact Processing choice method */
    option4 = new JButton("Contact Processing"); 
    option4.setFont(new Font("Arial", Font.PLAIN, 15)); 
    option4.setSize(150, 40); 
    option4.setLocation(350, 450); 
    c.add(option4); 
    
    setVisible(true);

   
	}
}
