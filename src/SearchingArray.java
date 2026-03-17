import java.util.Scanner;

public class SearchingArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        int target = 2;
        String stringTarget;

        System.out.println("Enter a fruit you want to search for: ");
        stringTarget = scanner.nextLine();

        // Linear Search
//        for(int i = 0; i < numbers.length; i++){
//            if(target == numbers[i]){
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(stringTarget)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");

        }

        scanner.close();
    }

}
