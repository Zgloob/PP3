
public class Email extends Message{
    private String subject;
    private String receipientAdress;
    Email(String text, String subject, String receipientAdress){
        super(text);
        this.subject = subject;
        this.receipientAdress = receipientAdress;
    }
    public String getSubject(){return this.subject;}
    public void setSubject(String subject){
        this.subject = subject;
        
    }
    
    public String getReceipientAdress(){return this.receipientAdress;}
    public void setReceipientAdress(String receipientAdress){
        this.receipientAdress = receipientAdress;
    }
    
    public void send(){
        System.out.println("DOKOŃCZYĆ!!!!!");
    }
}
