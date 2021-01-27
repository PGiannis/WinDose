package src;


import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PieChartPanel extends Pane{
	
	public PieChartPanel() {
		this.setPrefSize(500, 500);
		HBox hbox =  new HBox(15);
		hbox.setPadding(new Insets(10, 120, 10, 120));
		VBox vbox = new VBox();//	1)+/-
		VBox vbox1 = new VBox();//	2)areas
		VBox vbox2 = new VBox();//	3)ages
		VBox vbox3 = new VBox();//	4)sex
		VBox vbox4 = new VBox();//	5)deaths
		VBox vbox5 = new VBox();//	6)ICU 
		TextField textf = new TextField();
		textf.setPromptText("Type your age");
		Button b = new Button("Search");
		vbox2.getChildren().add(textf);
		vbox2.getChildren().add(b);
		
		
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
				
				switch(selectedIndex) {
					case 0:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentageOfPositivesPerArea(selectedIndex));
						break;
					case 1:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentageOfPositivesPerArea(selectedIndex));
						break;
					case 2:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentageOfPositivesPerArea(selectedIndex));
						break;
					case 3:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentageOfPositivesPerArea(selectedIndex));
						break;
					case 4: 
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentageOfPositivesPerArea(selectedIndex));
						break;
					case 5: 
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentageOfPositivesPerArea(selectedIndex));
						break;
					case 6:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentageOfPositivesPerArea(selectedIndex));
						break;
					case 7:
						if (vbox1.getChildren().size() > 1) {
							vbox1.getChildren().remove(1);
						}
						vbox1.getChildren().add(PieChartPanel.percentageOfPositivesPerArea(selectedIndex));
						break;
						
						default:
							
					}
				}
				
			} );
		// end of area
	
	
		// central
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Percentage of positives and negatives",
			        "Percentage of positives per area",
			        "Percentage of positives per age",
			        "Percentage of positives per sex",
			        "Mortality Rate",
			        "Completeness of ICU"
			    );
			ComboBox<String> comboBox = new ComboBox<String>(options);
			comboBox.setPromptText("Please select");
			comboBox.setOnAction(new EventHandler() {
			
				@Override
				public void handle(Event event) {
					int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
					switch(selectedIndex) {
						case 0://	+/-
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							} else if (vbox1.getChildren().size() > 1) {
								vbox1.getChildren().remove(1);
							} else if (vbox2.getChildren().size() > 1) {
								vbox2.getChildren().remove(1);
							} else if (vbox3.getChildren().size() > 1) {
								vbox3.getChildren().remove(1);
							} else if (vbox4.getChildren().size() > 1) {
								vbox4.getChildren().remove(1);
							} else if (vbox5.getChildren().size() > 1) {
								vbox5.getChildren().remove(1);
							}
							vbox.getChildren().add(PieChartPanel.percentageOfPositivesNegatives());
							break;
							
						case 1://	areas
							
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							} else if (vbox1.getChildren().size() > 1) {
								vbox1.getChildren().remove(1);
							} else if (vbox2.getChildren().size() > 1) {
								vbox2.getChildren().remove(1);
							} else if (vbox3.getChildren().size() > 1) {
								vbox3.getChildren().remove(1);
							} else if (vbox4.getChildren().size() > 1) {
								vbox4.getChildren().remove(1);
							} else if (vbox5.getChildren().size() > 1) {
								vbox5.getChildren().remove(1);
							}
															
							vbox1.setPadding(new Insets(10, 10, 10, 10));
							HBox hbox1 = new HBox();
							hbox1.setPadding(new Insets(5, 140, 5, 140));
							hbox1.getChildren().add(comboBoxArea);
							vbox1.getChildren().add(hbox1);							
							vbox.getChildren().add(vbox1);
							break;
							
						case 2://	ages
							
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							} else if (vbox1.getChildren().size() > 1) {
								vbox1.getChildren().remove(1);
							} else if (vbox2.getChildren().size() > 1) {
								vbox2.getChildren().remove(1);
							} else if (vbox3.getChildren().size() > 1) {
								vbox3.getChildren().remove(1);
							} else if (vbox4.getChildren().size() > 1) {
								vbox4.getChildren().remove(1);
							} else if (vbox5.getChildren().size() > 1) {
								vbox5.getChildren().remove(1);
							}
				
							
							textf.setPromptText("Type your age");
							Button b = new Button("Search");
							b.setOnAction(new EventHandler<ActionEvent>() {

								@Override
								public void handle(ActionEvent event) {
									if (textf.getText().isEmpty()) {
										Alert a = new Alert(AlertType.ERROR, "Type an age", ButtonType.CLOSE);
										a.setContentText("Please type an age");
										a.show();	
									} else {
										if (vbox.getChildren().size() > 2) {
											vbox.getChildren().remove(2);
										}
										vbox.getChildren().add(PieChartPanel.percentageOfPositivesPerAge(Integer.parseInt(textf.getText())));
					
									}
								}
								
							});
							
							
							
							HBox hbox2 = new HBox();
							hbox2.setPadding(new Insets(5, 140, 5, 140));
							hbox2.getChildren().add(textf);
							hbox2.getChildren().add(b);
							
							vbox2.getChildren().add(hbox2);
							
							vbox.getChildren().add(vbox2);
							break;
							
						case 3://	sex
							
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							} else if (vbox1.getChildren().size() > 1) {
								vbox1.getChildren().remove(1);
							} else if (vbox2.getChildren().size() > 1) {
								vbox2.getChildren().remove(1);
							} else if (vbox3.getChildren().size() > 1) {
								vbox3.getChildren().remove(1);
							} else if (vbox4.getChildren().size() > 1) {
								vbox4.getChildren().remove(1);
							} else if (vbox5.getChildren().size() > 1) {
								vbox5.getChildren().remove(1);
							}
							vbox.getChildren().add(PieChartPanel.percentageOfPositivesPerGender());
							break;

						case 4://	deaths
							
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							} else if (vbox1.getChildren().size() > 1) {
								vbox1.getChildren().remove(1);
							} else if (vbox2.getChildren().size() > 1) {
								vbox2.getChildren().remove(1);
							} else if (vbox3.getChildren().size() > 1) {
								vbox3.getChildren().remove(1);
							} else if (vbox4.getChildren().size() > 1) {
								vbox3.getChildren().remove(1);
							} else if (vbox4.getChildren().size() > 1) {
								vbox4.getChildren().remove(1);
							} else if (vbox5.getChildren().size() > 1) {
								vbox5.getChildren().remove(1);
							}
							vbox.getChildren().add(PieChartPanel.mortalityRate());
							break;
							
						case 5://	ECU
							if (vbox.getChildren().size() > 1) {
								vbox.getChildren().remove(1);
							} else if (vbox1.getChildren().size() > 1) {
								vbox1.getChildren().remove(1);
							} else if (vbox2.getChildren().size() > 1) {
								vbox2.getChildren().remove(1);
							} else if (vbox3.getChildren().size() > 1) {
								vbox3.getChildren().remove(1);
							} else if (vbox4.getChildren().size() > 1) {
								vbox4.getChildren().remove(1);
							} else if (vbox5.getChildren().size() > 1) {
								vbox5.getChildren().remove(1);
							}
							vbox.getChildren().add(PieChartPanel.percentageOfAvailiableECU());
							break;
					}
				}	
				} );
				hbox.getChildren().add(comboBox);
				vbox.getChildren().add(hbox);
				this.getChildren().add(vbox);
				
		}
		
	// end of central
	
	public static PieChart percentageOfPositivesNegatives() {
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentageOfPositivesNegatives();
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Positives", temp.get("Positives")),
				new PieChart.Data("Negatives", temp.get("Negatives"))
				);
		
		return new PieChart(pieChartData);
	}
	
	public static PieChart percentageOfPositivesPerArea(int areaId) {
		HashMap<Integer, Integer> areasId = new HashMap<Integer, Integer>();
		areasId.put(0, 0 );// 
		areasId.put(1, 1 );
		areasId.put(2, 2 );
		areasId.put(3, 3 );
		areasId.put(4, 4 );
		areasId.put(5, 5 );
		areasId.put(6, 6 );
		areasId.put(7, 7 );
		
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentageOfPositivesInAnArea(areasId.get(areaId));
		
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Positives in selected area", temp.get("Positives in selected area")),
				new PieChart.Data("Negatives in selected area", temp.get("Negatives in selected area"))
				);
		
		return new PieChart(pieChartData);
	}
	
	
	public static PieChart percentageOfPositivesPerAge(int ageDB) {
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentageOfPositivesPerAge(ageDB);
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				
				new PieChart.Data("Selected Age", temp.get("Selected Age")),
				new PieChart.Data("Total", temp.get("Total"))
				);
		
		return new PieChart(pieChartData);
	}
	
	
	public static PieChart percentageOfPositivesPerGender() {
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentageOfPositivesPerGender();
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Women", temp.get("Women")),
				new PieChart.Data("Men", temp.get("Men"))
				);
		
		return new PieChart(pieChartData);
	}
	

	public static PieChart mortalityRate() {
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.mortalityRate();
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Deaths", temp.get("Deaths")),
				new PieChart.Data("Total patients", temp.get("Total patients"))
				);
		
		return new PieChart(pieChartData);
	}
	
	public static PieChart percentageOfAvailiableECU() {
		Statistics stat = new Statistics();
		HashMap<String, Integer> temp = stat.percentageOfAvailiableECU();
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Availiable ECU", temp.get("Availiable ECU")),
				new PieChart.Data("Total ECU", temp.get("Total ECU"))
				);

		return new PieChart(pieChartData);
	}
	
}













