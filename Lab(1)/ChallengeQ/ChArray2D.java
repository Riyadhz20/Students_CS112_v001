package charray2d;
import java.util.Scanner;
public class ChArray2D {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("How many elements (the size) in the first array: ");
        int r1 = input.nextInt();
        int c1 = input.nextInt();
        int [][] a1 = new int [r1][c1];
        
        System.out.print("Enter the elements of the first array: \n");
        for(int i=0; i<a1.length;i++)
            for(int j = 0; j<a1[i].length ; j++)
                a1[i][j] = input.nextInt();

        System.out.print("How many elements (the size) in the second array:");
        
        int r2 = input.nextInt();
        int c2 = input.nextInt();
        int [][] a2 = new int [r2][c2];
        
        System.out.print("Enter the elements of the second array: \n");
        for(int i=0; i<a2.length;i++)
            for(int j = 0; j<a2[i].length ; j++)
                a2[i][j] = input.nextInt();

        equals(a1,a2);
    }
    public static void equals (int [][] a1, int [][] a2){
        if (a1.length != a2.length){
            System.out.print("The Row of the two arrays are not equals");
        }
        else {
            int a = 0;
            for(int i = 0 ; i<a1.length;i++){
                if(a1[i].length == a2[i].length){
                    a++;
                }
            }
            
            if (a != a1.length||a!=a2.length){
                System.out.print("The Colomn of the two arrays are not equals");
            }
            else {
                int b = 0;
                int c = 0;
                for(int i = 0 ; i < a1.length;i++){ 
                    for(int j = 0; j<a1[i].length;j++){
                        c++;
                        if(a1[i][j] == a2[i][j]){
                            b++;
                            }
                        }
                    }
                if (b == c)
                    System.out.print("The two arrays are identical arrays");
                else
                    System.out.print("The two arrays are not identical arrays");
            }
        }
    }
}
