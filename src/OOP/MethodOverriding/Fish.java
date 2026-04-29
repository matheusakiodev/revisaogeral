package OOP.MethodOverriding;

public class Fish extends Animal{

    @Override   // Good practice to annotate because it will prompt an error if you misspell the method
    void move(){
        System.out.println("This animal is swimming");
    }
}
