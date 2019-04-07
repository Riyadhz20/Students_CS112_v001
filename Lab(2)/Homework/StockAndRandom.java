package stockandrandom;
import java.util.Random;
import java.util.Scanner;
public class StockAndRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random Re = new Random();
        stock s1 = new stock();
        
        System.out.print("Enter the name of Stock: ");
        s1.name = input.nextLine();
        
        System.out.print("Enter the symbol of Stock: ");
        s1.symbol = input.nextLine();
        
        System.out.print("Enter the previous closing price: ");
        s1.PreviousClosingPrice = input.nextDouble();
        
        System.out.print("Enter the current price: ");
        s1.CurrentPrice = input.nextDouble();
        
        s1.ID = Re.nextInt(100);
        
        System.out.print("\nStock name: "+s1.name 
                +"\nStock symbol: " +s1.symbol 
                +"\nStock ID: " +s1.ID 
                +"\nPrice‐change percentage: " +s1.getChangePercent()+"%");
        
    }
}
class stock{
    String name;
    String symbol;
    double PreviousClosingPrice;
    double CurrentPrice;
    int ID;
    
    stock(){  
    }
    
    double getChangePercent(){
        return  ((CurrentPrice-PreviousClosingPrice)/ PreviousClosingPrice)*100;
    }
}

