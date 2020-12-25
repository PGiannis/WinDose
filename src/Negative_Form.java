import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;


class Negative_Form extends JFrame implements ActionListener {
	
	private Container c;
	private JLabel title;
	private JLabel surname1;
	private JTextField surname2;
	private JLabel lastname1;
	private JTextField lastname2;
	private JLabel dob;
	private JComboBox bdate;
	private JComboBox bmonth;
	private JComboBox byear;
	private JLabel test_date;
	private JComboBox tdate;
	private JComboBox tmonth;
	private JComboBox tyear;
	private JLabel amka;
	private JTextField Amka;
	private JLabel district;
	private JComboBox District;
	private JLabel hosp;
	private JTextField Hosp;
	private JButton sub;
    private JButton back;
	
	private String dates[] 
	        = { "-//-", "1", "2", "3", "4", "5", 
	            "6", "7", "8", "9", "10", 
	            "11", "12", "13", "14", "15", 
	            "16", "17", "18", "19", "20", 
	            "21", "22", "23", "24", "25", 
	            "26", "27", "28", "29", "30", 
	            "31" }; 
	    private String months[] 
	        = { "-//-", "Jan", "feb", "Mar", "Apr", 
	            "May", "Jun", "July", "Aug", 
	            "Sep", "Oct", "Nov", "Dec" }; 
	    private String years[]
	        = { "-//-", "1979", "1980", "1981", "1982",
	        	"1983", "1984", "1985", "1986",
	        	"1987", "1988", "1989", "1990",
	        	"1991", "1992", "1993", "1994",
	        	"1995", "1996", "1997", "1998", 
	            "1999", "2000", "2001", "2002", 
	            "2003", "2004", "2005", "2006", 
	            "2007", "2008", "2009", "2010", 
	            "2011", "2012", "2013", "2014", 
	            "2015", "2016", "2017", "2018", 
	            "2019", "2020" }; 
	    
	    private String Destricts[]
	    		= {		"-//-",
	    				"Περιφέρεια Αττικής",
	    				"Περιφέρεια Ανατολικής Μακεδονίας & Θράκης",
	    				"Περιφέρεια Βορείου Αιγαίου",
	    				"Περιφέρεια Δυτικής Ελλάδας",
	    				"Περιφέρεια Δυτικής Μακεδονίας",
	    				"Περιφέρεια Ηπείρου",
	    				"Περιφέρεια Θεσσαλίας",
	    				"Περιφέρεια Ιονίων Νήσων",
	    				"Περιφέρεια Κεντρικής Μακεδονίας",
	    				"Περιφέρεια Κρήτης",
	    				"Περιφέρεια Νοτίου Αιγαίου",
	    				"Περιφέρεια Πελοποννήσου",
	    				"Περιφέρεια Στερεάς Ελλάδος" };	    
	   
