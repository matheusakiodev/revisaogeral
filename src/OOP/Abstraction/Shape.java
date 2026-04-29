package OOP.Abstraction;

public abstract class Shape {

    abstract double area(); // ABSTRACT

    void display() { // CONCRETE METHOD
        System.out.println("This is a shape");
    }
}
