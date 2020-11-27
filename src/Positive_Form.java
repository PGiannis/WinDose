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
	private JLabel ssn;
	private JTextField Ssn;
	private JLabel district;
	private JComboBox District;
	private JLabel hosp;
	private JTextField Hosp;
	private JLabel symptoms;
	private JRadioButton yes; 
    private JRadioButton no;
    private ButtonGroup gengp;
    private JLabel meth_imp;
    private JRadioButton Yes; 
    private JRadioButton No;
    private JLabel exit_date;
	private JComboBox exdate;
	private JComboBox exmonth;
	private JComboBox exyear;
	
	private String dates[] 
	        = { "1", "2", "3", "4", "5", 
	            "6", "7", "8", "9", "10", 
	            "11", "12", "13", "14", "15", 
	            "16", "17", "18", "19", "20", 
	            "21", "22", "23", "24", "25", 
	            "26", "27", "28", "29", "30", 
	            "31" }; 
	    private String months[] 
	        = { "Jan", "feb", "Mar", "Apr", 
	            "May", "Jun", "July", "Aug", 
	            "Sup", "Oct", "Nov", "Dec" }; 
	    private String years[]
	        = { "1979", "1980", "1981", "1982",
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
	    		= {		"Περιφέρεια Αττικής",
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
	        surname.setSize(100, 20); 
	        surname.setLocation(100, 100); 
	        c.add(surname); 
	        
	        Surname = new JTextField(); 
	        Surname.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Surname.setSize(190, 20); 
	        Surname.setLocation(200, 200); 
	        c.add(Surname); 
	   
	        lastname = new JLabel("Lastname"); 
	        lastname.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        lastname.setSize(200, 100); 
	        lastname.setLocation(400, 00); 
	        c.add(lastname); 
	        
	        Lastname = new JTextField(); 
	        Lastname.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Lastname.setSize(190, 20); 
	        Lastname.setLocation(200, 100); 
	        c.add(Lastname); 
	        
	        dob = new JLabel("Date of Birth"); 
	        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        dob.setSize(100, 20); 
	        dob.setLocation(100, 250); 
	        c.add(dob); 
	  
	        date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(50, 20); 
	        date.setLocation(200, 250); 
	        c.add(date); 
	  
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(60, 20); 
	        month.setLocation(250, 250); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(60, 20); 
	        year.setLocation(320, 250); 
	        c.add(year); 
	        
	        test_date = new JLabel("Testing Date"); 
	        test_date.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        test_date.setSize(100, 20); 
	        test_date.setLocation(100, 250); 
	        c.add(test_date); 
	  
	        date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(50, 20); 
	        date.setLocation(200, 250); 
	        c.add(date); 
	  
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(60, 20); 
	        month.setLocation(250, 250); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(60, 20); 
	        year.setLocation(320, 250); 
	        c.add(year); 
	        
	        ssn = new JLabel("SSN"); 
	        ssn.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        ssn.setSize(100, 20); 
	        ssn.setLocation(100, 100); 
	        c.add(ssn); 
	        
	        Ssn = new JTextField(); 
	        Ssn.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Ssn.setSize(190, 20); 
	        Ssn.setLocation(200, 100); 
	        c.add(Ssn); 
	        
	        district = new JLabel("Select your District"); 
	        district.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        district.setSize(100, 20); 
	        district.setLocation(100, 250); 
	        c.add(district);
	        
	        District = new JComboBox(Destricts); 
	        District.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        District.setSize(50, 20); 
	        District.setLocation(200, 250); 
	        c.add(District); 
	        
	        hosp = new JLabel("Hospital"); 
	        hosp.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        hosp.setSize(100, 20); 
	        hosp.setLocation(100, 100); 
	        c.add(hosp); 
	        
	        Hosp = new JTextField(); 
	        Hosp.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Hosp.setSize(190, 20); 
	        Hosp.setLocation(200, 100); 
	        c.add(Hosp); 
	       
	        symptoms = new JLabel("Symptoms"); 
	        symptoms.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        symptoms.setSize(100, 20); 
	        symptoms.setLocation(100, 200); 
	        c.add(symptoms); 
	  
	        yes = new JRadioButton("Yes"); 
	        yes.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        yes.setSelected(true); 
	        yes.setSize(75, 20); 
	        yes.setLocation(200, 200); 
	        c.add(yes); 
	  
	        no = new JRadioButton("No"); 
	        no.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        no.setSelected(false); 
	        no.setSize(80, 20); 
	        no.setLocation(275, 200); 
	        c.add(no); 
	        
	        gengp = new ButtonGroup(); 
	        gengp.add(yes); 
	        gengp.add(no);
	        
	        meth_imp = new JLabel("Meth Importance"); 
	        meth_imp.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        meth_imp.setSize(100, 20); 
	        meth_imp.setLocation(100, 200); 
	        c.add(meth_imp); 
	  
	        yes = new JRadioButton("Yes"); 
	        yes.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        yes.setSelected(true); 
	        yes.setSize(75, 20); 
	        yes.setLocation(200, 200); 
	        c.add(yes); 
	  
	        no = new JRadioButton("No"); 
	        no.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        no.setSelected(false); 
	        no.setSize(80, 20); 
	        no.setLocation(275, 200); 
	        c.add(no); 
	        
	        gengp = new ButtonGroup(); 
	        gengp.add(yes); 
	        gengp.add(no); 
	        
	        exit_date = new JLabel("Exit Date"); 
	        exit_date.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        exit_date.setSize(100, 20); 
	        exit_date.setLocation(100, 250); 
	        c.add(exit_date); 
	  
	        date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(50, 20); 
	        date.setLocation(200, 250); 
	        c.add(date); 
	  
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(60, 20); 
	        month.setLocation(250, 250); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(60, 20); 
	        year.setLocation(320, 250); 
	        c.add(year); 
	        
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
		                    = "ssn : "
		                      + Ssn.getText() + "\n";
		                
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
		                    data1 = "meth_imp : Yes"
		                            + "\n"; 
		                else
		                    data1 = "meth_imp : No"
		                            + "\n"; 
		                
		                String data9 
	                    = "exit_date : "
	                      + (String)date.getSelectedItem() 
	                      + "/" + (String)month.getSelectedItem() 
	                      + "/" + (String)year.getSelectedItem() 
	                      + "\n"; 
		             
		    }
	    }
