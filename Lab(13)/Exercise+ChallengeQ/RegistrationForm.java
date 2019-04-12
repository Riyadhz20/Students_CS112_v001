package registrationform;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class RegistrationForm extends Application{
    
    public TextField FName = new TextField();
    public TextField FEmail = new TextField();
    public TextField FPhone = new TextField();
    
    public PasswordField FPassword = new PasswordField();
    public PasswordField FConfirm = new PasswordField();
    
    public ComboBox BCountry = new ComboBox();
    
    public RadioButton BMale = new RadioButton("male");
    public RadioButton BFemale = new RadioButton("Female");
    
    public CheckBox BArabic = new CheckBox("Arabic");
    public CheckBox BEnglish = new CheckBox("English");
    public CheckBox BSpanish = new CheckBox("Spanish");
    
    public TextArea DAboutYou = new TextArea();
    
    @Override
    public void start(Stage stage){
        
        BCountry.getItems().addAll("Saudi Arabia","Kuwait","Bahrain","United Arab Emirates");
        BCountry.setValue("Select...");
        
        HBox HBR = new HBox(10);
        ToggleGroup TGBR = new ToggleGroup();
        BMale.setToggleGroup(TGBR);
        BFemale.setToggleGroup(TGBR); 
        HBR.getChildren().addAll(BMale,BFemale);
        
        HBox HCB = new HBox(10);
        HCB.getChildren().addAll(BArabic,BEnglish,BSpanish);
        
        DAboutYou.setText("Your Biography...");
        DAboutYou.setPrefSize(300, 125);
        
        BorderPane MP = new BorderPane();
        BorderPane P = new BorderPane();
        
        GridPane pD = new GridPane();
        pD.add(new Text("Name:"), 0, 0);  pD.add(FName, 1, 0);
        pD.add(new Text("Email:"), 0, 1);  pD.add(FEmail, 1, 1);
        pD.add(new Text("Phone:"), 0, 2);  pD.add(FPhone, 1, 2);
        pD.add(new Text("Password:"), 0, 3);  pD.add(FPassword, 1, 3);
        pD.add(new Text("Confirm:"), 0, 4);  pD.add(FConfirm, 1, 4);
        pD.add(new Text("Country:"), 0, 5);  pD.add(BCountry, 1, 5);
        pD.add(new Text("Gender:"), 0, 6);  pD.add(HBR, 1, 6);
        pD.add(new Text("Language:"), 0, 7);  pD.add(HCB, 1, 7);
        pD.add(new Text("About You:"), 0, 8);  pD.add(DAboutYou, 1, 8);
        pD.setPadding(new Insets(20, 10, 10, 10));
        pD.setOpaqueInsets(new Insets(5, 5, 5, 0));
        pD.setHgap(50);
        pD.setVgap(10);
        
        HBox box = new HBox();
        Button BR = new Button("Register");
        BR.setPrefSize(300, 32);
        box.getChildren().add(BR);
        box.setAlignment(Pos.CENTER);
        box.setPadding(new Insets(10,10,10,10));
        
        VBox VDE = new VBox(1);
        VDE.setPadding(new Insets(10,10,10,10));
        
        BR.setOnAction(e->{
            VDE.getChildren().removeAll(VDE.getChildren());
            
            if(!FName.getText().isEmpty()){
                boolean Name = Pattern.matches("[a-zA-Z]+",FName.getText());
                if(!Name)VDE.getChildren().add(new Text("*Name must not have digits"));}
            else VDE.getChildren().add(new Text("*Write The Name"));
            
            if(!FEmail.getText().isEmpty()){
                int A = FEmail.getText().indexOf("@");
                int D = FEmail.getText().indexOf(".");
                if(A == -1 || D == -1){
                    boolean Email = false;
                    if(!Email)VDE.getChildren().add(new Text("*Invalid email"));}}
            else VDE.getChildren().add(new Text("*Write The Email"));
            
            if(!FPhone.getText().isEmpty()){
                boolean DPhone =  FPhone.getText().length() == 10;
                if(!DPhone)VDE.getChildren().add(new Text("*Phone number must be 8 digits length"));
                boolean Phone =  Pattern.matches("[0-9]+",FPhone.getText());
                if(!Phone)VDE.getChildren().add(new Text("*Phone number must not have characters"));}
            else VDE.getChildren().add(new Text("*Write The Phone"));
            
            if(!FPassword.getText().isEmpty()){
                boolean Password = FPassword.getText().equals(FConfirm.getText());
                if(!Password)VDE.getChildren().add(new Text("*Password NOT Matches"));}
            else VDE.getChildren().add(new Text("*Write The Password"));
            
            boolean Contry = BCountry.getValue()=="Select...";
            if(Contry)
                VDE.getChildren().add(new Text("*Select the country"));
            
            if(!DAboutYou.getText().equals("Your Biography...")){
                boolean AboutYou = (0 < DAboutYou.getLength()) && (DAboutYou.getLength()<= 50);
                if(!AboutYou)VDE.getChildren().add(new Text("*Talk About yourself in at least 50 characters"));}
            else VDE.getChildren().add(new Text("*Write About yourself"));
            
            
            
            if(VDE.getChildren().isEmpty()){
                OtherWindows.window(toStringo(),FName.getText());
            }
            
        });
        
        P.setCenter(pD);
        P.setBottom(box);
        
        
        MP.setCenter(P);
        MP.setBottom(VDE);
        
        Scene S = new Scene(MP,400,500);
        stage.setScene(S);
        stage.setTitle("Registration Form");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    public ArrayList <String> toStringo(){
        System.out.println("toString");
        String TB ="";
        if (BMale.isSelected())
            TB = BMale.getText();
        if (BFemale.isSelected())
            TB = BFemale.getText();
        
        System.out.println("TB");
        
        String CB ="";
        if (BArabic.isSelected())
            CB = CB+BArabic.getText();
        
        if (BEnglish.isSelected())
            CB = CB+BEnglish.getText();
        
        if (BSpanish.isSelected())
            CB = CB+BSpanish.getText();
        System.out.println("CB");
        
        ArrayList <String> A = new ArrayList<>();
        A.add("Name is:"+FName.getText());
        A.add("Email is:"+FEmail.getText());
        A.add("Phone is:"+FPhone.getText());
        A.add("Password is:"+FPassword.getText());
        A.add("Country is:"+BCountry.getValue());
        A.add("Gender is:"+TB);
        A.add("Language is:"+CB);
        A.add("info is:"+DAboutYou.getText());
        
        return A;
    }
}
