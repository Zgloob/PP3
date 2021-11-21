public class BankAccount{
    private String owner;
    private String accNumber;
    private float balance;
    private String password;
    private String login;
    
    
    public void withdraw(float amountOfWithdrawal){
        if (amountOfWithdrawal >= balance){
            System.out.println("Invalid info");
        }
        this.balance -= amountOfWithdrawal;
    };
    
    public void deposit(float amountOfDeposit){
        this.balance += amountOfDeposit;
    };
    
    public float displayBalance(){
        return balance;
    };
    
    
}
