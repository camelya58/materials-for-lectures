package module02.lesson12_generics.record;

public class TypeLimited {
    public static void main(String[] args) {
        Info4<Number> info4 = new Info4<>(3);
        Info4<Double> info5 = new Info4<>(3.14);
        Info4<Integer> info6 = new Info4<>(23);
       // <?> <? extends Number> <? super Number>
    }
}

class Info4<T extends Number> {

    private final T value;

    public Info4(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info4{" +
                "value=" + value +
                '}';
    }
}
