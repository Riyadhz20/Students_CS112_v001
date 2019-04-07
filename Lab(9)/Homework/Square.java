package testg;

public class Square extends GeometricObject implements Colorable{
        
    private double Length;
    
    public Square() {
    }
    public Square(double Length) {
        this.Length = Length;
        
    }
    
    public double getLength() {
        return Length;
    }
    public void setLength(double Length) {
        this.Length = Length;
    }
    
    public void howToColor(){
        
        System.out.print("Color all four sides: "+getColor());
    }
    
    @Override 
    public double getArea() {
        return Length * Length;
    }
 
    @Override 
    public double getPerimeter() {
        return 4 * Length;
    }
    
}
