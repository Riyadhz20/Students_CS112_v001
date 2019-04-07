
package javaapplication38;



import java.util.Date;

public class javaapplication38 {
    
public static void main(String[] args) {

        Account bank = new Account( 1122 , 20000 );
        Date K = new Date();

        bank.getwithdraw(2500);
        bank.getdepsit(3000);
        
        
        System.out.println(" Balance is = " + bank.getbalance());
        bank.setdatecreated(K.toString());
        System.out.println(" This account was created at " +bank.getdatecreated());
    }
}





class Account {

    private int ID =0;
    private double balance =0;
    private String datecreated;
    
    Account(){
        
    }
    
    Account( int ID , double balance ){
        
        this.ID=ID;
        this.balance=balance;
    }
    
    void setdatecreated(String K){

    datecreated = K;
    }
    String getdatecreated(){
        
        
    return datecreated;
    }
    
    int getID(){
        return ID;
    }
    
    double getbalance(){
        return balance;
    }
    
   void setID(){
       
   }
   
   void setbalance(){
       
   }
   
   double getwithdraw(double a ){
       return  (a - balance) ;
   }
   
   double getdepsit(double a){
       return (a + balance);
   }
}
    
    

