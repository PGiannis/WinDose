package src;

import java.util.HashMap;

public class Statistics {
	
	public HashMap<String, Integer> percentanceOfPositiveNegative() {
		
		// συνδεση και άντληση δεδομένων με βάση 
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put("Positive", 78);
		temp.put("Negative", 22);
		return temp;
	}
	
	/*
	public statistics() {
	//δέχεται τις παραμέτρους
		double posostoPos;
		double posostoNeg;
		int pos;
		int neg;
		String perioxi;
		int s;
		
		
		if (s=1) { 
			System.out.println("Ποσοστό θετικών-αρνητικών τεστ: ");
			posostoPos = pos / (pos + neg) * 100);
			posostoNeg = neg / (pos + neg) * 100);
			PieChartSample posNeg = new PieChartSample;
			posNeg.posPie(posostoPos, posostoNeg);
			
		} else if (s=2) {
			System.out.println("Ποσοστό θετικών κρουσμάτων στην περιοχή" + perioxi );
			posostoPos = posPer / (posPer + negPer) * 100);
			posostoNeg = neg / (pos + neg) * 100);
			PieChartSample posNeg = new PieChartSample;
			posNeg.posPie(posostoPos, posostoNeg);
		} else if (s=3) {
			
			posostoPos = posPer / (posPer + negPer) * 100);
			posostoNeg = neg / (pos + neg) * 100);
			PieChartSample posNeg = new PieChartSample;
			posNeg.posPie(posostoPos, posostoNeg);
		} else if (s=4) {
			
			
			
		} else if (s=5) {
			
		}
		
	}	
	
	*/
}

