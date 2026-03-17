import java.util.Arrays;

public class ArraysJava {

    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "kiwi"};
        int numOfFruits = fruits.length;
        Arrays.sort(fruits); // sorting alphabetically

//        fruits[0] = "pineapple"; // by specifying the index, we can change any element

        System.out.println(fruits); // we get a memory address
        System.out.println(Arrays.toString(fruits)); // using the method toString()
        System.out.println(fruits[0]);
        fruits[0] = "pineapple"; // by specifying the index, we can change any element
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
//        System.out.println(fruits[4]); we'll get an exception
        System.out.println(numOfFruits);

        for(int i = 0; i < numOfFruits; i++){
            System.out.print(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Arrays.fill(fruits, "pineapple"); // filling all the elements with "pineapple"
        System.out.println(Arrays.toString(fruits));

    }

}
