package test2;

public class Test2 {

    public static void main(String[] args) {
        Student A =new Student("Riyadh",3900000);
        Staff B = new Staff("Ahmad",111, "manger");
        Faculty C = new Faculty("Bra", 2559478, "Techer");
                
        System.out.println(A.toString());
        System.out.println("\n"+B.toString());
        System.out.println("\n"+C.toString());
        
    }
    
}
