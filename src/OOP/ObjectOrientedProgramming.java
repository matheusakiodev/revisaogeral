package OOP;
public class ObjectOrientedProgramming {

    public static void main(String[] args) {

        // OBJECT = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car = new Car();

        car.isRunning = false;

//        System.out.println(car.make);
//        System.out.println(car.manufactor);
//        System.out.println(car.year);
//        System.out.println(car.price);
//        System.out.println(car.isRunning); // use the dot operator to access the atribute

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);


    }

}
