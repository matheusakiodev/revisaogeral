package OOP.WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {

        // Wrapper classes = allow primitive values to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // Deprecated way
        //Integer a = new Integer(123);
        //Double b = new Double(23.24);
        //Character c = new Character('$');

        String a1 = Integer.toString(123);
        String a2 = Double.toString(3.14);
        String a3 = Character.toString('@');
        String a4 = Boolean.toString(false);

        String a5 = a1 + a2 + a3 + a4;

        System.out.println(a5);

        //Parsing

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        Integer e = Integer.parseInt("123");
        Double f = Double.parseDouble("3.14");
        Character g = 'P';
        Boolean h = true;


    }


}
