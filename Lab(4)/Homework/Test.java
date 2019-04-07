package test;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        
        
        StackOfInteger S = new StackOfInteger();
        Scanner i = new Scanner(System.in);
        System.out.print("To use the prime factors you must enter a postive integer which is greater then one: ");
        
        int n = i.nextInt();
        S.PrimeN(n);
        S.PrintInvers();
        
        System.out.printf("\nPrinting prime numbers under %d:\n",n);
        
        S.PrimeAnderN(n);
        S.PrintInvers();
    }
    
}
