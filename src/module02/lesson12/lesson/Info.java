package module02.lesson12.lesson;

import java.util.ArrayList;

public class Info<T> {

    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[{ " + value + "}]";
    }

    public T getValue() {
        return value;
    }
}

class ParamClass {
    public static void main(String[] args) {
        Info<String> info = new Info<>("hello");
        System.out.println(info.getValue());

        Info<Integer> info1 = new Info<>(30);
        System.out.println(info1.getValue());

        Info2<String> info2 = new Info2<>("Hi", "Hello");

        ArrayList<String> list = new ArrayList<>();
        list.add("Bye");
        list.add("Hi");
        String s = MethodG.getSecondElement(list);
        System.out.println(s);



    }
}
