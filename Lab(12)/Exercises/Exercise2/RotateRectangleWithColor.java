
package rotaterectanglewithcolor;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;


public class RotateRectangleWithColor extends Application {
    
    int i = 0;
    String [] C = {
            " -fx-fill: gray;"
            ," -fx-fill: white;"
            ," -fx-fill: yellow;"
            ," -fx-fill: orange;"
            ," -fx-fill: red;"
            ," -fx-fill: pink;"
            ," -fx-fill: purple;"
            ," -fx-fill: blue;"
            ," -fx-fill: green;"};
    
    

    @Override
    public void start(Stage Stage){
        Rectangle R = new Rectangle(200, 100);
        R.setStyle(" -fx-fill: Black;");
        
        
        
        Button B1 = new Button("Rotate -");
        Button B2 = new Button("Rotate +");
        
        
        HBox BP = new HBox();
        BP.getChildren().addAll(B1, B2);
        BP.setAlignment(Pos.CENTER);
        
        BorderPane P = new BorderPane ();
        P.setCenter(R);
        P.setBottom(BP);
        
        
        
        
        Scene S = new Scene(P, 300, 200);
        Stage.setScene(S);
        Stage.setTitle("RotateRectangle");
        Stage.show();
        
        
        B1.setOnAction(e ->{
            R.setRotate(R.getRotate()+10);
            i--;
            if(i ==-1)i=C.length-1;
            R.setStyle(C[i]);
        });
        
        B2.setOnAction(e ->{
            R.setRotate(R.getRotate()-10);
            i++;
            if(i == C.length)i=0;
            R.setStyle(C[i]);
        });
        
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

