
import java.util.Scanner;

public class HypotenuseCalc {

    public static void main(String[] args) {
    // Hypotenuse c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A in cm: ");
        a = scanner.nextDouble();

        System.out.println("Enter the length of side B in cm: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + " cm.");

        scanner.close();
    }

}
