package SweetClass;

public class Marshmallow extends Sweet {

    private String color;  //Уникальное для класса поле "Цвет зефира"

    public Marshmallow(String name) {
        super(name);
        color = "Белый";
        setTypeSweet("Зефир");
    }

    public Marshmallow(String name, double weight) {
        super(name, weight);
        color = "Белый";
        setTypeSweet("Зефир");
    }

    public Marshmallow(String name, double weight, double price) {
        super(name, weight, price);
        color = "Белый";
        setTypeSweet("Зефир");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", цвет: " + color;
    }
}
