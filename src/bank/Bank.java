package bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(String firstName, String lastName, String pin){
        Account account = new Account(firstName, lastName,"0","1234");
        accounts.add(account);
    }

    public int accountCountIncreament(){

        return accounts.size();
    }

    public double checkBalance(String AccountNumber, String pin) {
        return accounts.get(Integer.parseInt(AccountNumber)).getBalance("correctPin");
    }

    public void deposit(double amount, String AccountNumber) {
        accounts.get(Integer.parseInt(AccountNumber)).deposit(amount);
    }

    public void withdraw(double amount, String AccountNumber, String pin) {
        accounts.get(Integer.parseInt(AccountNumber)).withdraw(amount, pin);
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount, String pin) {
        withdraw(amount,fromAccountNumber, pin);
        deposit(amount, toAccountNumber);
    }
}
