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


        PieChartPanel piePanel = new PieChartPanel();
        
        ((Group) scene.getRoot()).getChildren().add(piePanel);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}