	    public Negative_Form() {
	    	
	    	setTitle("Negative Form"); 
	        setBounds(300, 90, 900, 600); 
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	        setResizable(false); 
	  
	        c = getContentPane(); 
	        c.setLayout(null); 
	  
	        /* Page Title */
	        title = new JLabel("Negative Form"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(300, 30); 
	        c.add(title); 
	  
	        /* Surname label */
	        surname1 = new JLabel("Surname"); 
	        surname1.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        surname1.setSize(120, 20); 
	        surname1.setLocation(80, 100); 
	        c.add(surname1); 
	        
	        /* Surname TextField */
	        surname2 = new JTextField(); 
	        surname2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        surname2.setSize(190, 20); 
	        surname2.setLocation(180, 100); 
	        c.add(surname2); 
	   
	        /* Lastname label */
	        lastname1 = new JLabel("Lastname"); 
	        lastname1.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        lastname1.setSize(120, 20); 
	        lastname1.setLocation(450, 100); 
	        c.add(lastname1); 
	        
	        /* Lastname TextField */
	        lastname2 = new JTextField(); 
	        lastname2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        lastname2.setSize(190, 20); 
	        lastname2.setLocation(550, 100); 
	        c.add(lastname2); 
	        
	        /* Date of Birth method */
	        dob = new JLabel("Date of Birth"); 
	        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        dob.setSize(120, 20); 
	        dob.setLocation(80, 150); 
	        c.add(dob); 
	  
	        bdate = new JComboBox(dates); 
	        bdate.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        bdate.setSize(70, 20); 
	        bdate.setLocation(220, 150); 
	        c.add(bdate); 
	  
	        bmonth = new JComboBox(months); 
	        bmonth.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        bmonth.setSize(80, 20); 
	        bmonth.setLocation(300, 150); 
	        c.add(bmonth); 
	  
	        byear = new JComboBox(years); 
	        byear.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        byear.setSize(100, 20); 
	        byear.setLocation(400, 150); 
	        c.add(byear); 
	        
	        /* Test date method */
	        test_date = new JLabel("Testing Date"); 
	        test_date.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        test_date.setSize(150, 20); 
	        test_date.setLocation(80, 300); 
	        c.add(test_date); 
	  
	        tdate = new JComboBox(dates); 
	        tdate.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tdate.setSize(70, 20); 
	        tdate.setLocation(220, 300); 
	        c.add(tdate); 
	  
	        tmonth = new JComboBox(months); 
	        tmonth.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tmonth.setSize(80, 20); 
	        tmonth.setLocation(300, 300); 
	        c.add(tmonth); 
	  
	        tyear = new JComboBox(years); 
	        tyear.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tyear.setSize(100, 20); 
	        tyear.setLocation(400, 300); 
	        c.add(tyear); 
	        
	        /* AMKA  label method */
	        amka = new JLabel("AMKA"); 
	        amka.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        amka.setSize(100, 20); 
	        amka.setLocation(80, 200); 
	        c.add(amka); 
	        
	        /* AMKA TextField method */
	        Amka = new JTextField(); 
	        Amka.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Amka.setSize(190, 20); 
	        Amka.setLocation(180, 200); 
	        c.add(Amka); 
	        
	        /* District label method */
	        district = new JLabel("Select your District"); 
	        district.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        district.setSize(200, 20); 
	        district.setLocation(80, 350); 
	        c.add(district);
	        
	        /* District ComboBox method */
	        District = new JComboBox(Destricts); 
	        District.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        District.setSize(400, 20); 
	        District.setLocation(280, 350); 
	        c.add(District); 
	        
	        /* Hospital label method */
	        hosp = new JLabel("Hospital"); 
	        hosp.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        hosp.setSize(100, 20); 
	        hosp.setLocation(80, 250); 
	        c.add(hosp); 
	        
	        /* Hospital TextField method */
	        Hosp = new JTextField(); 
	        Hosp.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Hosp.setSize(190, 20); 
	        Hosp.setLocation(180, 250); 
	        c.add(Hosp); 
	       
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
	        		
		        	
		        	String surname = surname2.getText();		                      
		        	String lastname = lastname2.getText();        
		        	String DOB = (String)bdate.getSelectedItem() 
			                      + "/" + (String)bmonth.getSelectedItem() 
			                      + "/" + (String)byear.getSelectedItem() 
			                      + "\n"; 
		        	String AMKA = Amka.getText(); 
		        	String Hospital = Hosp.getText() + "\n";
			        String TD = (String)tdate.getSelectedItem() 
		                      + "/" + (String)tmonth.getSelectedItem() 
		                      + "/" + (String)tyear.getSelectedItem() 
		                      + "\n"; 
			        String Destrict = (String)District.getSelectedItem() + "\n";     
			        System.out.println(surname + "\n" + lastname + "\n" +
	    					DOB + "\n" + AMKA + "\n" +
	    					Hospital + "\n" + TD + "\n" + District);
			              
			        System.out.println(" New member added ");
			       
		        	}
		        	else if (e.getSource() == back) {
		        		
		        		First_page f = new First_page();
		        		f.show();
		        		dispose();
		        	}
		    }
	    }
