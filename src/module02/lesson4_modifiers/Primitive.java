package module02.lesson4_modifiers;

/**
 * Класс Primitive
 *
 * @author Kamila Meshcheryakova
 * created 19.08.2020
 */
public class Primitive {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("1)");
        System.out.println(x);
        System.out.println("__________");
        doStuff(x);
        System.out.println("3)");
        System.out.println(x);
        System.out.println("__________");

    }

    private static void doStuff(int x) {
        System.out.println("2)");
        x++;
        System.out.println(x);
        System.out.println("__________");
    }
}
