

public class SMS extends Message{
    private int phoneNumber;
    private int n;
    
    
    SMS(String text,int phoneNumber){
        super(text);
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void send(){
        System.out.println("Message: " + getText() + "\n" + "From: " + phoneNumber + "\nLength" + charNumber());
    }
    
}
