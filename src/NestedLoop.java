import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

        // nested loop = a loop inside a loop. Used often with matrices or DS&A

        /*for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
        Scanner input = new Scanner(System.in);
        int rows;
        int cols;
        char symbol;

        System.out.print("How many rows would you like to enter?: ");
        rows = input.nextInt();
        System.out.print("How many columns would you like to enter?: ");
        cols = input.nextInt();
        System.out.println("Enter the symbol to use: ");
        symbol = input.next().charAt(0);

        for(int i = 0; i < rows; i++ ){
            for(int j = 0; j < cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        input.close();
    }

}
