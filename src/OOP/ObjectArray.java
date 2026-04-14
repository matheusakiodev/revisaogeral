package OOP;

public class ObjectArray {
    public static void main(String[] args) {

        // Instancing one by one
        // Bycicle bycicle1 = new Bycicle("Pinarello", "Red");
        // Bycicle bycicle2 = new Bycicle("Cannondale", "Silver");
        // Bycicle bycicle3 = new Bycicle("Scott", "Golden");

        //Bycicle[] bycicles = {bycicle1, bycicle2, bycicle3};

        //Instancing by anonimous objects
        Bycicle[] bycicles ={new Bycicle("Pinarello", "Red"),
                             new Bycicle("Cannondale", "Silver"),
                             new Bycicle("Scott", "Golden")};


        // 2 ways of doing the same for loop
        for(int i = 0; i < bycicles.length; i++){
            bycicles[i].ride();
        }

        for (Bycicle bycicle : bycicles) {
            bycicle.color = "black";
        }

        // better option with the enhanced for loop
        for (Bycicle bycicle : bycicles) {
            bycicle.ride();
        }



    }
}
