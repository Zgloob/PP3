
/**
 * 3.15
 */
public class BasicStatistics{

    public static void calculator(int x,int y){
    int i;
    float sum = 0;
    for(i = x; i <= y; i++){
        sum = sum + i;
    
    }
    System.out.println("Sum of numbers in range " + x + " and " + y + " equals: " + sum);
    if (x > 0 && y > 0 && x < y){
        System.out.println("Number of elements between " + x + " and " + y + " is " + (Math.abs(x-y-1)));
        System.out.println("Arithmetic mean of the numbers in range " + x + " and " + y + " equals: " + (sum/(Math.abs(x-y-1))));
    }
    
    if (x > 0 && y > 0 && x > y){
        System.out.println("Number of elements between " + x + " and " + y + " is " + (Math.abs(x-y+1)));
        System.out.println("Arithmetic mean of the numbers in range " + x + " and " + y + " equals: "+ (sum/(Math.abs(x-y+1))));
    }
    else if (x < 0 && y < 0 && x > y){
        System.out.println("Number of elements between " + x + " and " + y + " is " + (Math.abs(x-y+1)));
        System.out.println("Arithmetic mean of the numbers in range " + x + " and " + y + " equals: " + (sum/(Math.abs(x-y+1))));
    }
    
    else if (x < 0 && y < 0 && x < y){
        System.out.println("Number of elements between " + x + " and " + y + " is " + (Math.abs(x-y-1)));
        System.out.println("Arithmetic mean of the numbers in range " + x + " and " + y + " equals: " + (sum/(Math.abs(x-y-1))));
    }

}}
