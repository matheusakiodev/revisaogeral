public class TwoDArrays {

    public static void main(String[] args) {

        String[] fruits = {"banana", "apple", "orange"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "beef", "pork", "fish"};

        String[][] groceries =  {fruits, vegetables, meats};
        groceries[2][0] = "game";

        for(String[] foods : groceries) {
              for(String food : foods) {
                  System.out.print(food + " ");
              }
        }

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
