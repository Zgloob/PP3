
public class MobilePhone{
    private String model;
    private String brand;
    private String number;
    private int yearOfProduction;
    private boolean isOn;
    private String alarm;
    
    public MobilePhone(String model,String brand,String number,int yearOfProduction,boolean isOn,String alarm){
        this.model = model;
        this.brand = brand;
        this.number = number;
        this.yearOfProduction = yearOfProduction;
        this.isOn = isOn;
        this.alarm = alarm;
    }
    public void displayInfo(){
        System.out.println("model: " + this.model + "\n" + "brand: " + this.brand + "\n" + "number: " + this.number + "\n" + "year of production: " + this.yearOfProduction + "\n" + "is the mobile phone on: " + this.isOn 
        + "\n" + "alarm is set for: " + this.alarm);
    }
    
    public boolean turnOn(){
        return this.isOn = true;    
        }
            
        
    
    
    public boolean turnOff(boolean isOn){
        return this.isOn = false;
        
    }
    
    public String setAlarm(String alarmClock){
        this.alarm = alarmClock;
        return "Your alarm is set for: " + alarm;
        
    }
}
