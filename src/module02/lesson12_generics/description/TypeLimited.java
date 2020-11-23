package module02.lesson12_generics.description;

import java.util.ArrayList;

/**
 * Класс TypeLimited
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
@SuppressWarnings("unused")
public class TypeLimited {

    public static void main(String[] args) {
        Info2<Number> info = new Info2<>(3.14);
        System.out.println(info);

        Info2<Double> info2 = new Info2<>(3.14);
        System.out.println(info2);

        Info2<Integer> info3 = new Info2<>(14);
        System.out.println(info3);
    }

    public static <T extends Number> T getThirdElement(ArrayList<T> al) { // ArrayList<T extends Number> нельзя писать
        return al.get(1);
    }
}
// можно сделать ограничение для типа, Number и его subclass
@SuppressWarnings("unused")
class Info2<T extends Number> { // <T extends Number & I1 & I2> можно так писать

    private final T value;

    public Info2(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
@SuppressWarnings("unused")
interface I1 {}

@SuppressWarnings("unused")
interface I2 {}