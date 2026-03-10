import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

//        for loop = execute some code a CERTAIN amount of times
//        inside the condition of the loop, there are 3 statements
//        the first variable is the index counter(i), the second is the stop condition, the third is the step increment in i


        /*
        System.out.println("Enter how many times you want to loop: ");
        int max = input.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
        */

        Scanner input = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = input.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy New Year!");

        input.close();
    }
}
