package module02.lesson12_generics.description;

import java.util.ArrayList;

/**
 * Класс ParameterizedMethod
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        int a = GenericsMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Hello");
        al2.add("Ok");
        String s = GenericsMethod.getSecondElement(al2);
        System.out.println(s);
    }
}

class GenericsMethod {

    // T - возвращаемый тип, <T> - использование дженериков
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
