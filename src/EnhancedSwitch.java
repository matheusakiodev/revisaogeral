import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

    // Enhanced Switch = A replacement to many else if statement
    //                   (Java 14 feature)

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Type a day of the week: ");
        day = scanner.nextLine();

        switch (day) {
            case "Monday",  "Tuesday", "Wednesday", "Thursday",  "Friday" -> System.out.println("It's a weekday... :(");
            case "Saturday", "Sunday" -> System.out.println("It's a weekend! :)");
            default -> System.out.println(day + " is not a day!");
        }

        scanner.close();
    }

}
