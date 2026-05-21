package OOP.Composition;

public class Engine {

    String type;

    public Engine(String type) {
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine.");
    }

    void stop(){
        System.out.println("You stop the " + this.type + " engine.");
    }
}
