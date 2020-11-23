package module02.lesson12_generics.description;

/**
 * Класс ParameterizedClass2
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
public class ParameterizedClass2 {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 20);
        System.out.println("Value 1 = " + pair1.getFirstValue() + ", value2 = " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(12, 2.0);
        System.out.println("Value 1 = " + pair2.getFirstValue() + ", value2 = " + pair2.getSecondValue());

        // если хотим создать класс с двумя одинаковыми типами, используем class OtherPair
        OtherPair<String> pair3 = new OtherPair<>("Hello", "Dolly");
        System.out.println("Value 1 = " + pair3.getFirstValue() + ", value2 = " + pair3.getSecondValue());
    }
}

// класс с двумя разными типами
class Pair<V1, V2> {

    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

// класс с двумя одинаковыми типами
class OtherPair<V> {

    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
