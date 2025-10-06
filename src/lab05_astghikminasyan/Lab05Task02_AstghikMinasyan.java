/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05_astghikminasyan;

import javafx.application.Application;
import javafx.beans.value.ObservableDoubleValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Git URL: https://github.com/Astghik-hub/Lab05Task02_AstghikMinasyan.git
 * @author Astghik Minasyan
 */
public class Lab05Task02_AstghikMinasyan extends Application {
    // Names and prices for the beverage options
    static final String COFFEE = "Coffee";
    static final String TEA = "Tea";
    static final String SOFT_DRINK = "Soft Drink";
    static final String WATER = "Water";
    static final String MILK = "Milk";
    static final String JUICE = "Juice";
    static final double COFFEE_PRICE = 2.5;
    static final double TEA_PRICE = 2;
    static final double DRINK_PRICE = 1.75;
    static final double WATER_PRICE = 2.95;
    static final double MILK_PRICE = 1.5;
    static final double JUICE_PRICE = 2.5;
    
    // Names and prices for the appetizer options
    static final String SOUP = "Soup";
    static final String SALAD = "Salad";
    static final String SPRING_ROLLS = "Spring Rolls";
    static final String GARLIC_BREAD = "Garlic Bread";
    static final String CHIPS_SALSA = "Chips and Salsa";
    static final double SOUP_PRICE = 4.5;
    static final double SALALD_PRICE = 3.75;
    static final double ROLLS_PRICE = 5.25;
    static final double GARLIC_BREAD_PRICE = 3;
    static final double CHIP_SALSA_PRICE = 6.95;
    
    // Names and prices for the main course options
    static final String STEAK = "Steak";
    static final String GRILLED_CHICKEN = "Grilled Chicken";
    static final String CHICKEN_ALFREDO = "Chicken Alfredo";
    static final String TURKEY_CLUB = "Turkey Club";
    static final String SHRIMP_SCAMPI = "Shrimp Scampi";
    static final String PASTA = "Pasta";
    static final String FISH_CHIPS = "Fish and Chips";
    static final double STEAK_PRICE = 15;
    static final double GRILLED_CHICKEN_PRICE = 13.5;
    static final double CHICKEN_ALFREDO_PRICE = 13.95;
    static final double TURKEY_PRICE = 11.9;
    static final double SHRIMP_PRICE = 18.99;
    static final double PASTA_PRICE = 11.75;
    static final double FISH_PRICE = 12.25;
        
    // Names and prices for the main course options
    static final String APPLE_PIE = "Apple Pie";
    static final String CARROT_CAKE = "Carrot cake";
    static final String MUD_PIE = "Mud Pie";
    static final String PUDDING = "Pudding";
    static final String APPLE_CRISP = "Apple Crisp";
    static final double APPLE_PIE_PRICE = 5.95;
    static final double CARROT_CAKE_PRICE = 4.5;
    static final double MUD_PIE_PRICE = 4.75;
    static final double PUDDING_PRICE = 3.25;
    static final double APPLE_CRISP_PRICE = 5.98;
    
    static double beveragePrice;
    static double appetizerPrice;
    static double mainPrice;
    static double dessertPrice;
    static double subtotal;
    static double tax;
    static double tip;
    static double total;

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
        Label subtotalLabel = new Label(String.format("Subtotal: %.2f", subtotal));
        Label taxLabel = new Label(String.format("Tax: %.2f", tax));
        Label tipLabel = new Label(String.format("Tip: %.2f", tip));
        Label totalLabel = new Label(String.format("Total: %.2f", total));
        
        //Create button
        Button clear = new Button("Clear");
        
