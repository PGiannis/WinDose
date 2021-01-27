package src;
import java.awt.EventQueue;

public class runContactsInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppearanceContacts frame = new AppearanceContacts();
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}