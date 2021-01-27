
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
        print.setSize(80, 20); 
        print.setLocation(250, 200); 
        print.addActionListener(this); 
        c.add(print); 
        
       change = new JButton("Change State"); 
       change.setFont(new Font("Arial", Font.PLAIN, 15)); 
       change.setSize(80, 20); 
       change.setLocation(250, 100); 
       change.addActionListener(this); 
        c.add(change);
        
        
        setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == print) {
			Johny j = new Johny();
			j.show();
			dispose();
		}
		else if (arg0.getSource() ==change) {
			golfi g = new golfi();
			g.show();
			dispose();
			
		}
	}

}