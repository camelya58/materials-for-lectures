package module03.lesson25_list_interface.description;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс ArrayListMethodsConnected
 *
 * @author Kamila Meshcheryakova
 * created 25.09.2020
 */
public class ArrayListMethodsConnected {
    public static void main(String[] args) {
        String[] array = {"Olga", "Inna", "Dasha", "Masha"};

        // Arrays.asList(T[] array)
        List<String> list = Arrays.asList(array);
        System.out.println("list = " + list);
        // нельзя!!! UnsupportedOperationException
     //   list.add("Sasha");
        // лист хоть и является листом, но ссылается и полностью зависит от массива, поэтому не является динамичным.
        list.set(1, "Anna");
        System.out.println("list = " + list);
        System.out.println("array = " + Arrays.toString(array)); // поэтому изменения в листе отражаются на массиве

        // List.of(E... elements)
        List<String> list2 = List.of("Ivan", "Igor", "Andrey", "Oleg"); // лист создается неизменяемым - unmodifiable
        // нельзя!!! UnsupportedOperationException
       // list2.add("Anton");
        System.out.println("list2 = " + list2);

        // List.copyOf(Collection)
        List<String> list3 = List.copyOf(list); // лист создается неизменяемым - unmodifiable
        // нельзя!!! UnsupportedOperationException
        //list3.add("Elena");
        System.out.println("list3 = " + list3);

        // subList(fromIndex, toIndex)
        ArrayList<String> al = new ArrayList<>(5);
        al.add("Cat");
        al.add("Dog");
        al.add("Humster");
        al.add("Horse");
        al.add("Mouse");
        System.out.println("al = " + al);
        List<String> list4 = al.subList(2,4); // ссылаются на 1 объект - список
        System.out.println("list4 = " + list4);
        list4.add("Rabit"); // можно, не является неизменяемым
        System.out.println("list4 = " + list4);
        System.out.println("al = " + al);

        // removeAll(Collection)
//        list4.removeAll(al);
//        System.out.println("list4 after removeAll(al) = " + list4);
//        System.out.println("al = " + al);

        // retainAll(Collection)
        list4.retainAll(al);
        System.out.println("list4 after retainAll(al) = " + list4);
        System.out.println("al = " + al);

        ArrayList<String> al2 = new ArrayList<>(3);
        al2.add("Humster");
        al2.add("Horse");
        al2.add("Mouse");
        list4. retainAll(al2);
        System.out.println("list4 after retainAll(al2) = " + list4);

        // toArray()
        Object[] array2 = al2.toArray();
        System.out.println("array2 = " + Arrays.toString(array2));

        // toArray(T[] array)
        String[] array3 = al2.toArray(array); // создает массив типа array, но заполняет элементами al2
        System.out.println("array3 = " + Arrays.toString(array3));
    }
}
