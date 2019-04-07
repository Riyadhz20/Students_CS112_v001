package movetheball;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class MoveTheBall extends Application{
    
    @Override
    public void start(Stage Stage){
        Circle C = new Circle(20);
        C.setFill(Color.WHITE);
        C.setStroke(Color.BLACK);
        C.setCenterX(20);
        C.setCenterY(20);
        
        HBox H = new HBox(10);
        Button LB = new Button("Left");
        Button RB = new Button("Right");
        Button UB = new Button("Up");
        Button DB = new Button("Down");
        H.getChildren().addAll(LB,RB,UB,DB);
        H.setAlignment(Pos.CENTER);
        
        Pane PC = new Pane();
        PC.getChildren().add(C);
        
        BorderPane BP = new BorderPane();
        BP.setBottom(H);
        BP.setCenter(PC);
        
        Scene S = new Scene(BP,300,300);
        
        LB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if ((C.getCenterX()-20) > 0)
                C.setCenterX(C.getCenterX()-10);
                
            }
        });
        RB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if ((C.getCenterX()+20)< S.getWidth())
                C.setCenterX(C.getCenterX()+10);
            }
        });
        UB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if ((C.getCenterY()-20) > 0)
                C.setCenterY(C.getCenterY()-10);
            }
        });
        DB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if ((C.getCenterY()+30)< S.getHeight())
                C.setCenterY(C.getCenterY()+10);
            }
        });
        
        Stage.setTitle("Riyadh");
        Stage.setScene(S);
        Stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
