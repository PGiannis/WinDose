package src;


import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PieChartPanel extends Pane{
	
	public PieChartPanel() {
		this.setPrefSize(500, 500);
		HBox hbox =  new HBox(15);
		hbox.setPadding(new Insets(10, 120, 10, 120));
		VBox vbox = new VBox();
		VBox vbox1 = new VBox();
		VBox vbox2 = new VBox();
		VBox vbox3 = new VBox();
		
		//area
		ObservableList<String> areas = 
			    FXCollections.observableArrayList(
			    	"Attica", 
				   	"Macedonia", 
				   	"Thrace", 
				   	"Peloponnese", 
					"Ionian Islands", 
					"Aegean Islands", 
					"Epirus", 
					"Thessaly"
			    );
		ComboBox<String> comboBoxArea = new ComboBox<String>(areas);
		comboBoxArea.setPromptText("Please select an area");
		comboBoxArea.setOnAction(new EventHandler() {
			
			@Override
			public void handle(Event event) {
				int selectedIndex = comboBoxArea.getSelectionModel().getSelectedIndex();
				//System.out.println("Selection made: [" + selectedIndex + "] ");
				switch(selectedIndex) {
					case 0:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentanceOfPositivesPerArea(selectedIndex));
						break;
					case 1:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentanceOfPositivesPerArea(selectedIndex));
						break;
					case 2:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentanceOfPositivesPerArea(selectedIndex));
						break;
					case 3:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentanceOfPositivesPerArea(selectedIndex));
						break;
					case 4: 
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentanceOfPositivesPerArea(selectedIndex));
						break;
					case 5: 
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentanceOfPositivesPerArea(selectedIndex));
						break;
					case 6:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentanceOfPositivesPerArea(selectedIndex));
						break;
					case 7:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentanceOfPositivesPerArea(selectedIndex));
						break;
						
						default:
							
					}
				}
				
			} );
		// end of area
		
		// age
		ObservableList<String> ages = 
			    FXCollections.observableArrayList(
				    	"0-9", 
				    	"10-19", 
				    	"20-29", 
				    	"30-39", 
						"40-49", 
						"50-60", 
						"69-70", 
						"70+"
			    );
		ComboBox<String> comboBoxAge = new ComboBox<String>(ages);
		comboBoxAge.setPromptText("Please select an age group");
		comboBoxAge.setOnAction(new EventHandler() {
			
			@Override
			public void handle(Event event) {
				int selectedIndex = comboBoxAge.getSelectionModel().getSelectedIndex();
				//System.out.println("Selection made: [" + selectedIndex + "] ");
				switch(selectedIndex) {
					case 0:
						if (vbox2.getChildren().size() > 1) {
							vbox2.getChildren().remove(1);
						}
						vbox2.getChildren().add(PieChartPanel.percentanceOfPositivesPerAge(selectedIndex));
						break;
					case 1:
						if (vbox2.getChildren().size() > 1) {
							vbox2.getChildren().remove(1);
						}
						vbox2.getChildren().add(PieChartPanel.percentanceOfPositivesPerAge(selectedIndex));
						break;
					case 2:
						if (vbox2.getChildren().size() > 1) {
							vbox2.getChildren().remove(1);
						}
						vbox2.getChildren().add(PieChartPanel.percentanceOfPositivesPerAge(selectedIndex));
						break;
					case 3:
						if (vbox2.getChildren().size() > 1) {
							vbox2.getChildren().remove(1);
						}
						vbox2.getChildren().add(PieChartPanel.percentanceOfPositivesPerAge(selectedIndex));
						break;
					case 4: 
						if (vbox2.getChildren().size() > 1) {
							vbox2.getChildren().remove(1);
						}
						vbox2.getChildren().add(PieChartPanel.percentanceOfPositivesPerAge(selectedIndex));
						break;
					case 5: 
						if (vbox2.getChildren().size() > 1) {
							vbox2.getChildren().remove(1);
						}
						vbox2.getChildren().add(PieChartPanel.percentanceOfPositivesPerAge(selectedIndex));
						break;
					case 6:
						if (vbox2.getChildren().size() > 1) {
							vbox2.getChildren().remove(1);
						}
						vbox2.getChildren().add(PieChartPanel.percentanceOfPositivesPerAge(selectedIndex));
						break;
					case 7:
						if (vbox2.getChildren().size() > 1) {
							vbox2.getChildren().remove(1);
						}
						vbox2.getChildren().add(PieChartPanel.percentanceOfPositivesPerAge(selectedIndex));
						break;
					
					default:
						
				}
			}
			
		} );
		// end of age
		
		
		
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Percentance of positives and negatives",
			        "Percentance of positives per area",
			        "Percentance of positives per age",
			        "Percentance of positives per sex",
			        "Percentance of deaths"
			    );
			ComboBox<String> comboBox = new ComboBox<String>(options);
			comboBox.setPromptText("Please select");
			comboBox.setOnAction(new EventHandler() {
			
				@Override
				public void handle(Event event) {
					int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
					//System.out.println("Selection made: [" + selectedIndex + "] ");
					switch(selectedIndex) {
						case 0:
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							}
							vbox.getChildren().add(PieChartPanel.percentanceOfPositivesNegatives());
							break;
						case 1:
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							}
							
							vbox1.setPadding(new Insets(10, 10, 10, 10));
							HBox hbox1 = new HBox();
							hbox1.setPadding(new Insets(5, 140, 5, 140));
							hbox1.getChildren().add(comboBoxArea);
							vbox1.getChildren().add(hbox1);
							
							vbox.getChildren().add(vbox1);
							break;
						case 2:
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							}
							
							vbox2.setPadding(new Insets(10, 10, 10, 10));
							HBox hbox2 = new HBox();
							hbox2.setPadding(new Insets(5, 140, 5, 140));
							hbox2.getChildren().add(comboBoxAge);
							vbox2.getChildren().add(hbox2);
							vbox.getChildren().add(vbox2);
							break;
						case 3:
							if (vbox3.getChildren().size() > 1) {
								vbox3.getChildren().remove(1);
							}
							vbox3.getChildren().add(PieChartPanel.percentanceOfPositivesPerSex());
							break;
						default:
							
					}
				}
				
			} );
			hbox.getChildren().add(comboBox);
			vbox.getChildren().add(hbox);
			this.getChildren().add(vbox);
			
	}
	
	public static PieChart percentanceOfPositivesNegatives() {
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentanceOfPositivesNegatives();
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Positives", temp.get("Positives")),
				new PieChart.Data("Negatives", temp.get("Negatives"))
				);
		
		return new PieChart(pieChartData);
	}
	
	public static PieChart percentanceOfPositivesPerArea(int areaId) {
		HashMap<Integer, Integer> areasId = new HashMap<Integer, Integer>();
		areasId.put(0, 50 );// 1o to νούμερον του case και 2ο το id απο βάση
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentanceOfPositivesInAnArea(areasId.get(areaId));
		
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Positives", temp.get("Positives")),
				new PieChart.Data("Negatives", temp.get("Negatives"))
				);
		
		return new PieChart(pieChartData);
	}
	
	public static PieChart percentanceOfPositivesPerAge(int ageId) {
		HashMap<Integer, Integer> agesId = new HashMap<Integer, Integer>();
		agesId.put(0, 50 );// 1o to νούμερον του case και 2ο το id απο βάση
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentanceOfPositivesPerAge(agesId.get(ageId));
		
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Positives", temp.get("Positives")),
				new PieChart.Data("Negatives", temp.get("Negatives"))
				);
		
		return new PieChart(pieChartData);
	}
	
	public static PieChart percentanceOfPositivesPerSex() {
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentanceOfPositivesPerSex();
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Women", temp.get("Women")),
				new PieChart.Data("Men", temp.get("Men"))
				);
		
		return new PieChart(pieChartData);
	}
	
}

	














