import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList{
    private ArrayList<String> cart = new ArrayList<>();
    
    public void display(){
        for(String num : this.cart){
            System.out.println(num);
        }
    }
    
    public void addItem(){
        System.out.println("Add product: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        cart.add(input);
        
    }
    public void displayNumber(){
        int size = this.cart.size();
    	System.out.println("Number of products to be purchased: " + size);
        
    }
    public static void main(String[] args){
        ShoppingList s1 = new ShoppingList();
        
        s1.display();
        s1.displayNumber();
        s1.addItem();
        s1.addItem();
        s1.addItem();
        s1.display();
        s1.displayNumber();  
        s1.addItem();
        s1.display();
        s1.displayNumber();
        
        
      
        
        
    }
}
