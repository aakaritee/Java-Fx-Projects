/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasktracker;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author aakar
 */

/* this is a test */
public class TaskTracker extends Application {
    HBox modifyList;
    VBox layout;
    Button add,delete;
    TextField item;
    @Override
    public void start(Stage primaryStage) {
        modifyList = new HBox();
        
        add = new Button("Add");
        delete = new Button("Delete");
        item = new TextField();
        modifyList.getChildren().addAll(add,delete,item);
        
        modifyList.setAlignment(Pos.BOTTOM_CENTER);
      //  layout.getChildren().add(modifyList);
        
      
      add.setOnAction(e -> {
          System.out.println(item.getText());
      });
        
       /* Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);*/
        
        Scene scene = new Scene(modifyList, 300, 250);
        
        primaryStage.setTitle("Item List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
