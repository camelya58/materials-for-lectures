package module02.lesson12_generics.lesson;

public class Info2<V> {

    private V value;
    private V value2;

    public Info2(V value, V value2) {
        this.value = value;
        this.value2 = value2;
    }

    public V getValue() {
        return value;
    }

    public V getValue2() {
        return value2;
    }

}
