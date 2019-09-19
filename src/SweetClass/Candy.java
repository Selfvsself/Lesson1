package SweetClass;

public class Candy extends Sweet{

    private String filing;  //Уникальное для класса поле "Начинка"

    public Candy(String name) {
        super(name);
        filing = "Без начинки";
        setTypeSweet("Конфеты");
    }

    public Candy(String name, double weight) {
        super(name, weight);
        filing = "Без начинки";
        setTypeSweet("Конфеты");
    }

    public Candy(String name, double weight, double price) {
        super(name, weight, price);
        filing = "Без начинки";
        setTypeSweet("Конфеты");
    }

    public String getFiling() {
        return filing;
    }

    public void setFiling(String filing) {
        this.filing = filing;
    }

    @Override
    public String toString() {
        return super.toString() + ", начинка: " + filing;
    }
}
