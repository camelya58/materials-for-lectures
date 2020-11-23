package module01.lesson5_conditions.operatorIf;

/**
 * Class NestedIf
 *
 * @author Kamila Meshcheryakova
 * created 20.07.2020
 */
public class NestedIf {
    public static void main(String[] args) {

        // Case 3: nested if - else
        int x1 = 30;
        int y = 10;

        if (x1 == 30) {
            if (y == 10) {
                System.out.println("X1 = 30, Y = 10");
            } else {
                System.out.println("X1 = 30, Y != 10");
            }
        } else {
            System.out.println("X1 != 30");
        }
    }
}
