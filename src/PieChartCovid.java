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
 
public class PieChartCovid extends Application {
 
	
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Statistics"); //title of window 
        stage.setWidth(500); // width of window 
        stage.setHeight(500);// height of window 

        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("Statistics");
        MenuItem item1 = new MenuItem("Percentance of positives and negatives");
        
        item1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
            	Statistics stat = new Statistics();
            	HashMap<String, Integer> temp = stat.percentanceOfPositivesNegatives();
            	
                // Pie for positives & negatives
                ObservableList<PieChart.Data> pieChartData =
                        FXCollections.observableArrayList(
                        new PieChart.Data("Positives", temp.get("Positives")),
                        new PieChart.Data("Negatives", temp.get("Negatives")));

                      
                final PieChart chart = new PieChart(pieChartData);
                chart.setTitle("Statistics Covid-19"); // Pie's title
                ((Group) scene.getRoot()).getChildren().add(chart);
            }
        });
        MenuItem item2 = new MenuItem("Percentance of positives per area");
        
        item2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
            	
            }
        });
        
        
        menuFile.getItems().add(item1);
        menuFile.getItems().add(item2);
        menuBar.getMenus().addAll(menuFile);
        ((Group) scene.getRoot()).getChildren().add(menuBar);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}