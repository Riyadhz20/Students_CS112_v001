package registrationform;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OtherWindows{
    
    public static void window(ArrayList <String> A,String N){
        
        Stage stage = new Stage();
        Text T = new Text("Do you want Save The Registration?");
        
        Button BS = new Button("Save");
        Button BC = new Button("Cancel");
        BS.setPrefSize(60, 32);
        BC.setPrefSize(60, 32);
        
        HBox H = new HBox(10);
        H.getChildren().addAll(BS,BC);
        H.setAlignment(Pos.CENTER);
        H.setPadding(new Insets(10,10,10,10));
        
        
        BorderPane P = new BorderPane();
        P.setCenter(T);
        P.setBottom(H);
        
        BS.setOnAction(e -> {
             PrintToFile(A,N);
        });
        BC.setOnAction(e->{
            stage.close();
        });
        
        Scene S = new Scene(P,300,100);
        
                
        
        stage.setScene(S);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        
        
    }
    public static void PrintToFile(ArrayList <String> A,String N){
        try{
            
            File F = new File("P:\\programming JAVA\\RegistrationForm\\src\\"+N+".txt");
            
            PrintWriter WF = new PrintWriter(F);
            for(int i =0; i<A.size();i++)
                WF.println(A.get(i));
            
            WF.close();
            
        }catch(Exception ex){
            System.out.println("asdasd");
        }
    }
}

