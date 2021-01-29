package src;

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
	private JButton back;
	private JButton Home;
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
		setTitle("Data"); 
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
        name.setSize(180, 20); 
        name.setLocation(50, 100); 
        c.add(name); 
        
        surname = new JLabel("Surname: " + pad.getLastname()); 
        surname.setFont(new Font("Arial", Font.PLAIN, 20)); 
        surname.setSize(180, 20); 
        surname.setLocation(240, 100); 
        c.add(surname);
        
        gender = new JLabel("Gender: " + pad.getGender()); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(50, 150); 
        c.add(gender);
        
        String status= getState(pad);
        
        state = new JLabel("State: " + status); 
        state.setFont(new Font("Arial", Font.PLAIN, 20)); 
        state.setSize(120, 20); 
        state.setLocation(240, 150); 
        c.add(state);
        
        age = new JLabel("Age: " + pad.getAge()); 
        age.setFont(new Font("Arial", Font.PLAIN, 20)); 
        age.setSize(120, 20); 
        age.setLocation(420, 150); 
        c.add(age);
        
        
        districts = new JLabel("Districts: " + pad.getDistrict()); 
        districts.setFont(new Font("Arial", Font.PLAIN, 20)); 
        districts.setSize(500, 20); 
        districts.setLocation(50, 200); 
        c.add(districts);
        
        
        
        back = new JButton("Back"); 
        back.setFont(new Font("Arial", Font.PLAIN, 15)); 
        back.setSize(80, 20); 
        back.setLocation(190, 300); 
        back.addActionListener(this); 
        c.add(back); 
        
        Home = new JButton("Home");
		Home.setFont(new Font("Arial", Font.PLAIN, 15));
		Home.setSize(80, 20);
		Home.setLocation(290, 300);
		Home.addActionListener(this);
		c.add(Home);
        
        
        
		
        setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
if(arg0.getSource() == back) {
	MiniMenu1 m = new MiniMenu1(this.amka);
	m.show();
	dispose();
		
		}
else if (arg0.getSource() ==Home){
		Home h = new Home();
		h.show();
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