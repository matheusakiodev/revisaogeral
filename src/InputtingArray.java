import java.util.Scanner;

public class InputtingArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int arraySize;

        System.out.print("What # of food do you want?: ");
        arraySize = scanner.nextInt();
        scanner.nextLine();

        foods = new String[arraySize];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }


        scanner.close();
    }

}
