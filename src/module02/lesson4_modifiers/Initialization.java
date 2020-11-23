package module02.lesson4_modifiers;

/**
 * Класс Initialization
 *
 * @author Kamila Meshcheryakova
 * created 19.08.2020
 */
public class Initialization {

    private static int a = print(5);
    private int b = print(4);

    Initialization() {
        System.out.println("Конструктор");
    }

    {
        System.out.println("3");
    }

    public static void main(String[] args) {
        System.out.println("2");
        new Initialization();
        new Initialization();
    }

    static {
        System.out.println("1");
    }

    public static int print(int number) {
        System.out.println(number);
        return number;
    }

}
