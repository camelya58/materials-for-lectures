package module02.lesson4;

/**
 * Класс Reference
 *
 * @author Kamila Meshcheryakova
 * created 19.08.2020
 */
public class Reference {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        System.out.println("1)");
        System.out.println(cat);
        System.out.println("__________");
        doStuff(cat);
        System.out.println("3)");
        System.out.println(cat);
        System.out.println("__________");
    }

    private static void doStuff(Cat cat) {
        System.out.println("2)");
        cat.name = "Leopold";
        System.out.println(cat);
        System.out.println("__________");
        cat = new Cat("Garfild");
        System.out.println(cat);
        System.out.println("__________");

    }
}
