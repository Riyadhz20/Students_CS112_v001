package movetext;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MoveText extends Application{

    @Override
    public void start(Stage Stage){
        
        HBox HBR = new HBox(10);
        ToggleGroup TGBR = new ToggleGroup();
        
        RadioButton BRed = new RadioButton("Red");
        RadioButton BYellow = new RadioButton("Yellow");
        RadioButton BBlack = new RadioButton("Black");
        RadioButton BOrange = new RadioButton("Orange");
        RadioButton BGreen = new RadioButton("Green");
        
        BRed.setToggleGroup(TGBR);
        BYellow.setToggleGroup(TGBR);
        BBlack.setToggleGroup(TGBR);
        BOrange.setToggleGroup(TGBR);
        BGreen.setToggleGroup(TGBR);
        
        HBR.getChildren().addAll(BRed,BYellow,BBlack,BOrange,BGreen);
        
        Text C = new Text(50 ,50 ,"Programming is fun");
        
        HBox HB = new HBox(10);
        Button LB = new Button("<=");
        Button RB = new Button("=>");
        HB.getChildren().addAll(LB,RB);
        HB.setAlignment(Pos.CENTER);
        
        
        Pane PC = new Pane();
        PC.getChildren().add(C);
        PC.setStyle("-fx-border-color: green");
                
                
        BorderPane BP = new BorderPane();
        BP.setTop(HBR);
        BP.setBottom(HB);
        BP.setCenter(PC);
        
        Scene S = new Scene(BP,500,200);
        
        LB.setOnAction(e -> {
                C.setX(C.getX()-10);
        });
        RB.setOnAction(e -> {
                C.setX(C.getX()+10);
        });
        
        
        BRed.setOnAction(e->{ 
            C.setFill(Color.RED);
        });
        BYellow.setOnAction(e->{ 
            C.setFill(Color.YELLOW);
        });
        BBlack.setOnAction(e->{ 
            C.setFill(Color.BLACK);
        });
        BOrange.setOnAction(e->{ 
            C.setFill(Color.ORANGE);
        });
        BGreen.setOnAction(e->{ 
            C.setFill(Color.GREEN);
        });
        
        Stage.setTitle("Move a Text");
        Stage.setScene(S);
        Stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
