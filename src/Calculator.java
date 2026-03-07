import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        double result = 0;
        char operator;
        boolean validOperatorion = true;

        System.out.print("Please enter the first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Please enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Please enter the second number: ");
        number2 = scanner.nextDouble();

        switch (operator) {
            case '+'-> result = number1 + number2;
            case '-'-> result = number1 - number2;
            case '*'-> result = number1 * number2;
            case '/'-> {
                if (number2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperatorion = false;
                }
                else  result = number1 / number2;
            }
            case '^'-> result = Math.pow(number1, number2);
            default ->{
                System.out.println("Not a valid operator. Please try again.");
                validOperatorion = false;
            }
        }

        if(validOperatorion){
            System.out.println(result);
        }

    }
}
