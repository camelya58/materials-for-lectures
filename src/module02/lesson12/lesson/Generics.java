package module02.lesson12.lesson;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Hello");
        lists.add("World");


        List<Integer> lists2 = new ArrayList<>();
        lists2.add(13);

        List list3 = new ArrayList();
        list3.add("Hello");
        list3.add(13);
        list3.add(new Object());

        list3.get(0);
        for (Object o: list3) {
            System.out.println(((String)o).length());
        }


    }
}
