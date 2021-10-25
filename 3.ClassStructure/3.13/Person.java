
/** 3.13
 */
public class Person{
    public String name;
    public int weight;
    public int height;
    public float bmi;
    
    public Person( int kg, int cm){
        height = cm;
        weight = kg;
       
        
    }
    
    public void setWeightAndHeight(int newWeight, int newHeight){
        weight = newWeight;
        height = newHeight;
        
    }
    
    public void calculateBMI(){
        bmi = (weight/(height*height));
        System.out.println("Your BMI is: ");
        System.out.println(bmi);
        if (bmi > 18.5 && bmi < 24.9){
            System.out.println("Your BMI is correct");}
        else if (bmi < 18.5){
            System.out.println("Your BMI is too low");}
        else if (bmi > 24.9){
            System.out.println("Your BMI is too hight");}
        }
    public void displayRecord(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("BMI: " + bmi);
    
    }
}
            
    

