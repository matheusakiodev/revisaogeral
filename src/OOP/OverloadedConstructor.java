package OOP;

public class OverloadedConstructor {
    public static void main(String[] args) {

        // OVERLOADED CONSTRUCTORS = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objets to be initialized in various ways

        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "patrick.star@gmail.com");
        User user3 = new User("Sirigueijo", "sirigueijo@gmail.com", 45);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);



    }
}
