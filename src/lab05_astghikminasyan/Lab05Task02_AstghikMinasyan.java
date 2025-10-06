/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05_astghikminasyan;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import jdk.jfr.Registered;

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
        Label beverageLabel = new Label("Beverage: ");
        Label appetizerLabel = new Label("Appetizer: ");
        Label mainLabel = new Label("Main Course: ");
        Label dessertLabel = new Label("Dessert: ");
        Label sliderLabel = new Label("Select Tip (%): ");
        
        //Create buttons
        Button clear = new Button("Clear");
        
        // Create combo boxes
        ComboBox<String> beverageComboBox = new ComboBox<>();
        ComboBox<String> appetizerComboBox = new ComboBox<>();
        ComboBox<String> mainComboBox = new ComboBox<>();
        ComboBox<String> dessertcComboBox = new ComboBox<>();
        beverageComboBox.getItems().addAll("Coffe", "Tea", "Soft Drink", "Water", "Milk", "Juice");
        appetizerComboBox.getItems().addAll("Soup", "Salad", "Spring Rolls", "Garlic Bread", "Chips and Salsa");
        mainComboBox.getItems().addAll("Steak", "Grilled chicken", "Chicken Alfredo", "Turkey Club", "Shrimp Scampy", "Pasta", "Fish and Chips");
        dessertcComboBox.getItems().addAll("Apple Pie", "Carrot Cake", "Mud Pie", "Pudding", "Apple Crisp");
        
        // Create slider
        Slider tip = new Slider(0, 20, 15);
        tip.setShowTickMarks(true);
        tip.setMajorTickUnit(5);
        tip.setMinorTickCount(4);
        tip.setShowTickLabels(true);
        tip.setSnapToTicks(true);
        tip.setPrefWidth(300);
        
        // Add elements to the grid
        grid.add(beverageLabel, 0, 0);
        grid.add(appetizerLabel, 1, 0);
        grid.add(mainLabel, 2, 0);
        grid.add(dessertLabel, 3, 0);
        grid.add(beverageComboBox, 0, 1);
        grid.add(appetizerComboBox, 1, 1);
        grid.add(mainComboBox, 2, 1);
        grid.add(dessertcComboBox, 3, 1);
        grid.add(sliderLabel, 0, 4);
        grid.add(tip, 0, 5, 4, 1);
        grid.add(clear, 0, 8);
        
        // Clear button event handler
        clear.setOnMouseClicked(e -> {
            beverageComboBox.getSelectionModel().clearSelection();
            appetizerComboBox.getSelectionModel().clearSelection();
            mainComboBox.getSelectionModel().clearSelection();
            dessertcComboBox.getSelectionModel().clearSelection();
        });
        
        // Show the stage
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("User Bill Display");
        stage.setScene(scene);
        stage.show();
    }
}
