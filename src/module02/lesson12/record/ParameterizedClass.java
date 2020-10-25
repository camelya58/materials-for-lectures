package module02.lesson12.record;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1.getValue());

        Info<Integer> info2 = new Info<>(12);
        System.out.println(info2.getValue());

        Info2<Integer, String> info3 = new Info2<>(20, "Anna");
        System.out.println(info3.getFirstvalue());
        System.out.println(info3.getSecondValue());

        Info2<Double, Integer> info4 = new Info2<>(3.14, 20);
        System.out.println(info4.getFirstvalue());
        System.out.println(info4.getSecondValue());
    }
}

class Info<T> {

    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}

class Info2<V1, V2> {

    private V1 value1;
    private  V2 value2;

    public Info2(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstvalue() {
        return value1;
    }

    public V2 getSecondValue() {
        return  value2;
    }

    @Override
    public String toString() {
        return "Info2{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}

class Info3<V> {

    private V value1;
    private V value2;

    public Info3(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
