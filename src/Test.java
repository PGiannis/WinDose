package src;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class Test extends JFrame implements ActionListener {
		
		/* Class variables */
	    private Container c; 
	    private JLabel title;
	    private JLabel diagnosis;
	    private JRadioButton positive;
	    private JRadioButton negative;
	    private ButtonGroup gengp; 
	    private JButton next;
	    private JButton back;
	    private JTextArea tout; 
	    private JLabel res; 
	    private JTextArea resadd; 
	    
	    public Test() {
	    	setTitle("Registration Form"); 
	        setBounds(300, 90, 900, 600); 
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	        setResizable(false); 
	  
	        c = getContentPane(); 
	        c.setLayout(null); 
	  
	        /* Page Title */
	        title = new JLabel("Registration Form"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(300, 30); 
	        c.add(title); 
	        
	        /* Diagnosis label method */
	        diagnosis = new JLabel ("Diagnosis");
	        diagnosis.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        diagnosis.setSize(100, 20); 
	        diagnosis.setLocation(100, 200); 
	        c.add(diagnosis); 
	  
	        /* Positive Box method */
	        positive = new JRadioButton("Positive"); 
	        positive.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        positive.setSelected(true); 
	        positive.setSize(100, 60); 
	        positive.setLocation(100, 250); 
	        c.add(positive); 
	  
	        /* Negative Box method */
	        negative = new JRadioButton("Negative"); 
	        negative.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        negative.setSelected(false); 
	        negative.setSize(100, 60); 
	        negative.setLocation(100, 300); 
	        c.add(negative); 
	  
	        /* Shows that only one option is permitted */
	        gengp = new ButtonGroup(); 
	        gengp.add(positive); 
	        gengp.add(negative); 
	        
	        /* Submit button */
	        next = new JButton("Next"); 
	        next.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        next.setSize(80, 20); 
	        next.setLocation(80, 450); 
	        next.addActionListener(this); 
	        c.add(next); 
	        
	        /* Back Button method */
	        back = new JButton("Back"); 
	        back.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        back.setSize(80, 20); 
	        back.setLocation(200, 450); 
	        back.addActionListener(this);
	        c.add(back); 
	        
	        tout = new JTextArea(); 
	        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tout.setSize(300, 400); 
	        tout.setLocation(500, 100); 
	        tout.setLineWrap(true); 
	        tout.setEditable(false); 
	        c.add(tout); 
	  
	        res = new JLabel(""); 
	        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        res.setSize(500, 25); 
	        res.setLocation(100, 500); 
	        c.add(res); 
	  
	        resadd = new JTextArea(); 
	        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        resadd.setSize(200, 75); 
	        resadd.setLocation(580, 175); 
	        resadd.setLineWrap(true); 
	        c.add(resadd); 
	  
	        setVisible(true); 


	  
	        
	    } 
	    
	    public void actionPerformed(ActionEvent e) 
	    { 
	      
	    	
	    
	    if (e.getSource() == next) {
	    
	    if (positive.isSelected()) {
	    	Positive_Form p = new Positive_Form();
	       	
			p.show();
		        
			dispose();
	    	
	    } else {
	    	Negative_Form n = new Negative_Form();
	       	
			n.show();
		        
			dispose();
	    }
	    
	    } else if (e.getSource() == back) {
	    	
	    	Home p = new Home();
	       	
			p.show();
		        
			dispose();
	    }
else if (e.getSource() == back) {
	    	
	    	Home p = new Home();
	       	
			p.show();
		        
			dispose();
		}
	    }
}

 
   