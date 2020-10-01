package module03.lesson25;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Класс IteratorExample
 *
 * @author Kamila Meshcheryakova
 * created 26.09.2020
 */
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(5);
        al.add("Cat");
        al.add("Dog");
        al.add("Humster");
        al.add("Horse");
        al.add("Mouse");

        Iterator<String> iterator =  al.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Iterator<String> iterator2 =  al.iterator();
        while(iterator2.hasNext()) {
            // можно удалить элементы выборочно
            if (iterator2.next().contains("o")) {
                iterator2.remove();
            }
        }
        System.out.println(al);

        Iterator<String> iterator3 =  al.iterator();
        while(iterator3.hasNext()) {
            // можно удалить все элементы
            iterator3.next();
            iterator3.remove();
        }
        System.out.println(al);


    }
}
