package SweetClass;

public class Jellybean extends Sweet {

    private String taste;  //  //Уникальное для класса поле "Вкус мармеладки" например яблочная, вишневая и тд.

    public Jellybean(String name) {
        super(name);
        taste = "Белые";
        setTypeSweet("Мармеладки");
    }

    public Jellybean(String name, double weight) {
        super(name, weight);
        taste = "Белые";
        setTypeSweet("Мармеладки");
    }

    public Jellybean(String name, double weight, double price) {
        super(name, weight, price);
        taste = "Белые";
        setTypeSweet("Мармеладки");
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", вкус: " + taste;
    }
}
