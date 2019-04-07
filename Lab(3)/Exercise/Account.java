
package accoun;
import java.util.Date;

public class Account {

    private int ID =0;
    private double balance =0;
    private Date datecreated;
    
    Account(){
        
    }
    
    Account( int ID , double balance ){
        
        this.ID=ID;
        this.balance=balance;
    }
    
    Date getdatecreated(){
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
    public static void main(String[] args) {

        Account bank = new Account( 1122 , 20000 );

        bank.getwithdraw(2500);
        bank.getdepsit(3000);
       
        System.out.println(" Balance is = " + bank.getbalance());
        System.out.println(" This account was created at " + bank.getdatecreated());
    }
    
}
