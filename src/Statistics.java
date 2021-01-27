package src;

import java.util.HashMap;

import javafx.scene.chart.PieChart;

public class Statistics {
	
	final static int ECUNumber = 400;
	
	public HashMap<String, Integer> percentageOfPositivesNegatives() {
		
		
		// DB connection
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives", JDBCtry.poscount());
		temp.put("Negatives", JDBCtry.negcount());
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
		
		
		// DB connection  
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Selected Age", ageDB);
		temp.put("Total", JDBCtry.poscount());
	//	temp.put("20-29", 20);
	//	temp.put("30-39", 20);
	//	temp.put("40-49", 20);
	//	temp.put("50-59", 20);
	//	temp.put("60-69", 20);
	//	temp.put("70+", 20);
		return temp;
		
	}
	
	public HashMap<String, Integer> percentageOfPositivesPerGender() {
		
		
		// DB connection
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Women", JDBCtry.FemaleCount());
		temp.put("Men", JDBCtry.MaleCount());
		return temp;
		
	}
	
	public HashMap<String, Integer>mortalityRate(){
		
		// DB connection
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Deaths", 10);
		temp.put("Total patients", JDBCtry.poscount());
		return temp;
	}
	
	public HashMap<String, Integer>percentageOfAvailiableICU(){
			
			// DB connection
			HashMap<String, Integer> temp = new HashMap<String, Integer>();
			temp.put("Availiable ICU", 35);
			temp.put("Total ECU", ECUNumber);
			return temp;
		}
	
}

