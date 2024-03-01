import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {
        double balance = 1000.0; // Initial balance
        Scanner scanner = new Scanner(System.in);

        // Display ATM options
        System.out.println("Welcome to the ATM System");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt(); // Read user choice

        // Perform action based on user choice
        if (choice == 1) {
            // Check Balance option
            System.out.println("Your current balance is: Rs. " + balance + "/-");
        } else if (choice == 2) {
            // Deposit Money option
            System.out.print("Enter the amount to deposit: ");
            double amount = scanner.nextDouble(); // Read deposit amount
            balance += amount; // Update balance
            System.out.println("Deposit of Rs. " + amount + "/- successful. Your new balance is: Rs. " + balance + "/-");
        } else if (choice == 3) {
            // Withdraw Money option
            System.out.print("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble(); // Read withdrawal amount
            if (amount > balance) {
                // Insufficient funds
                System.out.println("Insufficient funds. Withdrawal failed.");
            } else {
                // Sufficient funds, update balance
                balance -= amount;
                System.out.println("Withdrawal of Rs. " + amount + "/- successful. Your new balance is: Rs. " + balance + "/-");
            }
        } else if (choice == 4) {
            // Exit option
            System.out.println("Thank you for using the ATM System. Goodbye!");
        } else {
            // Invalid option
            System.out.println("Invalid option. Please choose a valid option.");
        }
        
        
    }
}

/* OUTPUT:
compile time:success
Run time:Welcome to the ATM System
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 3
Enter the amount to withdraw: 34
Withdrawal of Rs. 34.0/- successful. Your new balance is: Rs. 966.0/-

*/
