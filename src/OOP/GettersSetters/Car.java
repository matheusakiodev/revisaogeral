package OOP.GettersSetters;

public class Car {

    private final String model;
    private String color;
    private int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }


    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return + price;
    }

    public void setPrice(int price) {
        if(price < 0) {
            throw new IllegalArgumentException();
        } else {
            this.price = price;
        }
    }

}
