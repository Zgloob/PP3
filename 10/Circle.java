
public class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double area(){return ((radius * radius) * 3.14);}
    public double perimeter(){return(2*3.14*radius);}
    
    public static void main(String args[]){
        Circle s1 = new Circle(2.00);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}
