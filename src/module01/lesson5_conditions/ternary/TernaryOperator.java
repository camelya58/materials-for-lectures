package module01.lesson5_conditions.ternary;

/**
 * Class TernaryOperator
 *
 * @author Kamila Meshcheryakova
 * created 20.07.2020
 */
public class TernaryOperator {
    public static void main(String[] args) {

        int age = 18;
        String securityAnswer = age >= 18 ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";

        System.out.println(securityAnswer);
    }
}
