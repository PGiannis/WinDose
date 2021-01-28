package src;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Negative_Form extends JFrame implements ActionListener {

	/* Class variables */

	private Container c;
	private JLabel title;
	private ImageIcon image;
	private JLabel firstName1;
	private JTextField firstName2;
	private JLabel lastname1;
	private JTextField lastname2;
	private JLabel dob;
	private JComboBox bdate;
	private JComboBox bmonth;
	private JComboBox byear;
	private JLabel test_date;
	private JComboBox tdate;
	private JComboBox tmonth;
	private JComboBox tyear;
	private JLabel amka;
	private JTextField Amka;
	private JLabel district;
	private JComboBox District;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private JButton sub;
	private JButton back;
	private JButton Home;
	private ButtonGroup gengp;
	private JLabel invalid;

	private String dates[] = { "-//-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

	private String months[] = { "-//-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

	private String years[] = { "-//-", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012",
			"2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999",
			"1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986",
			"1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973",
			"1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960",
			"1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947",
			"1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934",
			"1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921",
			"1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913" };

	private String Destricts[] = { "-//-", "Perifereia Attikis", "Pereiferia Anatolikis Makedonias & Thrakis",
			"Perifereia Boreiou Aigaiou", "Perifereia Dytikis Elladas", "Perifereia Dytikis Makedonias",
			"Perifereia Hpeirou", "Perifereia Thessalias", "Perifereia Ioniwn Nhsiwn",
			"Perifereia Kentrikis Makedonias", "Perifereia Krhths", "Perifereia Notiou Aigaiou",
			"Perifereia Peloponisou", "Perifereia Stereas Elladas" };

	public Negative_Form() {

		ImageIcon image = new ImageIcon("/Users/johnpetsas/Desktop/java2_Windose/WinDose/src/Home4.jpg");

		setTitle("Negative Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		/* Page Title */
		title = new JLabel("Negative Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		/* firstName label method */
		firstName1 = new JLabel("First Name");
		firstName1.setFont(new Font("Arial", Font.PLAIN, 20));
		firstName1.setSize(120, 20);
		firstName1.setLocation(80, 100);
		c.add(firstName1);

		/* firstName TextField method */
		firstName2 = new JTextField();
		firstName2.setFont(new Font("Arial", Font.PLAIN, 15));
		firstName2.setSize(190, 20);
		firstName2.setLocation(180, 100);
		c.add(firstName2);

		/* Lastname label method */
		lastname1 = new JLabel("Last Name");
		lastname1.setFont(new Font("Arial", Font.PLAIN, 20));
		lastname1.setSize(120, 20);
		lastname1.setLocation(450, 100);
		c.add(lastname1);

		/* Lastname TextField method */
		lastname2 = new JTextField();
		lastname2.setFont(new Font("Arial", Font.PLAIN, 15));
		lastname2.setSize(190, 20);
		lastname2.setLocation(550, 100);
		c.add(lastname2);

		/* Date of Birth method */
		dob = new JLabel("Date of Birth");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(120, 20);
		dob.setLocation(80, 150);
		c.add(dob);

		bdate = new JComboBox(dates);
		bdate.setFont(new Font("Arial", Font.PLAIN, 15));
		bdate.setSize(70, 20);
		bdate.setLocation(220, 150);
		c.add(bdate);

		bmonth = new JComboBox(months);
		bmonth.setFont(new Font("Arial", Font.PLAIN, 15));
		bmonth.setSize(80, 20);
		bmonth.setLocation(300, 150);
		c.add(bmonth);

		byear = new JComboBox(years);
		byear.setFont(new Font("Arial", Font.PLAIN, 15));
		byear.setSize(100, 20);
		byear.setLocation(400, 150);
		c.add(byear);

		/* Testing date method */
		test_date = new JLabel("Testing Date");
		test_date.setFont(new Font("Arial", Font.PLAIN, 20));
		test_date.setSize(150, 20);
		test_date.setLocation(80, 300);
		c.add(test_date);

		tdate = new JComboBox(dates);
		tdate.setFont(new Font("Arial", Font.PLAIN, 15));
		tdate.setSize(70, 20);
		tdate.setLocation(220, 300);
		c.add(tdate);

		tmonth = new JComboBox(months);
		tmonth.setFont(new Font("Arial", Font.PLAIN, 15));
		tmonth.setSize(80, 20);
		tmonth.setLocation(300, 300);
		c.add(tmonth);

		tyear = new JComboBox(years);
		tyear.setFont(new Font("Arial", Font.PLAIN, 15));
		tyear.setSize(100, 20);
		tyear.setLocation(400, 300);
		c.add(tyear);

		/* AMKA label method */
		amka = new JLabel("AMKA");
		amka.setFont(new Font("Arial", Font.PLAIN, 20));
		amka.setSize(100, 20);
		amka.setLocation(80, 200);
		c.add(amka);

		/* AMKA TextField method */
		Amka = new JTextField();
		Amka.setFont(new Font("Arial", Font.PLAIN, 15));
		Amka.setSize(190, 20);
		Amka.setLocation(180, 200);
		c.add(Amka);

		/* District label method */
		district = new JLabel("Select your District");
		district.setFont(new Font("Arial", Font.PLAIN, 20));
		district.setSize(200, 20);
		district.setLocation(80, 350);
		c.add(district);

		/* District ComboBox method */
		District = new JComboBox(Destricts);
		District.setFont(new Font("Arial", Font.PLAIN, 15));
		District.setSize(400, 20);
		District.setLocation(280, 350);
		c.add(District);

		/* Symptoms method */
		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(80, 250);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(180, 250);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(160, 20);
		female.setLocation(240, 250);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);
		/* Submit Button method */
		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(80, 20);
		sub.setLocation(300, 500);
		sub.addActionListener(this);
		c.add(sub);

		/* Back button method */
		back = new JButton("Back");
		back.setFont(new Font("Arial", Font.PLAIN, 15));
		back.setSize(80, 20);
		back.setLocation(450, 500);
		back.addActionListener(this);
		c.add(back);

		/* Home button method */
		Home = new JButton(image);
		Home.setFont(new Font("Arial", Font.PLAIN, 15));
		Home.setSize(60, 60);
		Home.setLocation(820, 500);
		Home.addActionListener(this);
		c.add(Home);

		invalid = new JLabel("");
		invalid.setBounds(300, 300, 400, 300);
		c.add(invalid);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == sub) {

			try {
				boolean error = false;
				if (firstName2.getText().length() < 5) {
					error = true;
				}
				if (lastname2.getText().length() < 5) {
					error = true;
				}

				if (dob == null) {
					error = true;
				}
				if (Amka.getText().length() < 9) {
					error = true;
				}

				if (tdate == null) {
					error = true;
				}
				if (((String) District.getSelectedItem()).length() < 5) {
					error = true;
				}
				if (error) {
					throw new Exception();
				}
				String firstName = firstName2.getText();
				String lastname = lastname2.getText();
				Date DOB = null;

				DOB = Date.valueOf((String) byear.getSelectedItem() + "-" + (String) bmonth.getSelectedItem() + "-"
						+ (String) bdate.getSelectedItem());
				int AMKA = Integer.parseInt(Amka.getText());
				Date TD = Date.valueOf(new String(tyear.getSelectedItem() + "-" + (String) tmonth.getSelectedItem()
						+ "-" + (String) tdate.getSelectedItem()));
				String Destrict = (String) District.getSelectedItem() + "\n";

				String gender = "";
				if (male.isSelected()) {
					gender = "M";

				} else if (female.isSelected()) {
					gender = "F";
				}

				Patient p = new Patient(AMKA, firstName, lastname, Destrict, TD, DOB, gender, false, false, false,
						true);

				try {
					p.writePatientToDB();
				} catch (Exception e11) {

					e11.printStackTrace();
				}

				JOptionPane.showMessageDialog(sub, "You have successfully registered");

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(sub, "Some form fields are invalid! Try again.");
			}

		} else if (e.getSource() == back) {

			Test t = new Test();
			t.show();
			dispose();
		} else if (e.getSource() == Home) {

			Home h = new Home();
			h.show();
			dispose();
		}
	}
}
