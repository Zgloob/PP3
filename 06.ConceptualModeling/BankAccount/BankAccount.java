public class BankAccount{
    private String owner;
    private String accNumber;
    private float balance;
    private String password;
    float amountOfWithdrawal;
    float amountOfDeposit;
    
    public void withdraw(float amountOfWithdrawal){
        this.balance = (this.balance - amountOfWithdrawal < 0 || amountOfWithdrawal > 500) ? this.balance : this.balance - amountOfWithdrawal;
        if (this.balance - amountOfWithdrawal < 0){
            System.out.println("Not enough funds available");
        }
        else
        {System.out.println(amountOfWithdrawal + " PLN" + " was withdrawn from your account");}
        
        if (amountOfWithdrawal > 500){
            System.out.println("Cannot withdraw more than 500 PLN at once");
        }
    
    };
    
    public void deposit(float amountOfDeposit){
        this.balance += amountOfDeposit;
        System.out.println(amountOfDeposit + " PLN" + " was added to your account");
    };
    
    public void displayBalance(){
        System.out.println("Your total balance is: " + this.balance + " PLN");  
    };
    
    public static void main(String args[]) {
        BankAccount account1 = new BankAccount();
        account1.deposit(500);
        account1.displayBalance();
        account1.deposit(200);
        account1.displayBalance();
        account1.withdraw(300);
        account1.displayBalance();
    
        
        
    }
}
