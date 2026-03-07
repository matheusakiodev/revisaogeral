import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values  if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;
        Scanner scanner = new Scanner(System.in);

        int score;
        int number;
        int income = 60000; // salary demo
        double taxRate = (income >= 4000) ? 0.25 : 0.15;

        System.out.println(taxRate);


        System.out.println("Enter your test score: ");
        score = scanner.nextInt();
        String passOrFail = (score >=60) ? "Congratulations, you have passed your exam!" : "Woah, it seems that you have failed. Keep studying and don't give up!";

        System.out.println(passOrFail);

        System.out.println("Enter a random integer: ");
        number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
        scanner.close();
    }
}