        // Create combo boxes
        ComboBox<String> beverageComboBox = new ComboBox<>();
        ComboBox<String> appetizerComboBox = new ComboBox<>();
        ComboBox<String> mainComboBox = new ComboBox<>();
        ComboBox<String> dessertcComboBox = new ComboBox<>();
        beverageComboBox.getItems().addAll(COFFEE, TEA, SOFT_DRINK, WATER, MILK, JUICE);
        appetizerComboBox.getItems().addAll(SOUP, SALAD, SPRING_ROLLS, GARLIC_BREAD, CHIPS_SALSA);
        mainComboBox.getItems().addAll(STEAK, GRILLED_CHICKEN, CHICKEN_ALFREDO, TURKEY_CLUB, SHRIMP_SCAMPI, PASTA, FISH_CHIPS);
        dessertcComboBox.getItems().addAll(APPLE_PIE, CARROT_CAKE, MUD_PIE, PUDDING, APPLE_CRISP);
        
        // Create slider
        Slider slider = new Slider(0, 20, 15);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(5);
        slider.setMinorTickCount(4);
        slider.setShowTickLabels(true);
        slider.setSnapToTicks(true);
        slider.setPrefWidth(300);
        
        // Add elements to the grid
        grid.add(beverageLabel, 0, 0);
        grid.add(appetizerLabel, 1, 0);
        grid.add(mainLabel, 2, 0);
        grid.add(dessertLabel, 3, 0);
        grid.add(beverageComboBox, 0, 1);
        grid.add(appetizerComboBox, 1, 1);
        grid.add(mainComboBox, 2, 1);
        grid.add(dessertcComboBox, 3, 1);
        grid.add(sliderLabel, 0, 5);
        grid.add(slider, 0, 6, 4, 1);
        grid.add(clear, 0, 25);
        grid.add(subtotalLabel, 0, 8);
        grid.add(tipLabel, 0, 9);
        grid.add(taxLabel, 0, 10);
        grid.add(totalLabel, 0, 11);
        
        // Clear button event handler
        clear.setOnMouseClicked(e -> {
            beverageComboBox.getSelectionModel().clearSelection();
            appetizerComboBox.getSelectionModel().clearSelection();
            mainComboBox.getSelectionModel().clearSelection();
            dessertcComboBox.getSelectionModel().clearSelection();
            slider.setValue(15);
        });
        
        // Add listeners to dertermine the price of each category
        beverageComboBox.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            String item = beverageComboBox.getSelectionModel().getSelectedItem().toLowerCase();
            
            if (item.equals(COFFEE)) {
                beveragePrice = COFFEE_PRICE;
            }
            
            if (item.equals(TEA)) {
                beveragePrice = TEA_PRICE;
            }
            
            if (item.equals(SOFT_DRINK)) {
                beveragePrice = DRINK_PRICE;
            }
            
            if (item.equals(WATER)) {
                beveragePrice = WATER_PRICE;
            }
            
            if (item.equals(MILK)) {
                beveragePrice = MILK_PRICE;
            }
            
            if (item.equals(JUICE)) {
                beveragePrice = JUICE_PRICE;
            }
    });
        
        appetizerComboBox.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            String item = beverageComboBox.getSelectionModel().getSelectedItem().toLowerCase();
            
            if (item.equals("soup")) {
                beveragePrice = SOUP_PRICE;
            }
            
            if (item.equals("salad")) {
                beveragePrice = SALALD_PRICE;
            }
            
            if (item.equals("spring rolls")) {
                beveragePrice = ROLLS_PRICE;
            }
            
            if (item.equals("garlic bread")) {
                beveragePrice = GARLIC_BREAD_PRICE;
            }
            
            if (item.equals("chips and salsa")) {
                beveragePrice = CHIP_SALSA_PRICE;
            }
    });
        
        mainComboBox.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            String item = beverageComboBox.getSelectionModel().getSelectedItem().toLowerCase();
            
            if (item.equals("steak")) {
                beveragePrice = SOUP_PRICE;
            }
            
            if (item.equals("grilled chicken")) {
                beveragePrice = SALALD_PRICE;
            }
            
            if (item.equals("chicken alfredo")) {
                beveragePrice = ROLLS_PRICE;
            }
            
            if (item.equals("turkey club")) {
                beveragePrice = GARLIC_BREAD_PRICE;
            }
            
            if (item.equals("chips and salsa")) {
                beveragePrice = CHIP_SALSA_PRICE;
            }
    });
        
        // Show the stage
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("User Bill Display");
        stage.setScene(scene);
        stage.show();
    }
}
