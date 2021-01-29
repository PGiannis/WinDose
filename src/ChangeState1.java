package src;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ChangeState1 extends JFrame implements ActionListener {

	private Container c;
	private JLabel mess;
	private JComboBox State;
	private JButton commit;
	
	
	private String state[]
			= {"-//-", "Symptoms","No symptoms","ECU","Past away"
					};
private String amka;
	
	public ChangeState1(String amka) {
		this.amka= amka;
		setTitle("Change state"); 
        setBounds(300, 90, 600, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
		
		
	  c = getContentPane(); 
      c.setLayout(null); 
      
      
	mess = new JLabel("change patient state");
	mess.setFont(new Font("Arial", Font.PLAIN, 15)); 
    mess.setSize(150, 20); 
    mess.setLocation(110, 100); 
     c.add(mess); 
	
	
     
	 State = new JComboBox(state); 
     State.setFont(new Font("Arial", Font.PLAIN, 15)); 
     State.setSize(120, 30); 
     State.setLocation(250, 95); 
     c.add(State);
     
     commit = new JButton("Commit"); 
     commit.setFont(new Font("Arial", Font.PLAIN, 15)); 
     commit.setSize(120, 30); 
     commit.setLocation(250, 230); 
     commit.addActionListener(this); 
     c.add(commit);
     
     
     
     
     
	
     setVisible(true);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		PatientDAO pd= new PatientDAO();
		Patient pat= null;
		try {
			 pat= pd.printPatient(Integer.parseInt(this.amka));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String status = (String)State.getSelectedItem()	;	
		boolean[] values=null;
		try {
			values = setStatus(status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pat.setAlive(values[0]);
		pat.setEcu(values[1]);
		pat.setSymptoms(values[2]);
		try {
			pd.updatePatient(pat);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	public boolean[] setStatus(String status) throws Exception {
		
		boolean[] values= {false,false,false};
		if(status== "Past away") {
			
			values[1]= true;
			values[2]= true;
			return values;
		} else if(status== "ECU") {
			values[0]= true;
			values[1]= true;
			values[2]= true;
		return values;
		} else if(status== "Symptoms") {
			values[0]= true;
			values[2]= true;
			return values;
		} else if(status== "No symptoms") {
			values[0]= true;
			return values;
		} else {
			throw new Exception ("No state selected");
			}
	} 

}