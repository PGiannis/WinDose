import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class Contacts extends JFrame implements ActionListener {
	
	/* Class variables*/
	
	private Container c;
	private JLabel title;
	private JLabel contact1;
	private JTextField Contact1;
	private JLabel contact2;
	private JTextField Contact2;
	private JLabel contact3;
	private JTextField Contact3;
	private JLabel contact4;
	private JTextField Contact4;
	private JLabel contact5;
	private JTextField Contact5;
	private JLabel contact6;
	private JTextField Contact6;
	private JButton sub;
    private JButton back;

	
	    
	    public Contacts()	{
	    	
	    	setTitle("Contacts"); 
	        setBounds(300, 90, 900, 600); 
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	        setResizable(false); 
	  
	        c = getContentPane(); 
	        c.setLayout(null); 
	  
	        /* Page Title */
	        title = new JLabel("Contacts"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(300, 30); 
	        c.add(title); 
	  
	        /*  First contact method */
	        contact1 = new JLabel("Contact 1"); 
	        contact1.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        contact1.setSize(120, 20); 
	        contact1.setLocation(80, 100); 
	        c.add(contact1); 
	        
	        /* First contact method */
	        Contact1 = new JTextField(); 
	        Contact1.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Contact1.setSize(190, 20); 
	        Contact1.setLocation(180, 100); 
	        c.add(Contact1); 
	        
	        /* Second contact method */
	        contact2 = new JLabel("Contact 2"); 
	        contact2.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        contact2.setSize(120, 20); 
	        contact2.setLocation(80, 150); 
	        c.add(contact2); 
	        
	        /* Second contact method */
	        Contact2 = new JTextField(); 
	        Contact2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Contact2.setSize(190, 20); 
	        Contact2.setLocation(180, 150); 
	        c.add(Contact2); 
	        
	        /* Third contact method */
	        contact3 = new JLabel("Contact 3"); 
	        contact3.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        contact3.setSize(120, 20); 
	        contact3.setLocation(80, 200); 
	        c.add(contact3); 
	        
	        /* Third contact method */
	        Contact3 = new JTextField(); 
	        Contact3.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Contact3.setSize(190, 20); 
	        Contact3.setLocation(180, 200); 
	        c.add(Contact3); 
	        
	        /* Fourth contact method */
	        contact4 = new JLabel("Contact 4"); 
	        contact4.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        contact4.setSize(120, 20); 
	        contact4.setLocation(80, 250); 
	        c.add(contact4); 
	        
	        /* Fourth contact method */
	        Contact4 = new JTextField(); 
	        Contact4.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Contact4.setSize(190, 20); 
	        Contact4.setLocation(180, 250); 
	        c.add(Contact4); 
	        
	        /* Fifth contact method */
	        contact5 = new JLabel("Contact 5"); 
	        contact5.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        contact5.setSize(120, 20); 
	        contact5.setLocation(80, 300); 
	        c.add(contact5); 
	        
	        /* Fifth contact method */
	        Contact5 = new JTextField(); 
	        Contact5.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Contact5.setSize(190, 20); 
	        Contact5.setLocation(180, 300); 
	        c.add(Contact5); 
	        
	        /* Sixth contact method */
	        contact6 = new JLabel("Contact 6"); 
	        contact6.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        contact6.setSize(120, 20); 
	        contact6.setLocation(80, 350); 
	        c.add(contact6); 
	        
	        /* Sixth contact method */
	        Contact6 = new JTextField(); 
	        Contact6.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Contact6.setSize(190, 20); 
	        Contact6.setLocation(180, 350); 
	        c.add(Contact6); 
	    }
	        public void actionPerformed(ActionEvent e) 
		    { 
		    	
		    }
	    }
