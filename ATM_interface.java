/*1.Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions. */


import java.util.Scanner;

class BankAccount {
    private int accountNo;
    private String name;
    private double balance;

    public BankAccount(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class ATM_machine extends BankAccount {

    public ATM_machine(int accountNo, String name,  double balance) {
        super(accountNo, name, balance);
    }

}

public class ATM_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM_machine account = new ATM_machine(1008, "Harry", 1000);

        int choice;
        do {
            System.out.println("\n1. Balance Inquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + account.getBalance());
                    System.out.println("****************************************************************************");
                    break;
                    case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("****************************************************************************");
                    break;
                    case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("****************************************************************************");
                    break;
                    
                    case 4:
                    System.out.println("Exiting...");
                    System.out.println("****************************************************************************");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println("****************************************************************************");
            }
        } while (choice != 4);

        sc.close();
    }
}

