package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Account account = new Account(2103715771,1407,5000.00);
        ATM atm = new ATM(account);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter PIN: ");
        int pin = scanner.nextInt();

        if(account.getAccountNumber()==accountNumber) {
            atm.validatePin(pin);
            while (true) {
                atm.displayMenu();
                System.out.println("Enter your selection please: ");
                int selection = scanner.nextInt();
                atm.handleUserSelection(selection);
                if (selection == 5) {
                    break;
                }
            }
        }else{
            System.out.println("invalid account number");
        }
    }
}
