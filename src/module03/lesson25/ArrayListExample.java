package module03.lesson25;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс ArrayListExample
 *
 * @author Kamila Meshcheryakova
 * created 25.09.2020
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // constructors
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>(20);

        // methods
        // add(element), add(index, element)
        list1.add("Olga");
        list1.add("Maria");
        list1.add("Ivan");
        System.out.println("list1 = " + list1);

        // size()
        System.out.println("list1.size() = " + list1.size());
        list1.add(1, "Anna");
        System.out.println("list1 = " + list1);

        ArrayList<String> list5 = new ArrayList<>(list1);
        System.out.println("list1.equals(list5): " + list1.equals(list5));
        System.out.println("list1 == list5: " + (list1 == list5));
        System.out.println("list5 = " + list5);

        // get(index)
        System.out.println("list5.get(3) = " + list5.get(3));

        // set(index, element)
        list5.set(2, "Inna");
        System.out.println("list5 = " + list5);

        // addAll(Collection), addAll(index, Collection)
        list2.addAll(list1);
        System.out.println("list2 = " + list2);
        list3.add("Sasha");
        list3.add("Oleg");
        list2.addAll(2, list3);
        System.out.println("list2 = " + list2);

        // indexOf(element)
        list2.add("Sasha");
        System.out.println("list2 = " + list2);
        System.out.println("list2.indexOf(\"Sasha\") = " + list2.indexOf("Sasha"));

        // lastIndexOf(element)
        System.out.println("list2.lastIndexOf(\"Sasha\") = " + list2.lastIndexOf("Sasha"));

        // contains(element)
        System.out.println("list2.contains(\"Ivan\"): " + list2.contains("Ivan"));

        // containsAll(Collection)
        System.out.println("list2.containsAll(list3): " + list2.containsAll(list3));

        // remove(element), remove(index)
        list2.remove("Sasha");
        System.out.println("list2 = " + list2);
        list2.remove(4);
        System.out.println("list2 = " + list2);

        // нельзя!! ConcurrentModificationException
//        for (String s: list2) {
//            list2.remove(s);
//        }
//        System.out.println("list2 = " + list2);

        // некорректно
        for (int i = 0; i < list2.size(); i++) {
            list2.remove(i);
        }
        System.out.println("list2 after remove in for i = " + list2);

        // clear()
        list2.clear();

        // isEmpty()
        System.out.println("list2.isEmpty(): " + list2.isEmpty());
    }
}
