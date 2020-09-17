package module02.lesson12.lesson;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        X x = new X();
        List<?> list = new ArrayList<String>();
       // list.add("Hello");

        List<Integer> list2 = new ArrayList<>();
        list2.add(13);
        list2.add(14);
        print(list2);

        List<Number> list3 = new ArrayList<>();
        print(list3);

        List<Double> list5 = new ArrayList<>();
        print(list5);

        List<Object> list4 = new ArrayList<>();
        print(list4);
    }

    public static void print(List<?> list) {
        System.out.println(list);
    }
}

class X {}
class Y extends X {}