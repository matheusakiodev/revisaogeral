import java.util.Scanner;

public class Substrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // .substring() = a method used to extract a portion of a string
        //                sting.substring(start, end)

        String email;
        String username;
        String domain;


        System.out.print("Enter your email: ");

        email = scanner.nextLine();

        if(email.contains("@")){

            username = email.substring(0, email.indexOf("@")); // excludes @
            domain = email.substring(email.indexOf("@") + 1); // + 1 excludes @

            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("Invalid email address, must contain @");
        }

        scanner.close();
    }

}
