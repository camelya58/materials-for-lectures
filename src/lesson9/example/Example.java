package lesson9.example;

import java.util.Arrays;

/**
 * Класс Example содержит примеры, демонстрированные в Лекции №9.
 *
 * @author Kamila Meshcheryakova
 * created 02.08.2020
 */
public class Example {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";

        System.out.println(str == str2);
        System.out.println(str == str3);

        String str4 = new String(new char[]{'2', 'r', 'u'});
        System.out.println(str4);

        String str5 = new String(new char[]{'2', 'r', 'u', '6', 't'}, 2, 3);
        System.out.println(str5);

        String sA = "Java";
        String sB = new String("Java");
        String sC = sB.intern();

        System.out.println(sA == sB);
        System.out.println(sB == sC);
        System.out.println(sA == sC);

        int a = 6;
        String string = String.valueOf(a);
        System.out.println(string);

        String string2 = Integer.toString(a);
        String string3 = Double.toString(2.0);

        String string4 = "2020";
        int b = Integer.parseInt(string4);
        System.out.println(b + "t");

        String string5 = "Java developer";
        System.out.println(string5.length());
        System.out.println(string5.repeat(5));


        String s = new String("!");
        System.out.println(s.isEmpty());
        System.out.println(s.length());

        System.out.println(string5.charAt(7));

        char[] chars = string5.toCharArray();
        System.out.println(Arrays.toString(chars));

        String string6 = string5.substring(5, 8);
        System.out.println(string6);
        System.out.println(string5);

        String[] strings = string5.repeat(6).split(" ",6);
        System.out.println(Arrays.toString(strings));

        System.out.println(string5.replaceAll("e", "E"));
        System.out.println("hello" + " " + "world!");
        System.out.println("hello".concat(" world!"));

        String string8 = " ghhjghg ";
        System.out.println(string8.trim());

        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuffer stringBuffer1 = new StringBuffer(stringBuffer);

        stringBuffer.append(" ").append("World");
        System.out.println(stringBuffer.toString());

        System.out.println(stringBuffer.insert(stringBuffer.length()," World"));

        System.out.println(stringBuffer.delete(3, 9));

        System.out.println(stringBuffer.reverse());

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("Java"));

        for (int i = 0; i < 10; i++) {
            stringBuilder.append(" java");
        }
        System.out.println(stringBuilder.toString());

        System.out.println(stringBuilder.substring(6));

        String a1 = "Hello";
        String b1 = new String("Hello");
        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));

        String c = a1.toLowerCase();
        System.out.println(c);

        String d = "hello";
        System.out.println(a1.equalsIgnoreCase(d));
        System.out.println(a1.equals(d));

        String f = "Java";
        StringBuilder g = new StringBuilder("java");
        System.out.println(f.compareTo(g.toString()));

    }
}
