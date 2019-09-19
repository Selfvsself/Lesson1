package SweetClass;

public class Lollipop extends Sweet {

    private double diameter;  //Уникальное для класса поле "Диаметр леденца"

    public Lollipop(String name) {
        super(name);
        diameter = 15;
        setTypeSweet("Леденцы");
    }

    public Lollipop(String name, double weight) {
        super(name, weight);
        diameter = 15;
        setTypeSweet("Леденцы");
    }

    public Lollipop(String name, double weight, double price) {
        super(name, weight, price);
        diameter = 15;
        setTypeSweet("Леденцы");
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter <= 0) {
            throw new IllegalArgumentException("Диаметр должен быть больше нуля");
        }
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return super.toString() + ", диаметр: " + diameter + "см";
    }
}
