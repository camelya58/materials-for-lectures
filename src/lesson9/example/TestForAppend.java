package lesson9.example;

/**
 * Класс TestForAppend
 *
 * @author Kamila Meshcheryakova
 * created 02.08.2020
 */
public class TestForAppend {
    public static void main(String[] args) {
        try {
            test(new StringBuffer("")); // StringBuffer: 35117ms.
            test(new StringBuilder("")); // StringBuilder: 3358ms.
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
    }
    private static void test(Appendable obj) throws java.io.IOException {
        // узнаем текущее время до теста
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1e9; i++) {
            obj.append("");
        }
        // узнаем текущее время после теста
        long after = System.currentTimeMillis();
        // выводим результат
        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }
}
