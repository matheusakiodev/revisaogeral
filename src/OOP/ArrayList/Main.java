package OOP.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // ArrayList = A Resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change.


        ArrayList<String> fruits = new ArrayList<>(); // Patter for creating an ArrayList

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(1);
        // fruits.set(0, "Watermelon");  // replacing Apple with Watermelon


        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));

        System.out.println(fruits);

        System.out.println("The array has " + fruits.size() + " elements.");

        Collections.sort(fruits);

        System.out.println("The alphabetically ordered ArrayList is: " + fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
