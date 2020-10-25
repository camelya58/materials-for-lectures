package module02.lesson12.record;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        X x = new Y();
        List<X> list = new ArrayList<>();
        List<?> list1 = new ArrayList<String>();
       // list1.add("Hello");

        List<String> list2 = new ArrayList<>();
        list2.add("Anna");
        list2.add("Ivan");
        list2.add("Olga");
        showListInfo(list2);

        List<Integer> list3 = List.of(1, 34, 50);
        showListInfo(list3);
        System.out.println(sum(list3));
        print(list3);


    }

    static void showListInfo(List<?> list) {
        System.out.println("elements of list = " + list);
    }

    static double sum(List<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }

    static void print(List<? super Integer> al) {
        System.out.println("all elements = " + al);
    }
}

class X {}
class Y extends X {}
