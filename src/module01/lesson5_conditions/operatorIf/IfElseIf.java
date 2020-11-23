package module01.lesson5_conditions.operatorIf;

/**
 * Class IfElseIf
 *
 * @author Kamila Meshcheryakova
 * created 20.07.2020
 */
public class IfElseIf {
    public static void main(String[] args) {

        int x = 10;

        // Case 1: if - else if - else

        if (x == 10) {
            System.out.println("Значение X = 10");
        } else if (x <= 20) {
            System.out.println("Значение X = 20");
        } else if (x <= 30) {
            System.out.println("Значение X = 30");
        } else {
            System.out.println("Это оператор else");
        }
        System.out.println("____________________");

        // Case 2: if - if - else

        if (x == 10) {
            System.out.println("Значение X = 10");
        }
        if (x <= 20) {
            System.out.println("Значение X < 20");
        }
        if (x <= 30) {
            System.out.println("Значение X < 30");
        } else {
            System.out.println("Это оператор else");
        }
        System.out.println("____________________");
    }
}
