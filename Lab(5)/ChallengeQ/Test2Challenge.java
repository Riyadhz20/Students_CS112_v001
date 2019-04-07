package test2challenge;

import java.util.Scanner;
import java.util.ArrayList;

public class Test2Challenge {
    
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        
        int numbers[] = new int[10];
        ArrayList <Integer> R = new ArrayList<Integer>();
        
        System.out.print("Enter ten integers: ");
        
        for(int x=0; x<numbers.length; x++){
            numbers[x]=I.nextInt();
            R.add(numbers[x]);
        }
        
        
        
        removeDuplicate(R);
        
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        
        ArrayList <Integer> R = new ArrayList<Integer>();
        
        for(int x = 0; x < list.size();x++){
            R.add(list.get(x));
            
            for(int y = 0 ; y < list.size();y++){
                if(R.get(x) == list.get(y) && x != y){
                    list.remove(y);
                    break;
                }
            }
        }
        System.out.print("The distinct integers are: ");
        for(int x = 0; x < R.size();x++){
        System.out.print(R.get(x)+" ");
        }
    }
}
//34 5 3 5 6 4 33 2 2 4
