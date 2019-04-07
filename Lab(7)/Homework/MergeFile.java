package testfile;

import java.io.File;
import java.util.ArrayList;
import static java.util.Arrays.sort;
import java.util.Scanner;


public class MergeFile {
    
    ArrayList <String> A = new ArrayList <>();
    
    MergeFile(File file1, File file2) throws Exception {
        
            Scanner a = new Scanner(file1);
            while(a.hasNext())
                A.add(a.next());
        
        
            Scanner b = new Scanner(file2);
            while(b.hasNext())
                A.add(b.next());
    }
    
    public ArrayList<String> Sort(){
        String[] array = new String[A.size()];
        
        A.toArray(array);
        sort(array);
        
        A.clear();
        for(int i = 0; i < array.length; i++){
            A.add(array[i]);
        }
        return A;
    }
    
    public ArrayList<String> getArray() {
        return A;
    }
    
    public ArrayList<String> NoRepetitions(){
        
        for(int i = 0; i<A.size();i++){
           for(int j = 0 ; j<A.size();j++){
               if(A.get(i).equals(A.get(j))&& i!=j){
                   A.remove(j);
               }
           }
        }
        return A;
    }
    
}
