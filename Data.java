import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Data extends JFrame implements ActionListener {
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
	private JButton home;
	
	public Data() {
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
        

        name = new JLabel("Name:"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(120, 20); 
        name.setLocation(120, 100); 
        c.add(name); 
        
        surname = new JLabel("Surname:"); 
        surname.setFont(new Font("Arial", Font.PLAIN, 20)); 
        surname.setSize(120, 20); 
        surname.setLocation(370, 100); 
        c.add(surname);
        
        gender = new JLabel("Gender:"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(120, 150); 
        c.add(gender);
        
        state = new JLabel("State:"); 
        state.setFont(new Font("Arial", Font.PLAIN, 20)); 
        state.setSize(100, 20); 
        state.setLocation(120, 200); 
        c.add(state);
        
        age = new JLabel("Age:"); 
        age.setFont(new Font("Arial", Font.PLAIN, 20)); 
        age.setSize(120, 20); 
        age.setLocation(370, 150); 
        c.add(age);
        
        
        districts = new JLabel("Districts:"); 
        districts.setFont(new Font("Arial", Font.PLAIN, 20)); 
        districts.setSize(120, 20); 
        districts.setLocation(370, 200); 
        c.add(districts);
        
        
        
        back = new JButton("Back"); 
        back.setFont(new Font("Arial", Font.PLAIN, 15)); 
        back.setSize(80, 20); 
        back.setLocation(190, 250); 
        back.addActionListener(this); 
        c.add(back); 
        
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
if(arg0.getSource() ==back) {
	MiniMenu a = new MiniMenu();	
		}
else if (arg0.getSource() ==home){
		Login l = new Login();
		l.show();
		dispose();

	}

	}
}