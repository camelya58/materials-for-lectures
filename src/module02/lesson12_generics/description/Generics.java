package module02.lesson12_generics.description;

import module02.lesson4_modifiers.Cat;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Generics
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
public class Generics {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("String");
        list.add(new Cat("Tom"));

        for (Object o: list) {
            System.out.println(o + " length: " + ((String)o).length());
            // get ClassCastException
        }

        List<String> list2 = new ArrayList<>();
       // list2.add(1); - not allowed
    }
}
