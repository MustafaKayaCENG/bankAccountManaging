package bankAutomation;

import java.util.ArrayList;
import java.util.List;

public class checkAccount {
    private List<clientInformation> users;

    public checkAccount() {
        this.users = new ArrayList<>();
    }
    
    public void checkBalance(int accountId) {
    	clientInformation client = getClient(accountId);
    	if(client != null) {
    		System.out.println(client.getName()+" has "+client.getBalance()+" in their account");
    	}
    }
    

    public void addClient(String name, int accountId, double balance) {
        this.users.add(new clientInformation(name, accountId, balance));
        System.out.println(name + " is new client of bank!");
    }

    public void moneyDeposit(int accountId, double balance) {
        clientInformation client = getClient(accountId);
        if (client != null) {
            client.moneyDeposit(balance);
            System.out.println("Money deposited to account: " + client.getAccountId());
        } else {
            System.out.println("There is no such user!");
        }
    }

    public void moneyWithdraw(int accountId, double balance) {
        clientInformation client = getClient(accountId);
        if (client != null) {
            client.moneyWithdrawal(balance);
            System.out.println("Money withdrawn from account: " + client.getAccountId());
        } else {
            System.out.println("There is no such user!");
        }
    }

    public void moneyTransfer(int senderAccountId, int receiverAccountId, double amount) {
        clientInformation sender = getClient(senderAccountId);
        clientInformation receiver = getClient(receiverAccountId);
        if (sender != null && receiver != null) {
            sender.moneyTransfer(receiver, amount);
            System.out.println(amount + " TL has been transferred from account: " + senderAccountId +" to account: " + receiverAccountId);
        } else {
            System.out.println("There is no such user!");
        }
    }

    private clientInformation getClient(int accountId) {
        for (clientInformation client : users) {
            if (client.getAccountId() == accountId) {
                return client;
            }
        }
        return null;
    }
    
    public void showClientAccounts() {
        for (clientInformation user : users) {
            System.out.println(user.getName() + "'s account has " + user.getBalance() + " TL.");
        }
    }

}
