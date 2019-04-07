
package testfile;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile {

    public static void main(String[] args) throws Exception {
        
        
        
        File File1 = new File("src\\testfile\\file1.txt");
        System.out.println("Does it exist? " + File1.exists()+"\nAbsolute path is " +File1.getAbsolutePath());
            
            
        File File2 = new File("src\\testfile\\file2.txt");
        System.out.println("\nDoes it exist? " + File2.exists()+"\nAbsolute path is " +File2.getAbsolutePath());
            
        MergeFile A = new MergeFile(File1, File2);
        
        System.out.print(" \n"+"Names in the File: "+A.getArray()+" \n"+"With Sorting: "+A.Sort());
        
        
        
        PrintWriter  F3W = new PrintWriter ("src\\testfile\\mergedFile.txt");
        System.out.print("\n\nFile 3 Has been created ");
        for(int i =0; i<A.NoRepetitions().size();i++)
            F3W.println(A.NoRepetitions().get(i)+" ");
        F3W.close();
        
        System.out.print("\nWriting Done!\n\nNames in the File3: \n");
        
        File File3 = new File("src\\testfile\\mergedFile.txt");
        
        Scanner F3R = new Scanner(File3);
        while(F3R.hasNext())
            System.out.print(F3R.nextLine()+" ");
        
        
        
        
    }
}
