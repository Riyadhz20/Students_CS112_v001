package testp;


public class Testp  {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        GeometricObject R = new Rectangle(5 , 6);
        R.setColor("Red");
        
        System.out.println("Rectangle Perimeter: "+R.getPerimeter()
                +" \nRectangle Area: "+R.getArea()
                +" \nRectangle Color: "+R.getColor() );
        
        
        GeometricObject C = new Circle(7);
        C.setColor("Grean");
        
        System.out.println("\nCircle Perimeter: "+C.getPerimeter()
                +" \nCircle Area: "+C.getArea()
                +" \nCircle Color: "+C.getColor() );
        
        
        GeometricObject S = new Square(8);
        S.setColor("Blue");
        
        System.out.println("\nSquare Perimeter: "+S.getPerimeter()
                +" \nSquare Area: "+S.getArea()
                +" \nSquare Color: "+S.getColor() );
        
        
        
        
    }
    
}
