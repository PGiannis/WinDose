package src;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class  MiniMenu extends JFrame implements ActionListener {
    
	private Container c;
	private JButton print;
	private JButton change;
	Patient p;
	
	public MiniMenu(Patient p) {
		this.p = p;
		setTitle("MiniMenu"); 
        setBounds(300, 90, 600, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
		
        print = new JButton("Print Data"); 
        print.setFont(new Font("Arial", Font.PLAIN, 15)); 
        print.setSize(170, 40); 
        print.setLocation(200, 200); 
        print.addActionListener(this); 
        c.add(print); 
        
       change = new JButton("Change State"); 
       change.setFont(new Font("Arial", Font.PLAIN, 15)); 
       change.setSize(170, 40); 
       change.setLocation(200, 100); 
       change.addActionListener(this); 
       c.add(change);
        
        
       setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String amka = String.valueOf(this.p.getAmka());
		if(arg0.getSource() == print) {
			Data1 j = new Data1(amka);
			j.show();
			dispose();
		}
		else if (arg0.getSource() == change) {
			ChangeState1 g = new ChangeState1(amka);
			g.show();
			dispose();
			
		}
	}

}
