import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount("12345", "sai");
        Customer customer = new Customer(account);

        BankManager bankManager = new BankManager();
        bankManager.addAccount(account);

        while (true) {
            System.out.println("\nBanking Application Login:");
            System.out.println("1. Customer");
            System.out.println("2. Bank Manager");
            System.out.println("3. Exit");
            System.out.print("Choose a role to log in: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    customer.showMenu();
                    break;
                case 2:
                    bankManager.showMenu();
                    break;
                case 3:
                    System.out.println("Thank you for using our banking application!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
