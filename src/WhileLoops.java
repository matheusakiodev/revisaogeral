import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = "";
        String response = "";
        int age = 0;
        int number = 0;

        while(name.isEmpty()){
            System.out.println("Please enter your name");
            name = input.nextLine();
        }


        do{
            System.out.println("Your age cannot be negative.");
            System.out.println("Please enter your age");
            age = input.nextInt();
        }while(age <0 );

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");

        do {
            System.out.println("Enter a number between 1 - 10");
            number = input.nextInt();
        } while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        while(!response.equals("Q")){
            System.out.println("You are playing a game!");
            System.out.println("Press Q to quit");
            response = input.next().toUpperCase();
        }

        System.out.println("You have quit the game!");


        input.close();
    }
}
