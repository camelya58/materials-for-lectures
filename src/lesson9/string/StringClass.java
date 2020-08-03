package lesson9.string;

import java.util.Arrays;

/**
 * Класс StringClass описывает создание, преобразование и основные методы String.
 *
 * @author Kamila Meshcheryakova
 * created 02.08.2020
 */
public class StringClass {
    public static void main(String[] args) {
        // 2. Создание
        String string1 = "Java";
        String string2 = new String(); // пустая строка
        String string3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String string4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов

        // 3. Пул строк и метод intern()
        /*
        Когда метод intern() вызван, если пул строк уже содержит строку, эквивалентную к нашему объекту,
        что подтверждается методом equals(Object), тогда возвращается ссылка на строку из пула.
        В противном случае объект строки добавляется в пул и ссылка на этот объект возвращается.
        Этот метод всегда возвращает строку, которая имеет то же значение, что и текущая строка,
        но гарантирует что это будет строка из пула уникальных строк.
         */
        String sA1 = "string a";
        String sB2 = new String("string a");
        String sC3 = sB2.intern();

        System.out.println(sA1 == sB2); //false
        System.out.println(sB2 == sC3); //false
        System.out.println(sA1 == sC3); //true

        // 4. Преобразование
        // Число в строку
        int integerVariable = 10;
        String first = integerVariable + ""; // конкатенация с пустой строкой
        String second = String.valueOf(integerVariable); // вызов статического метода valueOf класса String
        String third = Integer.toString(integerVariable); // вызов метода toString класса-обертки
        String forth = Float.toString(1.0f); // любые другие обертки


        // Строку в число
        String st = "12";
        byte b = Byte.parseByte(st);    //12
        short sh = Short.parseShort(st);  //12
        int i = Integer.parseInt(st);    //12
        long l = Long.parseLong(st); //12
        float fl = Float.parseFloat(st);    //12.0
        double d = Double.parseDouble(st);  //12.0


        // 5. Методы String
        String str = "Hello"; // просто присваиваем значение
        System.out.println(str.length());
        System.out.println("_".repeat(10));

        String str1 = new String(); // создаем пустую строку
        System.out.println(str1.isEmpty());
        System.out.println("_".repeat(10));

        String str2 = new String("London is a capital of Great Britain"); // задаем новый объект
        System.out.println(str2.toUpperCase());
        System.out.println("_".repeat(10));

        int number = 123456;
        String str3 = String.valueOf(number); // преоразовываем число в строку
        System.out.println(str3.charAt(3));
        System.out.println("_".repeat(10));

        char[] chars = str2.toCharArray();
        System.out.println(Arrays.toString(chars));
        String str4 = new String(chars); // задаем строку из массива чаров
        System.out.println(str4);
        System.out.println("_".repeat(10));

        String str5 = new String(chars, 7, 13); // задаем строку из массива чаров, 7 - начальный индекс, 13 - конечный
        System.out.println(str5);
        System.out.println("_".repeat(10));

        int[] numbers = {9, 0, 0, 7, 6, 5, 6, 7};
        String str6 = new String(numbers, 2, 2); // задаем строку из массива интов
        System.out.println(str6);
        System.out.println("_".repeat(10));

        byte[] bytes = str3.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println("_".repeat(10));

        System.out.println("hello".equals("HELLO"));
        System.out.println("Hello" == "Hello");
        System.out.println(str == "Hello");
        String str7 = new String("Hello");
        System.out.println(str == str7);
        System.out.println("hello".equalsIgnoreCase("HELLO"));
        System.out.println("_".repeat(10));

        System.out.println(str.compareTo(str7));
        System.out.println(str.compareTo("hello"));
        System.out.println(str.compareToIgnoreCase("hello"));

        String formatString = "We are printing double variable (%f), string ('%s') and integer variable (%d).";
        System.out.println(String.format(formatString, 2.3, "java", 10));

        System.out.println(String.join(",", str7, str5, str3));

        /* Сравнение строк
        Часто недостаточно знать, что строки просто идентичны. Для приложений, выполняющих сортировку, нужно знать,
         какая из строк меньше, равна или больше следующей.

        Строка меньше другой, если она расположена перед ней в лексикоrpафическом порядке.
        Строка больше другой, если расположена после нее.

        Метод String по имени compareTo()  служит этой цели. Он имеет следующую общую форму:

        int n=  S.compareTo(String str)

        S – первая строка
        Str – строка, с которой выполняется сравнение
                n=0 строки равны
        n<0 строка S меньше str, например,S=”aaa”, а str=”bbb”;
        n>0 строка S больше str, например,S=”bbb”, а str=”aaa”;

         */

        String stA = "aa";
        String stB = "bb";
        int n = stA.compareTo(stB);
        System.out.println("n= " + n);  // -1
    }

}
