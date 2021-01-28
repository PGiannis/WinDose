import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Data1 extends JFrame implements ActionListener {
	private Container c;
	private JLabel title;
	private JLabel name;	
	private JLabel surname;
	private JLabel gender;
	private JLabel age;
	private JLabel districts;
	private JLabel state;
	private JLabel x;
	private JLabel y;
	private JLabel o;
	private JLabel m;
	private JButton close;
	private JButton home;
	private String amka;
	
	public Data1(String amka) {
		this.amka= amka;
		PatientDAO pd = new PatientDAO();
		Patient pad= null;
		try {
			 pad= pd.printPatient(Integer.parseInt(this.amka));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("Positve Form"); 
        setBounds(300, 90, 600, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("DATA"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(250, 30); 
        c.add(title); 
        

        name = new JLabel("Name: " + pad.getFirstname()); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(120, 20); 
        name.setLocation(120, 100); 
        c.add(name); 
        
        surname = new JLabel("Surname: " + pad.getLastname()); 
        surname.setFont(new Font("Arial", Font.PLAIN, 20)); 
        surname.setSize(120, 20); 
        surname.setLocation(370, 100); 
        c.add(surname);
        
        gender = new JLabel("Gender: " + pad.getGender()); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(120, 150); 
        c.add(gender);
        
        String status= getState(pad);
        
        state = new JLabel("State: " + status); 
        state.setFont(new Font("Arial", Font.PLAIN, 20)); 
        state.setSize(100, 20); 
        state.setLocation(120, 200); 
        c.add(state);
        
        age = new JLabel("Age: " + pad.getAge()); 
        age.setFont(new Font("Arial", Font.PLAIN, 20)); 
        age.setSize(120, 20); 
        age.setLocation(370, 150); 
        c.add(age);
        
        
        districts = new JLabel("Districts: " + pad.getDistrict()); 
        districts.setFont(new Font("Arial", Font.PLAIN, 20)); 
        districts.setSize(120, 20); 
        districts.setLocation(370, 200); 
        c.add(districts);
        
        
        
        close = new JButton("Close"); 
        close.setFont(new Font("Arial", Font.PLAIN, 15)); 
        close.setSize(80, 20); 
        close.setLocation(190, 250); 
        close.addActionListener(this); 
        c.add(close); 
        
        home = new JButton("Home"); 
        home.setFont(new Font("Arial", Font.PLAIN, 15)); 
        home.setSize(80, 20); 
        home.setLocation(290, 250); 
        home.addActionListener(this); 
        c.add(home); 
        
        
        
		
        setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
if(arg0.getSource() ==close) {
	System.exit(0);	
		}
else if (arg0.getSource() ==home){
		Login l = new Login();
		l.show();
		dispose();

	}

	}
	public String getState(Patient p) {
		if (!p.isAlive()) {
			return "deceased";
		} else if(p.isEcu()) {
			return "ECU";
		} else if(p.isSymptoms()) {
			return "Symptoms";
		} else {
			return "No Symptoms";
		}
			
	}
}