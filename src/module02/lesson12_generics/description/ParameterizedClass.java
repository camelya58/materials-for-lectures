package module02.lesson12_generics.description;

/**
 * Класс ParameterizedClass
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
public class ParameterizedClass {

    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        int i = info2.getValue();
    }
}

class Info<T> {

    private T value; // не может быть static, поскольку объекты этого класса могут быть разного типа,
    // а значит у них не должно быть общих переменных

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
