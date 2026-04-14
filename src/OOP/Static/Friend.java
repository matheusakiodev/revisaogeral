package OOP.Static;

public class Friend {

    static int numOfFriends; // this way, all of our friend objects share the same data
    String name;

    public Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " friends."); // the atribute is static, no need to call
                                                        // "this.numOfFriends"

    }

}
