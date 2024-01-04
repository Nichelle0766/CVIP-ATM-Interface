import java.util.Scanner;

public class ATM {

    private static int balance = 10000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    private static void withdraw() {
                Scanner input = new Scanner(System.in);

        System.out.println("Enter amount to withdraw: ");
        int amount = input.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash");
            System.out.println("Your new balance is: " + balance);
        }
    }

    private static void deposit() {
                Scanner input = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        int amount = input.nextInt();
        balance += amount;
        System.out.println("Amount deposited successfully");
        System.out.println("Your new balance is: " + balance);
    }
}
