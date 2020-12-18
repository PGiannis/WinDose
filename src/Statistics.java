package src;

import java.util.HashMap;

import javafx.scene.chart.PieChart;

public class Statistics {
	
	public HashMap<String, Integer> percentageOfPositivesNegatives() {
		
		// συνδεση και άντληση δεδομένων με βάση 
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives", 200);
		temp.put("Negatives", 100);
		return temp;
	}
	
	public HashMap<String, Integer> percentageOfPositivesInAnArea(int areaDBId) {
		
		
		// συνδεση και άντληση δεδομένων με βάση 
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives in selected area", 40);
		temp.put("Negatives in selected area", 60);
		return temp;
		
		
	}
	
	public HashMap<String, Integer> percentageOfPositivesPerAge(int ageDB) {
		
		
		// συνδεση και άντληση δεδομένων με βάση 
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives in selected area", 80);
		temp.put("Negatives in selected area", 20);
		return temp;
		
	}
	
	public HashMap<String, Integer> percentageOfPositivesPerSex() {
		
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Women", 78);
		temp.put("Men", 22);
		return temp;
	}
}

