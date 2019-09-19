import SweetClass.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    //Коробка со сладостями
    private static SimpleBoxSweet box;

    //Сладости, поместил их сюда что бы можно было присвоить им значения в отдельном методе
    private static Candy candyKey;
    private static Candy candyCow;
    private static Jellybean jellybeanSkittles;
    private static Jellybean jellybeanApple;
    private static Marshmallow marshmallowBelev;
    private static Marshmallow marshmallowBelevVanil;
    private static Lollipop lollipop;
    private static Chocolate chocolateMilka;
    private static Chocolate chocolateAlpen;

    public static void main(String[] args) {
        System.out.println("Создали коробку со сладостями:");
        initialSweet();
        initialBox();
        box.getInfoSweetAll();
        System.out.println(box.getInfoBox());
        System.out.println("   ---   ");

        System.out.println("Отсортировали коробку по названию:");
        box.sortByName();
        box.getInfoSweetAll();
        System.out.println(box.getInfoBox());
        System.out.println("   ---   ");

        System.out.println("Отсортировали коробку по цене: ");
        box.sortByPrice();
        box.getInfoSweetAll();
        System.out.println(box.getInfoBox());
        System.out.println("   ---   ");

        System.out.println("Отсортировали коробку по весу:");
        box.sortByWeight();
        box.getInfoSweetAll();
        System.out.println(box.getInfoBox());
        System.out.println("   ---   ");

        System.out.println("Сделали оптимизацию товара, уменьшили вес до 2500 гр: ");
        box.reduceWeight(2500);
        box.getInfoSweetAll();
        System.out.println(box.getInfoBox());

    }

    public static void initialSweet() {             //Создаем сладости и заполняем по ним информацию
        candyKey = new Candy("Золотой ключик");
        candyKey.setWeight(400);
        candyKey.setPrice(120);
        candyKey.setFiling("Ирис");

        candyCow = new Candy("Коровка", 200, 75.5);

        jellybeanSkittles = new Jellybean("Скитлс", 250, 150);
        jellybeanSkittles.setTaste("Разный");

        jellybeanApple = new Jellybean("Яблочные", 400, 134);
        jellybeanApple.setTaste("Яблочный");

        marshmallowBelev= new Marshmallow("Белевский", 500, 160);

        marshmallowBelevVanil= new Marshmallow("Белевский Ваниль", 500, 175);
        marshmallowBelevVanil.setColor("Желтый");

        lollipop = new Lollipop("Чупа-чупс", 140, 60);

        chocolateMilka = new Chocolate("Милка", 240, 67);
        chocolateAlpen = new Chocolate("Альпенгольд", 240, 75);
        chocolateAlpen.setPercetageCocoa(66);
    }

    public static void initialBox() {           //Создаем и заполняем коробку
        box = new SimpleBoxSweet();

        box.add(candyKey);
        box.add(candyCow);
        box.add(jellybeanSkittles);
        box.add(jellybeanApple);
        box.add(marshmallowBelev);
        box.add(marshmallowBelevVanil);
        box.add(lollipop);
        box.add(chocolateMilka);
        box.add(chocolateAlpen);

    }
}
