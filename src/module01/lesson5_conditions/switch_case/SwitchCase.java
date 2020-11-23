package module01.lesson5_conditions.switch_case;

import java.util.Scanner;

/**
 * Class SwitchCase
 *
 * @author Kamila Meshcheryakova
 * created 20.07.2020
 */
public class SwitchCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.nextLine().charAt(0);

        switch(grade)
        {
            case 'A' :
                System.out.println("Отлично!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Отлично выполнено");
                break;
            case 'D' :
                System.out.println("Вы прошли");
            case 'F' :
                System.out.println("Лучше попробуйте снова");
                break;
            default :
                System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка " + grade);
    }
}

