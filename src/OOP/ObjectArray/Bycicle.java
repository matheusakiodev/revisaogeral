// OBJECT ARRAY
package OOP.ObjectArray;

public class Bycicle {

    String manufactor;
    String color;

    public Bycicle(String manufactor, String color) {
        this.manufactor = manufactor;
        this.color = color;
    }

    void ride() {
        System.out.println("You ride the " + this.color + " " + this.manufactor);
    }

}
