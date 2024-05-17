package ATM;

public class Account {
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber,int pin,double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getPin(int pin) {
        return pin;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance = amount;
    }
    public boolean withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }
    public void checkBalance() {
        System.out.println("Current balance is: " + balance);
    }
}
