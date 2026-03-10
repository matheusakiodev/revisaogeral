import java.util.Scanner;

public class TriangleCreator {
    public static void main(String[] args) {
        // Create a program that prints a RIGHT TRIANGLE in which the user inputs the base
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the width of the triangle: \n");
        int width = input.nextInt();

        System.out.println("Please enter in which symbol would you like your triangle to be printed: \n");
        char symbol = input.next().charAt(0);

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }


        input.close();
    }

}
