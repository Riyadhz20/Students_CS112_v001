package testp;


public class Square extends GeometricObject{
        
    private double Length;
    
 
    public Square() {
    }
    public Square(double Length) {
        this.Length = Length;
        
    }
    
 // Return width
    public double getLength() {
        return Length;
    }
    
 // Set a new width
    public void setLength(double Length) {
        this.Length = Length;
    }
    
    
  
    @Override 
 // Return area
    public double getArea() {
        return Length * Length;
    }
 
    @Override 
 // Return perimeter
    public double getPerimeter() {
        return 4 * Length;
    }

    
}
