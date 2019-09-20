import SweetClass.Sweet;

import java.util.Arrays;

public class SimpleBoxSweet implements BoxSweet{

    private Sweet[] arraySweets;
    private int lenght;
    private double weightBox;
    private double priceBox;

    public SimpleBoxSweet() {
        arraySweets = new Sweet[5];
        lenght = 0;
    }

    @Override
    public void add(Sweet obj) {
        if (lenght == arraySweets.length-1) {                                 // Если добавляем новый элемент в последний элемент массива
            arraySweets = Arrays.copyOf(arraySweets, lenght + 5);    //То создаем новый массив новым размером и копируем в него старый массив
        }
        weightBox += obj.getWeight();                                       //Добавляем вес к коробке с добавлением сладости
        priceBox += obj.getPrice();                                           //Добавляем цену с добавлением сладости
        arraySweets[lenght] = obj;
        lenght++;
    }

    @Override
    public void deleteLastItem() {
        if (lenght > 0) {
            weightBox -= arraySweets[lenght - 1].getWeight();            //Убавляем вес с коробки с удалением сладости
            priceBox -= arraySweets[lenght - 1].getPrice();             //Убавляем цену с удалением сладости
            lenght--;
            arraySweets[lenght] = null;
        }
    }

    @Override
    public void delete(int index) {
        if (index >= lenght || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Нету сладости под индексом " + index);
        }

        weightBox -= arraySweets[index].getWeight();        //Убавляем вес с коробки с удалением сладости
        priceBox -= arraySweets[index].getPrice();          //Убавляем цену с удалением сладости
        for (int i = index; i < lenght - 1; i++) {
            arraySweets[i] = arraySweets[i+1];
        }
        lenght--;
        arraySweets[lenght] = null;
    }

    @Override
    public double getWeightBox() {
        return weightBox;
    }

    @Override
    public double getPriceBox() {
        return priceBox;
    }

    @Override
    public String getInfoSweet(int index) {                 //Возвращаем информацию об одном элементе коробки в виде строки
        if (index >= lenght || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Нету сладости под индексом " + index);
        }

        return arraySweets[index].toString();
    }

    @Override
    public String[] getInfoSweetAll() {                     // Здесь возвращаю информацию по всем элементам в ввиде массива
        String[] answer = new String[lenght];
        for (int i=0; i<lenght; i++) {
            answer[i] = arraySweets[i].toString();
            System.out.println(answer[i]);                  //Вывожу информацию о каждом элементе в консоль, что бы было удобнее
        }
        return answer;
    }

    @Override
    public String getInfoBox() {
        return ("Вес: " + weightBox + "гр, Цена:" + priceBox + "р, Кол-во: " + lenght + "шт");
    }

    @Override
    public int getSize() {
        return lenght;
    }

    @Override
    public void reduceWeight(double weight) {
        while (weight < weightBox) {
            int iMin = 0;
            for (int i=1; i<lenght; i++) {
                if (arraySweets[i].getWeight() < arraySweets[iMin].getWeight()) {
                    iMin = i;
                }
            }
            delete(iMin);
        }
    }

    @Override
    public void sortByWeight() {                        //Сортировка по весу
        int lastElem = lenght-1;
        while (lastElem > 2) {
            for (int i = 0; i < lastElem; i++) {
                if (arraySweets[i].getWeight() > arraySweets[i + 1].getWeight()) {
                    Sweet tmp = arraySweets[i];
                    arraySweets[i] = arraySweets[i + 1];
                    arraySweets[i + 1] = tmp;
                }
            }
            lastElem--;
        }
    }

    @Override
    public void sortByPrice() {                 //Сортировка по цене
        int firstIndex = 0;
        while (firstIndex < lenght - 1) {
            int minIndex = firstIndex;
            for (int i = firstIndex + 1; i < lenght; i++) {
                if (arraySweets[i].getPrice() < arraySweets[minIndex].getPrice()) {
                    minIndex = i;
                }
            }
            Sweet tmp = arraySweets[minIndex];
            arraySweets[minIndex] = arraySweets[firstIndex];
            arraySweets[firstIndex] = tmp;
            firstIndex++;
        }
    }

    @Override
    public void sortByName() {              //Сортировка по имени
        int firstIndex = 0;
        while (firstIndex < lenght - 1) {
            int minIndex = firstIndex;
            for (int i = firstIndex + 1; i < lenght; i++) {
                if (arraySweets[i].compare(arraySweets[minIndex]) < 0) {
                    minIndex = i;
                }
            }
            Sweet tmp = arraySweets[minIndex];
            arraySweets[minIndex] = arraySweets[firstIndex];
            arraySweets[firstIndex] = tmp;
            firstIndex++;
        }
    }
}
