package OOP.Static;

public class Static {
    public static void main(String[] args) {

        // static = Makes a variable or method belongs to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Garry");



        System.out.println(Friend.numOfFriends); // we should call it by the class instead of from a new
                                                 // instanced object.
        Friend.showFriends();



    }

}
