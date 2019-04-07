package thefan;

public class TheFan {
    
    public static void main(String[] args) {
        fan A1 = new fan();
        fan A2 = new fan();
        
        A1.setspeed(2);
        A1.setradius(10);
        A1.setON(true);
        A1.setcolor("yellow");
        
        A2.setspeed(1);
        A2.setradius(4);
        A2.setON(false);
        A2.setcolor("red");
        
        
        System.out.print("Fan no.1: "+A1.tostring() +" \nFan no.2: "+A2.tostring());
    }
    
}
