package module02.lesson12.description;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс WildcardExample
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
@SuppressWarnings("unused")
public class WildcardExample {

    public static void main(String[] args) {
        X x = new Y();
        // List<X> list = new ArrayList<Y>();
        // нельзя так писать, поскольку в совокупности первое не является родителем второго
        // хоть по отдельности это так и есть
        List<?> list = new ArrayList<String>(); // так можно писать, поскольку <?> означает любой тип
        // list.add("Hi"); так нельзя, тип листа не известен JVM

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Bye");
        list2.add("Ok");
        showListInfo(list2);

        // bounded wildcard
        List<? extends Number> list4 = new ArrayList<Integer>(); // так писать можно, но неизвестно, какие элементы добавлять
        // list4.add(3);

        ArrayList<Double> al = new ArrayList<>();
        al.add(3.14);
        al.add(3.15);
        al.add(3.16);
        System.out.println(sum(al));

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(14);
        al2.add(15);
        al2.add(16);
        System.out.println(sum(al2));

        // System.out.println(sum(list2)); List<String> list2  не подходит под параметры метода

        List<? super Integer> list5 = new ArrayList<Object>();
        list5.add(2);
        list5.add(3);
        list5.add(10);
       //list5.add(new Object()); нельзя, только Integer
        print(list5);

        List<Number> list6 = new ArrayList<>();
        list6.add(3.14);
        list6.add(3.15);
        list6.add(3.16);
        print(list6);

    }

    static void showListInfo(List<?> list) {
        System.out.println("Elements of list: " + list);
    }

    public static double sum(List<? extends Number> al) {
        double sum = 0;
        for (Number n: al ) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void print(List<? super Integer> al) {
        System.out.println("All elements: " + al);
    }
}

class X {}

class Y extends X {}