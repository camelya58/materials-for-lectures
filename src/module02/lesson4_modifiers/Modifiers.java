package module02.lesson4_modifiers;

/**
 * Класс Modifiers
 *
 * @author Kamila Meshcheryakova
 * created 19.08.2020
 */
public class Modifiers {

    private String name;
    String description;
    protected String characteristic;
    public int variety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int count;

    // если хотим сделать наш класс неизменяемым как String или метод непереопределяемым, то используем final

    public static final String TYPE = "protected";

    public static final String KIND;

    static {
        KIND = "private";
    }

    static void staticPrint(String str) {
        System.out.println(str);
        count++;
        System.out.println(count);
        // System.out.println(variety);
        // this.name = str;
    }

    void nonStaticPrint(String str) {
        System.out.println(str);
        count++;
        System.out.println(count);
        System.out.println(variety);
        this.name = str;
    }

    public static void main(String[] args) {
        staticPrint(Modifiers.KIND);
        new Modifiers().nonStaticPrint(Modifiers.TYPE);
        print("Angel");
    }
    // переменные экземпляра
    String variable;
    // переменная класса
    static String common;

    // параметр
    static void print(String str) {
        // локальная переменная
        String str2 = "Hello, " + str;
        System.out.println(str2);
        int r;
        // System.out.println(r);
    }
    
}
