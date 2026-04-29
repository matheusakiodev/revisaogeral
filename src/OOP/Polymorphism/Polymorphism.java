package OOP.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        // Polymorphism = Many Shapes
        //                Objects can identify as other objects. Ex: A dog could identify as an organism, animal, object
        //                Objects can be treated as objects of a common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
