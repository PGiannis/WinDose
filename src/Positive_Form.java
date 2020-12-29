

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;


class Positive_Form extends JFrame implements ActionListener {
	
	/* Class variables*/
	
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
	private JLabel amka1;
	private JTextField amka2;
	private JLabel district1;
	private JComboBox district2;
	private JLabel hosp1;
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
	private JTextArea textArea;
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
	   
	    public Positive_Form() {
	    	
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
	        
	        /* Hospital label method */
	        hosp1 = new JLabel("Hospital"); 
	        hosp1.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        hosp1.setSize(100, 20); 
	        hosp1.setLocation(450, 200); 
	        c.add(hosp1);
	        
	        /* Hospital TextField method */
	        hosp2 = new JTextField(); 
	        hosp2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        hosp2.setSize(190, 20); 
	        hosp2.setLocation(550, 200); 
	        c.add(hosp2); 
	       
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
	  
	        yes = new JRadioButton("Yes"); 
	        yes.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        yes.setSelected(true); 
	        yes.setSize(75, 20); 
	        yes.setLocation(580, 250); 
	        c.add(yes); 
	  
	        no = new JRadioButton("No"); 
	        no.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        no.setSelected(false); 
	        no.setSize(80, 20); 
	        no.setLocation(650, 250); 
	        c.add(no); 
	        
	        gengp = new ButtonGroup(); 
	        gengp.add(yes); 
	        gengp.add(no); 
	        
	        /* Exit date method */
	        exit_date = new JLabel("Exit Date"); 
	        exit_date.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        exit_date.setSize(100, 20); 
	        exit_date.setLocation(80, 400); 
	        c.add(exit_date); 
	  
	        exdate = new JComboBox(dates); 
	        exdate.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        exdate.setSize(70, 20); 
	        exdate.setLocation(220, 400); 
	        c.add(exdate); 
	  
	        exmonth = new JComboBox(months); 
	        exmonth.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        exmonth.setSize(80, 20); 
	        exmonth.setLocation(300, 400); 
	        c.add(exmonth); 
	  
	        exyear = new JComboBox(years); 
	        exyear.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        exyear.setSize(100, 20); 
	        exyear.setLocation(400, 400); 
	        c.add(exyear); 
	        
	        /* Submit Button method */
	        next = new JButton("Submit"); 
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
			    	  
			    	  First_page f  = new First_page();
			    	  f.show();
			    	  dispose();
			      }
			      else if (e.getSource() == next) {
			    	  Contacts c = new Contacts();
			    	 c.show();
			    	  dispose();
			    	  
			    	  String surname = surname2.getText();		                      
			        	String lastname = lastname2.getText();        
			        	String DOB = (String)bdate.getSelectedItem() 
				                      + "/" + (String)bmonth.getSelectedItem() 
				                      + "/" + (String)byear.getSelectedItem() 
				                      + "\n"; 
			        	String AMKA = amka2.getText(); 
			        	String Hospital = hosp2.getText() + "\n";
				        
				        String Destrict = (String)district2.getSelectedItem() + "\n";
				        String symptoms;
				        if (yes.isSelected()) {
				        	symptoms = "Yes";
				        	
				        } else {
				        	symptoms = "No";
				        }
				        String ecu_needed;
				        if (yes.isSelected()) {
				        	ecu_needed = "Yes";
				        	
				        } else {
				        	ecu_needed = "No";
				        }
				        String TD = (String)tdate.getSelectedItem() 
			                      + "/" + (String)tmonth.getSelectedItem() 
			                      + "/" + (String)tyear.getSelectedItem() 
			                      + "\n"; 
				        String destrict = (String)district2.getSelectedItem();
				        String ex_date = (String)exdate.getSelectedItem() 
			                      + "/" + (String)exmonth.getSelectedItem() 
			                      + "/" + (String)exyear.getSelectedItem() 
			                      + "\n"; 
				        System.out.println(surname + "\n" + lastname + "\n" +
				        					DOB + "\n" + AMKA + "\n" +
				        					Hospital + "\n" + Destrict + 
				        					"\n" + symptoms + "\n" + ecu_needed +
				        					"\n" + TD + "\n" + district2 + "\n" +
				        					ex_date);
				        					
			      }
		             
		    }
	    }
