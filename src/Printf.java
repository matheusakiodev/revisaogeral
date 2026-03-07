public class Printf {

    public static void main(String[] args) {

        // printf() is a method used to format output, hence the F

        // %[flags][width][.precision][specifier-character]

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // Demonstration
        System.out.printf("Hello, %s.\n", name ); // string
        System.out.printf("Your name starts with %c.\n", firstLetter); // char
        System.out.printf("Your are %d years old.\n", age); // integer
        System.out.printf("You are %f inches tall.\n", height); //float
        System.out.printf("Employed: %b\n", isEmployed); // boolean


        // More than one variable
        System.out.printf("%s is %d years old.\n", name, age);


        // Precision demo
        // %[flags][width][.precision][specifier-character]
        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive


        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.2f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);


        // Padding demo
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);




    }

}
