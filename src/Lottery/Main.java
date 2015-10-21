/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Xavi
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        //
        Combo combo = new Combo();
        int[][] numbers = combo.fiveCombos();
        String comboOne = Arrays.toString(numbers[0]);
        String comboTwo = Arrays.toString(numbers[1]);
        String comboThree = Arrays.toString(numbers[2]);
        String comboFour = Arrays.toString(numbers[3]);
        String comboFive = Arrays.toString(numbers[4]);
        
        
      primaryStage.setTitle("Welcome to the lottery");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Text sceneTitle = new Text("Here are your Numbers");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);
        
        Label firstLabel = new Label("First Combo:");
        grid.add(firstLabel, 0, 1);
        
        Label numberOne = new Label(comboOne);
        grid.add(numberOne, 1, 1);
       
        Label secondLabel = new Label("Second Combo:");
        grid.add(secondLabel, 0, 2);
        
        Label numberTwo = new Label(comboTwo);
        grid.add(numberTwo, 1, 2);
        
        Label thirdLabel = new Label("Third Combo:");
        grid.add(thirdLabel, 0, 3);
        
        Label numberThree = new Label(comboThree);
        grid.add(numberThree, 1, 3);
        
        Label fourthLabel = new Label("Fourth Combo:");
        grid.add(fourthLabel, 0, 4);
        
        Label numberFour = new Label(comboFour);
        grid.add(numberFour, 1, 4);
        
        Label fifthLabel = new Label("Fifth Combo:");
        grid.add(fifthLabel, 0, 5);
        
        Label numberFive = new Label(comboFive);
        grid.add(numberFive, 1, 5);
        
        
        Button button = new Button("Generate New Numbers!");
        HBox hbButton = new HBox(10); // creates HBox layout Pane w/ spacing of 10 pixels
        hbButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbButton.getChildren().add(button);
        grid.add(hbButton, 1, 6);
        
        button.setOnAction((ActionEvent e) -> { 
            try {
                start(primaryStage);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
      });
        /**
         * Used a lambda expression to change :
         * btn.setOnAction(new EventHandler<ActionEvent>() {
 
    @Override
    public void handle(ActionEvent e) {
        actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("Sign in button pressed");
    }
});
*       to current code for efficiency
         */
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        //This next line adds the background
        scene.getStylesheets().add(Main.class.getResource("StyleSheetForLottery.css").toExternalForm());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
