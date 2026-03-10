import java.util.Scanner;

public class Method {

    public static void main(String[] args) {

        //  method = a block of reusable code that is executed when called ()
        Scanner input = new Scanner(System.in);

        //System.out.println("I've heard that today is your birthday!");
        //System.out.println("Please type your name: ");
        //String name = input.nextLine();
        //System.out.println("Please type your age: ");
        //int age = input.nextInt();

        System.out.println("Welcome to the Square Cube calculator!");
        System.out.println("Type a number and see the magic happening: ");
        double number = input.nextDouble();

        System.out.println(number + "² = " + square(number));
        System.out.println(number + "³ = " + cube(number));


        //happyBirthday(name, age);
        String fullName = getFullName("Camihoneiro", "Jaime");
        System.out.println(fullName);
        System.out.println("Enter your age");

        int age = input.nextInt();

        if (ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You may not sign up!");
        }
        input.close();
    }

    // Creating the method
    static double square(double number) {
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");

    }
    static String getFullName(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);
    }
    static boolean ageCheck(int age) {
        return age >= 18;
    }
}
