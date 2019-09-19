package SweetClass;

public class Chocolate extends Sweet {

    double percetageCocoa;  //Уникальное для класса поле "Процента какао"

    public Chocolate(String name) {
        super(name);
        percetageCocoa = 33;
        setTypeSweet("Шоколад");
    }

    public Chocolate(String name, double weight) {
        super(name, weight);
        percetageCocoa = 33;
        setTypeSweet("Шоколад");
    }

    public Chocolate(String name, double weight, double price) {
        super(name, weight, price);
        percetageCocoa = 33;
        setTypeSweet("Шоколад");
    }

    public double getPercetageCocoa() {
        return percetageCocoa;
    }

    public void setPercetageCocoa(double percetageCocoa) {
        if (percetageCocoa <= 0 || percetageCocoa > 100) {
            throw new IllegalArgumentException("Процент какао должен быть больше нули и меньше 100%");
        }
        this.percetageCocoa = percetageCocoa;
    }

    @Override
    public String toString() {
        return super.toString() + ", % какао: " + percetageCocoa;
    }
}
