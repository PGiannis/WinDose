package src;


	import java.awt.event.ActionListener;
import java.util.ArrayList;

// Packages to import 
	import javax.swing.JFrame; 
	import javax.swing.JScrollPane; 
	import javax.swing.JTable; 
	  
	public class TableContact extends JFrame{
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
	        ArrayList<Contact> contacts = null;
	        try {
				contacts = Contact.getContacts();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        String[][] data = new String[contacts.size()][3];
	        int count = 0;
	        Contact c = null;
	        for (String[] line : data) {
	        	c = contacts.get(count);
	        	line[1] = c.getName();
	        	line[0] = String.valueOf(c.getId());
	        	line[2] = c.getPhone();
	        	count++;
	        }
	  
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
