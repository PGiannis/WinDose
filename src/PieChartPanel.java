package src;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;

public class PieChartPanel extends Pane{
	
	public PieChartPanel() {
		this.setPrefSize(500, 500);
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Percentance of positives and negatives",
			        "Percentance of positives per area",
			        "Percentance of positives per age"
			    );
			final ComboBox comboBox = new ComboBox(options);
			this.getChildren().add(comboBox);
	}
	
}
