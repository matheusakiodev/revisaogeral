import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Number Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d: \n", min, max);

        do {
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high! Try again");
            }
            else {
                System.out.println("Correct! The number was: " + guess);
                System.out.println("# of attempts: " + attempts);
            }

        }while(guess != randomNumber);


        scanner.close();
    }

}
