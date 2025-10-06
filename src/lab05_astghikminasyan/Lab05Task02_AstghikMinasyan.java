/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05_astghikminasyan;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Git URL: https://github.com/Astghik-hub/Lab05Task02_AstghikMinasyan.git
 * @author 2466920
 */
public class Lab05Task02_AstghikMinasyan extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
         // Create BorderPan and GridPane
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        BorderPane root = new BorderPane();
        root.setCenter(grid);
        
        // Create labels
        Label beverLabel = new Label("Beverage: ");
        Label appetizerLabel = new Label("Appetizer: ");
        Label mainLabel = new Label("Main Course: ");
        Label dessertLabel = new Label("Dessert: ");
        
        // Create combo boxes
        ComboBox<String> beverageComboBox = new ComboBox<>();
        ComboBox<String> appetizerComboBox = new ComboBox<>();
        ComboBox<String> mainComboBox = new ComboBox<>();
        ComboBox<String> dessertcComboBox = new ComboBox<>();
        beverageComboBox.getItems().addAll("Coffe", "Tea", "Soft Drink", "Water", "Milk", "Juice");
        appetizerComboBox.getItems().addAll("Soup", "Salad", "Spring Rolls", "Garlic Bread", "Chips and Salsa");
        mainComboBox.getItems().addAll("Steak", "Grilled chicken", "Chicken Alfredo", "Turkey Club", "Shrimp Scampy", "Pasta", "Fish and Chips");
        dessertcComboBox.getItems().addAll("Apple Pie", "Carrot Cake", "Mud Pie", "Pudding", "Apple Crisp");
        
        // Add elements to the grid
        grid.add(beverLabel, 0, 0);
        grid.add(appetizerLabel, 1, 0);
        grid.add(mainLabel, 2, 0);
        grid.add(dessertLabel, 3, 0);
        grid.add(beverageComboBox, 0, 1);
        grid.add(appetizerComboBox, 1, 1);
        grid.add(mainComboBox, 2, 1);
        grid.add(dessertcComboBox, 3, 1);
        
        
        
        // Show the stage
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("User Bill Display");
        stage.setScene(scene);
        stage.show();
    }
    
}
