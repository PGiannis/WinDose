import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;


class Positive_Form extends JFrame implements ActionListener {
	
	private Container c;
	private JLabel title;
	private JLabel surname;
	private JTextField Surname;
	private JLabel lastname;
	private JTextField Lastname;
	private JLabel dob;
	private JComboBox bdate;
	private JComboBox bmonth;
	private JComboBox byear;
	private JLabel test_date;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel amka;
	private JTextField Amka;
	private JLabel district;
	private JComboBox District;
	private JLabel hosp;
	private JTextField Hosp;
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
	   
	    public Positive_Form() {
	    	
	    	setTitle("Positve Form"); 
	        setBounds(300, 90, 900, 600); 
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	        setResizable(false); 
	  
	        c = getContentPane(); 
	        c.setLayout(null); 
	  
	        title = new JLabel("Positive Form"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(300, 30); 
	        c.add(title); 
	  
	        surname = new JLabel("Surname"); 
	        surname.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        surname.setSize(120, 20); 
	        surname.setLocation(80, 100); 
	        c.add(surname); 
	        
	        Surname = new JTextField(); 
	        Surname.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Surname.setSize(190, 20); 
	        Surname.setLocation(180, 100); 
	        c.add(Surname); 
	   
	        lastname = new JLabel("Lastname"); 
	        lastname.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        lastname.setSize(120, 20); 
	        lastname.setLocation(450, 100); 
	        c.add(lastname); 
	        
	        Lastname = new JTextField(); 
	        Lastname.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Lastname.setSize(190, 20); 
	        Lastname.setLocation(550, 100); 
	        c.add(Lastname); 
	        
	        dob = new JLabel("Date of Birth"); 
	        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        dob.setSize(120, 20); 
	        dob.setLocation(80, 150); 
	        c.add(dob); 
	  
	        date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(70, 20); 
	        date.setLocation(220, 150); 
	        c.add(date); 
	  
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(80, 20); 
	        month.setLocation(300, 150); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(100, 20); 
	        year.setLocation(400, 150); 
	        c.add(year); 
	        
	        test_date = new JLabel("Testing Date"); 
	        test_date.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        test_date.setSize(150, 20); 
	        test_date.setLocation(80, 300); 
	        c.add(test_date); 
	  
	        date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(70, 20); 
	        date.setLocation(220, 300); 
	        c.add(date); 
	  
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(80, 20); 
	        month.setLocation(300, 300); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(100, 20); 
	        year.setLocation(400, 300); 
	        c.add(year); 
	        
	        amka = new JLabel("AMKA"); 
	        amka.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        amka.setSize(100, 20); 
	        amka.setLocation(80, 200); 
	        c.add(amka); 
	        
	        Amka = new JTextField(); 
	        Amka.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Amka.setSize(190, 20); 
	        Amka.setLocation(180, 200); 
	        c.add(Amka); 
	        
	        district = new JLabel("Select your District"); 
	        district.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        district.setSize(200, 20); 
	        district.setLocation(80, 350); 
	        c.add(district);
	        
	        District = new JComboBox(Destricts); 
	        District.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        District.setSize(400, 20); 
	        District.setLocation(280, 350); 
	        c.add(District); 
	        
	        hosp = new JLabel("Hospital"); 
	        hosp.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        hosp.setSize(100, 20); 
	        hosp.setLocation(450, 200); 
	        c.add(hosp); 
	        
	        Hosp = new JTextField(); 
	        Hosp.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Hosp.setSize(190, 20); 
	        Hosp.setLocation(550, 200); 
	        c.add(Hosp); 
	       
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
	        
	        exit_date = new JLabel("Exit Date"); 
	        exit_date.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        exit_date.setSize(100, 20); 
	        exit_date.setLocation(80, 400); 
	        c.add(exit_date); 
	  
	        date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(70, 20); 
	        date.setLocation(220, 400); 
	        c.add(date); 
	  
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(80, 20); 
	        month.setLocation(300, 400); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(100, 20); 
	        year.setLocation(400, 400); 
	        c.add(year); 
	        
	        sub = new JButton("Submit"); 
	        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        sub.setSize(80, 20); 
	        sub.setLocation(300, 500); 
	        sub.addActionListener(this); 
	        c.add(sub); 
	        
	        /*back button*/
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
		        
		             
		                String data1; 
		                String data 
		                    = "surname : "
		                      + Surname.getText() + "\n"
		                      + "lastname : "
		                      + Lastname.getText() + "\n"; 
		                
		                String data2 
		                    = "DOB : "
		                      + (String)date.getSelectedItem() 
		                      + "/" + (String)month.getSelectedItem() 
		                      + "/" + (String)year.getSelectedItem() 
		                      + "\n"; 
		                
		                String data3 
	                    = "test_date : "
	                      + (String)date.getSelectedItem() 
	                      + "/" + (String)month.getSelectedItem() 
	                      + "/" + (String)year.getSelectedItem() 
	                      + "\n"; 
		  
		                 
		                String data4;
		                String Data
		                    = "amka : "
		                      + Amka.getText() + "\n";
		                
		                String data5 
	                    = "Districts : "
	                      + (String)District.getSelectedItem() 
	                      + "\n"; 
		                
		                String data6
		                	= "hosp : "
		                      + Hosp.getText() + "\n";
		                
		                String date7;
		                if (yes.isSelected()) 
		                    data1 = "symptoms : Yes"
		                            + "\n"; 
		                else
		                    data1 = "symptoms : No"
		                            + "\n"; 
		                
		                String date8;
		                if (yes.isSelected()) 
		                    data1 = "ecu_needed : Yes"
		                            + "\n"; 
		                else
		                    data1 = "ecu_needed : No"
		                            + "\n"; 
		                
		                String data9 
	                    = "exit_date : "
	                      + (String)date.getSelectedItem() 
	                      + "/" + (String)month.getSelectedItem() 
	                      + "/" + (String)year.getSelectedItem() 
	                      + "\n"; 
		             
		    }
	    }
