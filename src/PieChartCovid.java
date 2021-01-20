package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
 
public class PieChartCovid extends Application {
 
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Statistics"); //title of window 
        stage.setWidth(500); // width of window 
        stage.setHeight(600);// height of window 


        PieChartPanel piePanel = new PieChartPanel();
        
        ((Group) scene.getRoot()).getChildren().add(piePanel);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}