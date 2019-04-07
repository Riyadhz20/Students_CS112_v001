package thefan;

public class fan {
    int SLOW = 0;
    int MEDIUM = 1;
    int FAST = 2;
    private int speed = SLOW;
    private boolean ON = false;
    private double radius = 4;
    String color = "red";
    

    void setspeed(int Nspeep){
        speed = Nspeep;
    }
    int getspeed(){
        return speed;
    }
    
    void setON(boolean NON){
        ON = NON;
    }
    boolean getON(){
        return ON;
    }
    
    void setradius(int Nradius){
        radius = Nradius;
    }
    double getradius(){
        return radius;
    }
    
    void setcolor(String Ncolor){
        color = Ncolor;
    }
    String getcolor(){
        return color;
    }
    
    String tostring(){
        
        if (ON == false){
            return "color: "+color+" radius: "+radius+" The Fan is off ";
        }
        
        else{
            return "speed: "+speed+" color: "+color+" radius: "+radius ;
        }
    }
}
