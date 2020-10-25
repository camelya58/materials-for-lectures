package module02.lesson12.record;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("bye");

        System.out.println(list);

        for (String o: list) {
            System.out.println(o.length());
        }

        // <T> <E> <K, V>
    }
}
