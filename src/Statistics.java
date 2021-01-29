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

		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positives in selected age group", JDBCtry.perAgePos(ageDB));
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
	
	public HashMap<String, Integer>percentageOfAvailableECU(){
			
			// DB connection
		    int ecu = JDBCtry.ECUCount();
			HashMap<String, Integer> temp = new HashMap<String, Integer>();
			temp.put("Used ECUs", ecu);
			if (ecu >=ECUNumber){
				temp.put("Available ECUs", 0);
			} else {
				temp.put("Available ECUs", ECUNumber-ecu);
			}
			return temp;
		}
	
}

