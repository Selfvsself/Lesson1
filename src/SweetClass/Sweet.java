package SweetClass;

public abstract class Sweet {
    private String typeSweet; //Тип сладости, задается в каждом классе
    private String name;
    private double weight;
    private double price;

    public Sweet(String name) {
        this.name = name;
        typeSweet = "Сладость";
    }

    public Sweet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Sweet(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getTypeSweet() {
        return typeSweet;
    }

    public void setTypeSweet(String typeSweet) {
        this.typeSweet = typeSweet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес дожен быть больше нуля");
        }
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть больше нуля");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return typeSweet + " " + name + ", вес: " + weight + "гр, цена: " + price + "р";        //Выводим информацию о сладости в воиде строки
    }

    public int compare(Sweet sweet) {
        String first = this.typeSweet + " " + this.name;
        String second = sweet.typeSweet + " " + sweet.name;

        return  first.compareToIgnoreCase(second);
    }


}
