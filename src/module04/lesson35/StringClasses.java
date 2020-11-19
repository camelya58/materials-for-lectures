package module04.lesson35;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Класс StringClasses
 *
 * @author Kamila Meshcheryakova
 * created 08.11.2020
 */
public class StringClasses {
    public static void main(String[] args) throws Exception {
        String test = "Hi!\n My name is Richard\n I'm a photographer\n";

        //это строчка – ключевая: мы «превратили» строку в Reader
        StringReader reader = new StringReader(test);
        StringWriter writer = new StringWriter();

        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            writer.write(line);
        }

        //получаем текст, который был записан во Writer
        String result = writer.toString();

        //выводим полученный из Writer’а текст на экран
        System.out.println("Результат: " + result);
    }
}
