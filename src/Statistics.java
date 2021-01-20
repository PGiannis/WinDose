package src;

import java.util.HashMap;

import javafx.scene.chart.PieChart;

public class Statistics {
	
	public HashMap<String, Integer> percentageOfPositivesNegatives() {
		
		
		// DB connection
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives", 200);
		temp.put("Negatives", 100);
		return temp;
	}
	
	public HashMap<String, Integer> percentageOfPositivesInAnArea(int areaDBId) {
		
		
		// DB connection
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives in selected area", 40);
		temp.put("Negatives in selected area", 60);
		return temp;
		
	}
	
	public HashMap<String, Integer> percentageOfPositivesPerAge(int ageDB) {
		
		
		// DB connection (να αλλάξουμε και τις αντίστοιχες τιμές που έχω βάλλει για να τρέχουν) 
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Selected Age", ageDB);
		temp.put("Total", 20);
	//	temp.put("20-29", 20);
	//	temp.put("30-39", 20);
	//	temp.put("40-49", 20);
	//	temp.put("50-59", 20);
	//	temp.put("60-69", 20);
	//	temp.put("70+", 20);
		return temp;
		
	}
	
	public HashMap<String, Integer> percentageOfPositivesPerSex() {
		
		
		// DB connection
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Women", 50);
		temp.put("Men", 50);
		return temp;
		
	}
	
	public HashMap<String, Integer>mortalityRate(){
		
		// DB connection
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Deaths", 10);
		temp.put("Total patients", 90);
		return temp;
	}
	
	public HashMap<String, Integer>percentageOfAvailiableICU(){
			
			// DB connection
			HashMap<String, Integer> temp = new HashMap<String, Integer>();
			temp.put("Availiable ICU", 35);
			temp.put("Used ICU", 65);
			return temp;
		}
	
	
}

