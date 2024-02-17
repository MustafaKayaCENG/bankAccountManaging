package bankAutomation;

public class clientInformation {
    private String name;
    private int accountId;
    private double balance;
    
    public clientInformation(String name, int accountId, double balance) {
        this.name = name;
        this.accountId = accountId;
        this.balance = balance;
    }
    
    public void moneyDeposit(double amount) {
        this.balance += amount;
        System.out.println(this.name + " deposited " + amount);
        System.out.println("The new balance is :"+ this.balance);
    }
    
    public void moneyWithdrawal(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(this.name + " withdrew " + amount + " from their account.");
            System.out.println("The new balance is :"+ this.balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
    public void moneyTransfer(clientInformation receiver, double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            receiver.moneyDeposit(amount);
            System.out.println(amount + " transferred from " + this.name + " to " + receiver.getName() + ".");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getAccountId() {
        return accountId;
    }
    
    public double getBalance() {
        return balance;
    }
}
