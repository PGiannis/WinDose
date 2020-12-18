package src;

import java.util.HashMap;

import javafx.scene.chart.PieChart;

public class Statistics {
	
	public HashMap<String, Integer> percentanceOfPositivesNegatives() {
		
		// συνδεση και άντληση δεδομένων με βάση 
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives", 78);
		temp.put("Negatives", 22);
		return temp;
	}
	
	public HashMap<String, Integer> percentanceOfPositivesInAnArea(int areaDBId) {
		
		
		// συνδεση και άντληση δεδομένων με βάση 
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives in selected area", 50);
		temp.put("Positives in Greece", 50);
		return temp;
		
		
	}
	
	public HashMap<String, Integer> percentanceOfPositivesPerAge(int ageDB) {
		
		
		// συνδεση και άντληση δεδομένων με βάση 
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives in selected area", 80);
		temp.put("Positives in Greece", 20);
		return temp;
		
	}
	
	public HashMap<String, Integer> percentanceOfPositivesPerSex() {
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Women", 78);
		temp.put("Men", 22);
		return temp;
	}
}

