package testfileurl;

import java.io.PrintWriter;
import java.util.Scanner;
import java.net.URL;
public class TestFileURL {

    public static void main(String[] args) {
        System.out.println("Link is: https://www.w3.org/TR/PNG/iso_8859-1.txt");
        
        
        try {
            URL link = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt"); 
            PrintWriter  file3 = new PrintWriter ("src\\testfileurl\\Save.txt"); //https://www.w3.org/TR/PNG/iso_8859-1.txt
            
            System.out.println("File Has been created");
            System.out.println("Copy Taxt in The Link...");
            
            Scanner input = new Scanner(link.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                file3.println(line);
            } 
            file3.close();
            
            System.out.println("\nCopy comblited");
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException ex) {
            System.out.println("IO Errors");
        }
    }
}
