package lesson5.ternary;

public class TernaryOperator {
    public static void main(String[] args) {

        int age = 18;
        String securityAnswer = age >= 18 ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";

        System.out.println(securityAnswer);
    }
}
