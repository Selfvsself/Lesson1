import SweetClass.Sweet;

public interface BoxSweet {
    void add(Sweet obj);
    void delete();
    void delete(int index);
    double getWeightBox();
    double getPriceBox();
    String getInfoSweet(int index);
    String[] getInfoSweetAll();
    String getInfoBox();
    int getSize();
    void reduceWeight(double weight);
    void sortByWeight();
    void sortByPrice();
    void sortByName();
}
