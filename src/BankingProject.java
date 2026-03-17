import java.util.Scanner;

public class BankingProject {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {



        // Java banking program

        double balance = 10.99;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("****************************");
            System.out.println("Welcome to Banking Program");
            System.out.println("**************************** ");
            System.out.println("1- Show balance");
            System.out.println("2- Deposit");
            System.out.println("3- Withdraw");
            System.out.println("4- Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("Thank you for using Banking Program. Have a nice day!");

        input.close();
    }
    static void showBalance(double balance){
        System.out.println("**************************** ");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit(){
        double amount;

        System.out.print("Enter your deposit amount: ");
        amount = input.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }


    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter your withdraw amount: \n");
        amount = input.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }

    }

}
