
/**3.8 */
public class SurfaceArea{
    
    public int circleRadius;
    public int squareBase;
    public int triangleBase;
    public int triangleHeight;
    public static void Circle(int circleRadius, double pi){
        System.out.println("Area of circle is: ");
        System.out.println(pi*circleRadius*circleRadius);
        
    }
    
    public static void Square(int squareBase){
        System.out.println("Area of square is: ");
        System.out.println(squareBase*squareBase);
    }
    
    public static void Triangle(int triangleBase, int triangleHeight){
        System.out.println("Area of triangle is: ");
        System.out.println((triangleBase*triangleHeight)/2);
    }
    
}

