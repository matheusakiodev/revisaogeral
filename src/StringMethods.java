public class StringMethods {

    public static void main(String[] args) {

        String name = "pAsSword";

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf("o");

//        name = name.toUpperCase();
//        name  = name.toLowerCase();
//        name = name.replace("o", "a");
//        name = name.trim();



        /*if(name.isEmpty()){
            System.out.println("Your name is empty");
        }else{
            System.out.println("Hello " + name);
        }*/

        /*if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name does not contain any spaces");
        }*/

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello, " + name);
        }

    }
}
