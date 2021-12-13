public class Rectangle extends Shape{
    private double base;
    private double side;
    
    Rectangle(double base, double side){
        this.base = base;
        this.side = side;
    }
    
    public double area(){return (base * side);}
    public double perimeter(){return(2*base + 2*side);}
    
    public static void main(String args[]){
        Rectangle s1 = new Rectangle(2.00,3.00);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }

}

