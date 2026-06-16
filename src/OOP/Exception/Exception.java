package OOP.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//    Exception = An event that interrupts the normal flow of a program. (Dividing by zero, file not found, mismatch input type). Surround any dangerous code with a try{} block = try{}, catch{}, finally{}.

        try {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("Please type a number!");

        }
        catch(ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
        finally{
            input.close();
            System.out.println("This always executes.");
        }

    }
}
