package OOP.Super;

public class Student extends Person {

    double gpa;

    public Student(String first, String last, double gpa) {
        super(first, last); // When creating the constructor of a child class, we need to include the arguments from the
                            // parent class using the word super
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + "'s gpa is " + this.gpa + ".");
    }
}
