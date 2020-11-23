package module02.lesson8_associations;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс Regex
 *
 * @author Kamila Meshcheryakova
 * created 30.08.2020
 */
public class Regex {
    public static void main(String[] args) {
        // если мы хотим задать шаблон написания e-mail
        // \\b - граница слова. \\ba - в начале, a\\b - в конце
        // [A-Za-z] - отбор букв латинского алфавита без учета регистра
        // [0-9] - отбор цифр, [^0-9] - все, кроме цифр
        // {n} - встречается n раз, {n,} - встречается n раз и более
        // {n,m} - встречается не менее n раз, но не более m раз
        // ^ - начало текста ^a
        // $ - конец текста a$

        //String email = "myName+89%@myDomen63-like.com";
        String email = "2323@456356%%^-890.ghjgjg";
        boolean result = email.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        System.out.println(result);
        System.out.println("_____________________________");

        // если мы хотим сделать из строчки массив строк, поделив по определенному условию
        // \\W - все символы, кроме букв, цифр и знака подчеркивания
        // \\w - все символы, состоящие из букв, цифр и знака подчеркивания
        // + если встречаются один и более раз
        // * если встречаются ноль и более раз
        // ? если встречаются один раз или отсутствует
        String text = "cat, catch; world! concatenate: snow) cats/ dark @ white[ scattered% concat";
        String[] strings = text.split("\\W+");
        System.out.println(Arrays.toString(strings));
        System.out.println("_____________________________");

        // если мы хотим убрать из строки все знаки пунктуации
        // \\p{Punct} - любой знак пунктуации
        // \\p{Letter} - любые буквы любого языка
        // \\p{Number} - любые виды цифр любого языка
        // \\p{Symbol} - математические символы, символы валют
        String text2 = text.replaceAll("\\p{Punct}", "");
        System.out.println(text2);

        // \\b - граница слова. \\ba - в начале, a\\b - в конце
        Pattern pattern = Pattern.compile("\\bcat\\b"); // cat\\b  \\bcat
        Matcher match = pattern.matcher(text2);
        int matchCounter = 0;
        while (match.find()) {
            matchCounter++;}
        System.out.println(matchCounter);
        System.out.println("_____________________________");

        // \\B - не граница слова
        Pattern pattern2 = Pattern.compile("\\Bcat\\B");
        Matcher match2 = pattern2.matcher(text2);
        int matchCounter2 = 0;
        while (match2.find()) {
            matchCounter2++;}
        System.out.println(matchCounter2);
        System.out.println("_____________________________");

        // \\d - цифровой символ
        // \\D - нецифровой символ
        // \\s - символ пробела
        // \\S - непробельный символ

        // проверить, является ли введенное номером телефона
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number:");
        String s = sc.nextLine();
        if (s.matches("^\\+?[78][-(]?\\d{3}\\)?-?\\d{3}-?\\d{2}-?\\d{2}$")) {
            System.out.println("It's a telephone number: " + s);
        }

        // регулярка для проверки пароля на 8 символов из букв и цифр
        // как минимум с одной цифров, одной строчной и одной заглавной буквой

        String password = "Passw0rd";
        if (password.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])[A-Za-z\\d]{8}$")) {
            System.out.println(String.format("It's a password -  %s, %d", password, matchCounter2));
        }

    }

}
