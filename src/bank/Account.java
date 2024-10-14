package bank;

public class Account {
    private String name;
    private String number;
    private String pin;
    private double balance;

    public Account(String firstName, String lastName, String number, String correctPin){
        name = firstName + " " + lastName;
        pin = correctPin;
        this.number = number;
    }



        public String getnumber(){
        return number;
    }

    public boolean isCorrectPin(String correctPin){
        if (correctPin.equals(pin)){
            pin = correctPin;
            return true;
        }
        else return false;

    }

    public double getBalance(String correctPin){
        if (isCorrectPin(correctPin)){
            return balance;
        }
        return 0;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount, String correctPin){
        if (isCorrectPin(correctPin)) {

            if (balance >= amount && amount > 0) {
                balance -= amount;
            }
        }

    }

    public void changePin(String oldPin, String newPin){
        if (isCorrectPin(oldPin)) {
            pin = newPin;
        }
    }

}
