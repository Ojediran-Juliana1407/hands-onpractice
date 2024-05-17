package ATM;

import java.util.Scanner;

public class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void validatePin(int pin) {
        if (pin != account.getPin(pin)) {
            System.out.println("Pin is Invalid");
        } else {
            System.out.println("Pin is Validated");
        }
    }
    public void displayMenu() {
        System.out.println("1. Withdrawal");
        System.out.println("2. Deposit");
        System.out.println("3. Balance inquiry");
        System.out.println("4. Buy Airtime");
        System.out.println("5. Exit");
    }
    public void handleUserSelection(int selection) {
        Scanner scanner = new Scanner(System.in);
        switch (selection) {
            case 1:
                System.out.println("Enter amount for withdrawal: ");
                double amount = scanner.nextDouble();
                if (account.withdraw(amount)) {
                    System.out.println("Withdrawal successful");
                }else{
                    System.out.println("Balance deficit");
                }
                break;

            case 2:
                System.out.println("Enter amount to deposit: ");
                amount = scanner.nextDouble();
                account.deposit(amount);
                System.out.println("Deposit successful");
                break;

            case 3:
                account.checkBalance();
                break;

            case 4:
                System.out.println("Enter amount to buy airtime: ");
                amount = scanner.nextDouble();
                if(account.withdraw(amount)) {
                    System.out.println("Airtime done successfully");
                }else{
                    System.out.println("Insufficient balance");
                }
                break;

            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid");


        }
    }

}
