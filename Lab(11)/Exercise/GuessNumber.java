package guessnumber;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class GuessNumber extends Application{
    
    @Override
    public void start(Stage Stage){
        
        BorderPane GP = new BorderPane();
        
        TextField Tf = new TextField();
        
        GP.setTop(Tf);
        
        GridPane TP = new GridPane();
        Text T1 = new Text("Guess a number between 1 to 10");
        Text T2 = new Text();
        TP.add(T1,0,0);
        TP.add(T2, 0, 1);
        
        GP.setCenter(TP);
        
        HBox H = new HBox();
        Button Bt = new Button("Guess");
        H.getChildren().add(Bt);
        H.setAlignment(Pos.CENTER);
        
        GP.setBottom(H);
        
        Bt.setOnAction(e -> {
                int s = ((int)(Math.random()*11));
                Tf.setText(new Integer(s).toString());
                T2.setText("Correct Guess");
        });
        
        Scene scene = new Scene(GP,255,100);
        
        Stage.setTitle("Guess a number");
        Stage.setScene(scene);
        Stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
