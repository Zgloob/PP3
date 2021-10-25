
/**3.11 */
public class SurfaceArea{
    
    public static int circleRadius;
    public static int rectangleSideA;
    public static int rectangleSideB;
    public static int triangleBase;
    public static int triangleHeight;
    public static void Circle( double pi){
        circleRadius = 3;
        System.out.println("Area of a circle is: ");
        System.out.println(pi*circleRadius*circleRadius);
        
    }
    
    public static void Rectangle(){
        rectangleSideA = 4;
        rectangleSideB = 5;
        
        System.out.println("Area of a rectangle is: ");
        System.out.println(rectangleSideA*rectangleSideB);
    }
    
    public static void Triangle(){
        triangleHeight = 4;
        triangleBase = 3;
        System.out.println("Area of a triangle is: ");
        System.out.println((triangleBase*triangleHeight)/2);
    }
    
}
