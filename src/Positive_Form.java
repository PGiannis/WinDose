package src;

import javax.swing.*; 

import java.awt.*; 
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;



class Positive_Form_example extends JFrame implements ActionListener {
	
	/* Class variables*/
	
	private Container c;
	private JLabel title;
	private JLabel firstName1;
	private JTextField firstName2;
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
	private JLabel amka1;
	private JTextField amka2;
	private JLabel district1;
	private JComboBox district2;
	private JLabel gender;
	private JRadioButton male; 
    private JRadioButton female;
	private JTextField hosp2;
	private JLabel symptoms;
	private JRadioButton yes; 
    private JRadioButton no;
    private ButtonGroup gengp;
    private JLabel ecu_needed;
    private JRadioButton Yes; 
    private JRadioButton No;
    private JLabel exit_date;
	private JComboBox exdate;
	private JComboBox exmonth;
	private JComboBox exyear;
	private JButton next;
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
	        = { "-//-", "1", "2", "3", "4", 
	            "5", "6", "7", "8", 
	            "9", "10", "11", "12" }; 
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
	   
	    public Positive_Form_example()	{
	    	
	    	setTitle("Positve Form"); 
	        setBounds(300, 90, 900, 600); 
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	        setResizable(false); 
	  
	        c = getContentPane(); 
	        c.setLayout(null); 
	  
	        /* Page Title */
	        title = new JLabel("Positive Form"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(300, 30); 
	        c.add(title); 
	  
	        /* firstName label */
	        firstName1 = new JLabel("First Name"); 
	        firstName1.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        firstName1.setSize(120, 20); 
	        firstName1.setLocation(80, 100); 
	        c.add(firstName1); 
	        
	        /* firstName TextField */
	        firstName2 = new JTextField(); 
	        firstName2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        firstName2.setSize(190, 20); 
	        firstName2.setLocation(180, 100); 
	        c.add(firstName2); 
	   
	        /* Lastname label */
	        lastname1 = new JLabel("Last Name"); 
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
	        amka1 = new JLabel("AMKA"); 
	        amka1.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        amka1.setSize(100, 20); 
	        amka1.setLocation(80, 200); 
	        c.add(amka1); 
	        /* AMKA TextField method */
	        amka2 = new JTextField(); 
	        amka2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        amka2.setSize(190, 20); 
	        amka2.setLocation(180, 200); 
	        c.add(amka2); 
	        
	        /* District label method */
	        district1 = new JLabel("Select your District"); 
	        district1.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        district1.setSize(200, 20); 
	        district1.setLocation(80, 350); 
	        c.add(district1);
	        
	        /* District ComboBox method */
	        district2 = new JComboBox(Destricts); 
	        district2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        district2.setSize(400, 20); 
	        district2.setLocation(280, 350); 
	        c.add(district2); 
	        
	        /* Symptoms method */
	        gender = new JLabel("Gender"); 
	        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        gender.setSize(100, 20); 
	        gender.setLocation(450, 200); 
	        c.add(gender); 
	  
	        male = new JRadioButton("Male"); 
	        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        male.setSelected(true); 
	        male.setSize(75, 20); 
	        male.setLocation(580, 200); 
	        c.add(male); 
	  
	        female = new JRadioButton("Female"); 
	        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        female.setSelected(false); 
	        female.setSize(160, 20); 
	        female.setLocation(650, 200); 
	        c.add(female);
	        
	        gengp = new ButtonGroup(); 
	        gengp.add(male); 
	        gengp.add(female);
	       
	        /* Symptoms method */
	        symptoms = new JLabel("Symptoms"); 
	        symptoms.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        symptoms.setSize(100, 20); 
	        symptoms.setLocation(80, 250); 
	        c.add(symptoms);
	  
	        yes = new JRadioButton("Yes"); 
	        yes.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        yes.setSelected(true); 
	        yes.setSize(75, 20); 
	        yes.setLocation(200, 250); 
	        c.add(yes); 
	  
	        no = new JRadioButton("No"); 
	        no.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        no.setSelected(false); 
	        no.setSize(160, 20); 
	        no.setLocation(260, 250); 
	        c.add(no); 
	        
	        gengp = new ButtonGroup(); 
	        gengp.add(yes); 
	        gengp.add(no);
	        
	        /* ECU method */
	        ecu_needed = new JLabel("ECU needed"); 
	        ecu_needed.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        ecu_needed.setSize(170, 20); 
	        ecu_needed.setLocation(450, 250); 
	        c.add(ecu_needed); 
	  
	        Yes = new JRadioButton("Yes"); 
	        Yes.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Yes.setSelected(true); 
	        Yes.setSize(75, 20); 
	        Yes.setLocation(580, 250); 
	        c.add(Yes); 
	  
	        No = new JRadioButton("No"); 
	        No.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        No.setSelected(false); 
	        No.setSize(80, 20); 
	        No.setLocation(650, 250); 
	        c.add(No); 
	        
	        gengp = new ButtonGroup(); 
	        gengp.add(Yes); 
	        gengp.add(No); 
	        
	        
	        
	        /* Submit Button method */
	        next = new JButton("Next"); 
	        next.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        next.setSize(80, 20); 
	        next.setLocation(300, 500); 
	        next.addActionListener(this);
	        c.add(next); 
	        
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
		        
		      if (e.getSource() == back) {
		    	  
		    	  First_page_example f  = new First_page_example();
		    	  f.show();
		    	  dispose();
		      }
		      else if (e.getSource() == next) {
		    	  
		    	  
		    	  String firstName = firstName2.getText();		                      
		        	String lastname = lastname2.getText();        
		        	Date DOB = null;

					DOB = Date.valueOf((String)byear.getSelectedItem() 
					              + "-" + (String)bmonth.getSelectedItem() 
					              + "-" + (String)bdate.getSelectedItem());
		        	int AMKA = Integer.parseInt(amka2.getText()); 
			        
			        String Destrict = (String)district2.getSelectedItem() + "\n";
			        Boolean symptoms = false;
			        if (yes.isSelected()) {
			        	symptoms = true;
			        	
			        } else {
			        	symptoms = false;
			        }
			        boolean ecu_needed = false;
			        if (Yes.isSelected()) {
			        	ecu_needed = true;
			        	
			        } else {
			        	ecu_needed = false;
			        }
			        String gender = "";
			        if (male.isSelected()) {
			        	gender = "M";
			        	
			        } else if (female.isSelected()){
			        	gender = "F";
			        }
			        

			        Date TD = Date.valueOf(new String(tyear.getSelectedItem() 
				              + "-" + (String)tmonth.getSelectedItem() 
				              + "-" + (String)tdate.getSelectedItem()));
			        
			        String destrict = (String)district2.getSelectedItem();
			        
			        
			        Patient p = new Patient(AMKA, firstName, lastname, Destrict, TD, DOB, gender, true, symptoms, ecu_needed, true);
			        
			        
			        Contacts c = new Contacts(p);
			    	c.show();
			    	dispose();
			        
			        System.out.println(firstName + "\n" + lastname + "\n" +
			        					DOB + "\n" + AMKA + "\n" + "\n" + Destrict + 
			        					"\n" + symptoms + "\n" + ecu_needed +
			        					"\n" + TD + "\n" + district2 + "\n");
			        					
		      }
		    }
	        
}
			        
		             
		    
	    
