package OOP.Aggregation;

public class Library {

    private String name;
    private int year;
    private Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name + ".");
        System.out.println("Books available: ");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
