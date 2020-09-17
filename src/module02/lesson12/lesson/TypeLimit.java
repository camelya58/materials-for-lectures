package module02.lesson12.lesson;

public class TypeLimit {
    public static void main(String[] args) {
        Info3<Integer> info = new Info3<>(13);
        Info3<Number> info2 = new Info3<>(1.0);
       // Info3<String> info3 = new Info3<String>("Hello");
    }
}

class Info3<T extends Number> {
    private T value;

    public Info3(T value) {
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
