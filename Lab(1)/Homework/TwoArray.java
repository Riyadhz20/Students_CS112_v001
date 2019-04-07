package twoarray;
import java.util.Scanner;
public class TwoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("How many elements (the size) in the first array: ");
        int n1 = input.nextInt();
        int [] a1 = new int [n1];
        System.out.print("Enter the elements of the first array: ");
        for(int i=0; i<a1.length;i++)
            a1[i] = input.nextInt();
        
        System.out.print("How many elements (the size) in the second array:");
        int n2 = input.nextInt();
        int [] a2 = new int [n2];
        System.out.print("Enter the elements of the second array: ");
        for(int i=0; i<a2.length;i++)
            a2[i] = input.nextInt(); 
        
        equals(a1,a2);
    }
    public static void equals (int [] a1, int [] a2){
        if (a1.length != a2.length){
            System.out.print("The size of the two arrays are not equals");
        }
        else{
            int a = 0;
            for(int i = 0 ; i < a1.length;i++){
                if(a1[i] == a2[i])
                a++;
            }
            if (a == a1.length)
                System.out.print("The two arrays are identical arrays");
                else
                System.out.print("The two arrays are not identical arrays");
        }
    }
}
