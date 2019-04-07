package shufflesarraylist;

import java.util.ArrayList;

public class ShufflesArrayList {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Number> N = new ArrayList<>();
        System.out.println("How meny Number do u want to Enter in Array: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        
        System.out.println("Enter ur Element: ");
        
        for(int i = 0 ; i < n; i++){
        N.add(input.nextInt());}
        
        shulffle(N);
    }
    
    public static void shulffle(ArrayList <Number> List){
        
        for(int i = 0; i< List.size();i++){
            
            int c = (int) (Math.random()*List.size());
            
            int temp = (int) List.get(i);
            List.set(i, List.get(c));
            List.set(c, temp);
        }
        System.out.println(List);
        
    }
}
