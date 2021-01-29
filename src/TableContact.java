package src;


	// Packages to import 
	import javax.swing.JFrame; 
	import javax.swing.JScrollPane; 
	import javax.swing.JTable; 
	  
	public class TableContact {
	    // frame 
	    JFrame f; 
	    // Table 
	    JTable j; 
	  
	    // Constructor 
	    TableContact() 
	    { 
	        // Frame initiallization 
	        f = new JFrame(); 
	  
	        // Frame Title 
	        f.setTitle("Contacts"); 
	  
	        // Data to be displayed in the JTable 
	        String[][] data = { 
	            { "Kundan Kumar Jha", "4031", "CSE" }, 
	            { "Anand Jha", "6014", "IT" } 
	        }; 
	  
	        // Column Names 
	        String[] columnNames = { "Contact id", "Name", "Phone" }; 
	  
	        // Initializing the JTable 
	        j = new JTable(data, columnNames); 
	        j.setBounds(10, 40, 200, 300); 
	  
	        // adding it to JScrollPane 
	        JScrollPane sp = new JScrollPane(j); 
	        f.add(sp); 
	        // Frame Size 
	        f.setSize(800, 300); 
	        // Frame Visible = true 
	        f.setVisible(true); 
	    } 
	  
	    // Driver  method 
	    public static void main(String[] args) 
	    { 
	        new TableContact(); 
	    } 
}
