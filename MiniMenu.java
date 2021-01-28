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
	
	public MiniMenu() {
	
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
		if(arg0.getSource() == print) {
			Data j = new Data();
			j.show();
			dispose();
		}
		else if (arg0.getSource() ==change) {
			Chane_state g = new Change_state();
			g.show();
			dispose();
			
		}
	}

}
