package userguess;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;

public class UserGuess extends Application{
    
    @Override
    public void start(Stage Stage){
        
        
        Button B1 = new Button("Guess");
        Button B2 = new Button("Help");
        
        HBox BP = new HBox(5);
        BP.getChildren().addAll(B1,B2);
        BP.setAlignment(Pos.CENTER);
        
        
        
        TextField TF = new TextField("Enter Your Guess");
        
        
        
        Text T1 = new Text("Guess a number between 0 to 10");
        Text T2 = new Text();
        
        GridPane TP = new GridPane();
        
        TP.add(T1, 0, 0);
        TP.add(T2, 0, 1);
        
        
        
        BorderPane P = new BorderPane();
        P.setTop(TF);
        P.setCenter(TP);
        P.setBottom(BP);
        
        
        
        Stage.setScene(new Scene(P, 200, 100));
        Stage.show();
        Stage.setResizable(false);
        
        
        //intger G = (int)(Math.random()*11);
        
        int G = (int)(Math.random()*11);
        
        System.out.println("G = " + G);
        
        
         System.out.println("TF = " + TF.getText());
        
         
        B1.setOnAction(e -> {
            if(G == Integer.parseInt(TF.getText())){
                T2.setText("Raght");
            }
            else
                T2.setText("Wrong");
        });
        
        B2.setOnAction(e ->{
            if(G < Integer.parseInt(TF.getText())){
                T2.setText("Help: Decrease your Guess");
                
            }
            else if(G > Integer.parseInt(TF.getText())){
                T2.setText("Help: increase your Guess");
            }
            
            else T2.setText("Help: You did it");
            
        });
        
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
