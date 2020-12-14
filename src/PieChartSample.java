package src;

import java.util.HashMap;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.Group;
 
public class PieChartSample extends Application {
 
	
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Statistics"); //τίτλος παραθύρου
        stage.setWidth(500); // πλάτος παραθύρου
        stage.setHeight(500);// υψος παραθύρου

        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("Statistic");
        MenuItem item1 = new MenuItem("Percentance of positive and negative");
        item1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
            	Statistics stat = new Statistics();
            	HashMap<String, Integer> temp = stat.percentanceOfPositiveNegative();
            	
                // πίτα για θετικούς - αρνητικούς
                ObservableList<PieChart.Data> pieChartData =
                        FXCollections.observableArrayList(
                        new PieChart.Data("Positive", temp.get("Positive")),
                        new PieChart.Data("Negative", temp.get("Negative")));

                      
                final PieChart chart = new PieChart(pieChartData);
                chart.setTitle("Statistics Covid-19"); //τίτλος πίτας
                ((Group) scene.getRoot()).getChildren().add(chart);
            }
        });
        menuFile.getItems().add(item1);
        menuBar.getMenus().addAll(menuFile);
        ((Group) scene.getRoot()).getChildren().add(menuBar);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}