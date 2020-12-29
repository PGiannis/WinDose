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
	private JLabel phone1;
	private JTextField Phone1;
	private JLabel phone2;
	private JTextField Phone2;
	private JLabel phone3;
	private JTextField Phone3;
	private JLabel phone4;
	private JTextField Phone4;
	private JLabel phone5;
	private JTextField Phone5;
	private JLabel phone6;
	private JTextField Phone6;
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
	        
	        /*  First phone method */
	        phone1 = new JLabel("Phone"); 
	        phone1.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        phone1.setSize(120, 20); 
	        phone1.setLocation(450, 150); 
	        c.add(phone1); 
	        
	        /* First phone method */
	        Phone1 = new JTextField(); 
	        Phone1.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Phone1.setSize(190, 20); 
	        Phone1.setLocation(550, 150); 
	        c.add(Phone1); 
	        
	        /* Second phone method */
	        phone2 = new JLabel("Phone"); 
	        phone2.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        phone2.setSize(120, 20); 
	        phone2.setLocation(450, 200); 
	        c.add(phone2); 
	        
	        /* Second phone method */
	        Phone2 = new JTextField(); 
	        Phone2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Phone2.setSize(190, 20); 
	        Phone2.setLocation(550, 200); 
	        c.add(Phone2); 
	        
	        /* Third phone method */
	        phone3 = new JLabel("Phone"); 
	        phone3.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        phone3.setSize(120, 20); 
	        phone3.setLocation(450, 250); 
	        c.add(phone3); 
	        
	        /* Third phone method */
	        Phone3 = new JTextField(); 
	        Phone3.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Phone3.setSize(190, 20); 
	        Phone3.setLocation(550, 250); 
	        c.add(Phone3); 
	        
	        /* Fourth phone method */
	        phone4 = new JLabel("Phone"); 
	        phone4.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        phone4.setSize(120, 20); 
	        phone4.setLocation(450, 300); 
	        c.add(phone4); 
	        
	        /* Fourth phone method */
	        Phone4 = new JTextField(); 
	        Phone4.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Phone4.setSize(190, 20); 
	        Phone4.setLocation(550, 300); 
	        c.add(Phone4); 
	        
	        /* Fifth phone method */
	        phone5 = new JLabel("Phone"); 
	        phone5.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        phone5.setSize(120, 20); 
	        phone5.setLocation(450, 350); 
	        c.add(phone5); 
	        
	        /* Fifth phone method */
	        Phone5 = new JTextField(); 
	        Phone5.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Phone5.setSize(190, 20); 
	        Phone5.setLocation(550, 350); 
	        c.add(Phone5); 
	        
	        /* Sixth phone method */
	        phone6 = new JLabel("Phone"); 
	        phone6.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        phone6.setSize(120, 20); 
	        phone6.setLocation(450, 400); 
	        c.add(phone6); 
	        
	        /* Sixth phone method */
	        Phone6 = new JTextField(); 
	        Phone6.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Phone6.setSize(190, 20); 
	        Phone6.setLocation(550, 400); 
	        c.add(Phone6); 
	   
	         /* Submit Button method */
	        sub = new JButton("Submit"); 
	        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        sub.setSize(80, 20); 
	        sub.setLocation(300, 500); 
	        sub.addActionListener(this);
	        c.add(sub); 
	        
	        /* Back button method */
	        back = new JButton("Back"); 
	        back.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        back.setSize(80, 20); 
	        back.setLocation(450, 500); 
	        back.addActionListener(this); 
	        c.add(back); 
	        
	        setVisible(true);
	        
	    } 
	        public void actionPerformed(ActionEvent e) 
		    { 
	        	if (e.getSource() == sub) {
		    		
		    		String contact1 = Contact1.getText();
		    		String contact2 = Contact2.getText();
		    		String contact3 = Contact3.getText();
		    		String contact4 = Contact4.getText();
		    		String contact5 = Contact5.getText();
		    		String contact6 = Contact5.getText();
		    		
		    		System.out.println(" New member added ");
		    		
		    	} else if (e.getSource() == back){
		    		Positive_Form f = new Positive_Form();
	        		f.show();
	        		dispose();
		    		
		    	}	
		    }
	    }
