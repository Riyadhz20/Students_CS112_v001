package testaccount;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    
    private ArrayList <Transaction> transaction = new ArrayList<>();
    private String Name;
    int i= 0;
            
            
    private int ID = 0;
    private double Balance = 0.0; //Balance
    private static double ALR = 0.0; //Annual Lnterest Rate
    private Date DC ;//Date Created
    
    public Account(){
        this.DC = new Date();
    }
    public Account(String Name, int ID, double Balance){
        this();
        this.Name = Name ;
        this.ID = ID;
        this.Balance = Balance;
    }

    public int getID() {
        return ID;
    }
    public double getBalance() {
        return Balance;
    }
    public static double getALR() {
        return ALR;
    }
    public Date getDC() {
        return DC;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setBalance(double Balance) {
        this.Balance = Balance;
        
    }
    public static void setALR(double ALR) {
        Account.ALR = ALR;
    }
    
    public double getMonthlyInterestRate(){
        return (ALR/100)/12;
    }
    public double getMonthlyInterest(){
        return Balance*getMonthlyInterestRate();
    }
    
    public void WithDraw(double amount){
        this.Balance -= amount;
        Transaction AA = new Transaction('W',amount,this.Balance," Transaction No."+i+" WithDraw");
        transaction.add(AA);
        i++;
    }
    public void Deponsit(double amount){
        this.Balance += amount;
        
        Transaction AA = new Transaction('D',amount,this.Balance," Transaction NO."+i+" Deponsit");
        transaction.add(AA);
        i++;
    }

    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transaction = transaction;
        
    }
    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }
    
    
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }
    
    public String toString(){
        return "Name: "+Name +" Balance: $"+Balance +" Monthly Interest: $"+getMonthlyInterest() +" Monthly Interest Rate: "+getMonthlyInterestRate();
    }
    
}
