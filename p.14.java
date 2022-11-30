package prak14_ara;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Prak14_Ara extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button("Click Me!");
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root);
        
        stage.setHeight(300);
        stage.setWidth(300);
        stage.setScene(scene);
        stage.setTitle("Hello World!");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
