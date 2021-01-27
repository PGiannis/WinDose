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
		temp.put("Positives in selected area", JDBCtry.perAreaPos(areaDBId));
		temp.put("Total positives", JDBCtry.poscount());
		return temp;
		
	}
	
	public HashMap<String, Integer> percentageOfPositivesPerAge(int ageDB) {	
		
		int ageCat = 0;
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		if (ageDB <= 20) {
			ageCat = 1;
		}
		else if (ageDB <= 30) {
			ageCat = 2;
		}
		else if (ageDB <= 40) {
			ageCat = 3;
		}
		else if (ageDB <= 50) {
			ageCat = 4;
		}
		else if (ageDB <= 60) {
			ageCat = 5;
		}
		else if (ageDB <= 70) {
			ageCat = 6;
		}
		else {
			ageCat = 7;
		}
		temp.put("Positives in selected age", JDBCtry.perAgePos(ageCat));
		temp.put("Total positives", JDBCtry.poscount());
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
		temp.put("Deaths", JDBCtry.Mortality());
		temp.put("Total patients", JDBCtry.poscount());
		return temp;
	}
	
	public HashMap<String, Integer>percentageOfAvailiableECU(){
			
			// DB connection
			HashMap<String, Integer> temp = new HashMap<String, Integer>();
			temp.put("Availiable ECU", JDBCtry.ECUCount());
			temp.put("Total ECU", ECUNumber);
			return temp;
		}
	
}

