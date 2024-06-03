import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account Terminal");

        System.out.println("Enter your account number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.println("Enter your agence:");
        String agence = scanner.nextLine();

        System.out.println("Enter your name:");
        String clientName = scanner.nextLine();

        System.out.println("Enter your balance:");
        double balance = scanner.nextDouble();

        scanner.close();

        System.out.println("Hello " + clientName +
                ". Thank you for creating an account with our bank, your branch is " + agence +
                ", account " + accountNumber + " and your balance " + balance + " is now available for withdrawal");

    }
}
