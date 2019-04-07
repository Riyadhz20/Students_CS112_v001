package displayimagestest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class DisplayImagesTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Image img1 = new Image("File:src/2.png");
        ImageView Vimg1 = new ImageView(img1);
        Vimg1.setFitHeight(300);
        Vimg1.setFitWidth(450);
        
        Image img2 = new Image("File:src/1.png");
        ImageView Vimg2 = new ImageView(img2);
        Vimg2.setFitHeight(300);
        Vimg2.setFitWidth(450);
                
        Image img3 = new Image("File:src/3.png");
        ImageView Vimg3 = new ImageView(img3);
        Vimg3.setFitHeight(300);
        Vimg3.setFitWidth(450);
        
        HBox Hbox = new HBox(10);
        Hbox.getChildren().addAll(Vimg1, Vimg2, Vimg3);
        
        Pane N =new Pane();
        N.getChildren().addAll(Hbox);
        
        Scene scene = new Scene(N, 1370, 300);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
