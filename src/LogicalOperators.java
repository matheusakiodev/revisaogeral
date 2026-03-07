import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // !  = NOT
        Scanner scanner = new Scanner(System.in);

        double temp;
        boolean isSunny = true;

        System.out.println("What is the temperature outside?: ");
        temp = scanner.nextDouble();
        System.out.println("Is it sunny outside? (y/n): ");
        if(scanner.nextLine().equalsIgnoreCase("y")){
            isSunny = true;
        } else if (scanner.nextLine().equalsIgnoreCase("n")){
            isSunny = false;
        }


        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD.");
            System.out.println("It is sunny outside.");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is GOOD.");
            System.out.println("It is cloudy outside.");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is BAD.");
        }

    }

}
