package lesson9.string;

/**
 * Класс StringBufferClass
 *
 * @author Kamila Meshcheryakova
 * created 02.08.2020
 */
@SuppressWarnings("unused")
public class StringBufferClass {
    public static void main(String[] args) {
        // 6. StringBuffer
        StringBuffer firstBuffer = new StringBuffer(); // capacity = 16
        StringBuffer secondBuffer = new StringBuffer("habrahabr"); // capacity = str.length() + 16
        StringBuffer thirdBuffer = new StringBuffer(secondBuffer); // параметр - любой класс, что реализует CharSequence
        StringBuffer fourthBuffer = new StringBuffer(50); // передаем capacity

        // 6.1. Методы StringBuffer
        /* В большинстве случаев мы используем StringBuffer для многократного выполнения операций
        добавления (append), вставки (insert) и удаления (delete) подстрок.
         */

        // length(): позволяет получить текущую длину объекта
        StringBuffer buffer1 = new StringBuffer("Java");
        System.out.println("Длина: " + buffer1.length()); // 4

        // capacity(): позволяет получить текущий объём выделенной памяти
        System.out.println("Емкость: " + buffer1.capacity()); // 16 + 4 = 20

        // charAt(int index): извлечь значение отдельного символа
        System.out.println(buffer1.charAt(0));

        // setCharAt(int index, char ch): установить новое значение символа, указав индекс символа и его значение
        buffer1.setCharAt(0, 'j');//j
        System.out.println(buffer1);

        /* Добавить подстроку:
        В классе stringBuffer есть десять перегруженных  методов append(), добавляющих подстроку в конец строки.
        append (String str): присоединяет строку str в конец данной строки
         */
        StringBuffer buffer2 = new StringBuffer();
        buffer2.append("Центр ");
        buffer2.append("«Турбо»");
        System.out.println("buffer2 = " + buffer2);// buffer2 = Центр «Турбо»

        /* Вставить подстроку
        insert (int index, string str): вставляет строку str в данную строку перед символом с индексом index
         */
        buffer2.insert(6, "компьютерного обучения ");
        System.out.println("buffer2 = " + buffer2);  // buffer2 = Центр компьютерного обучения «Турбо»

        //еще вариант
        String sb = new StringBuffer("Центр «Турбо»").insert(6, "компьютерного обучения ").toString();
        System.out.println("sb= " + sb); //sb= Центр компьютерного обучения «Турбо»

        /* Удалить подстроку
        delete (int begin, int end): удаляет из строки символы с индекса begin включительно до индекса end-1
         */
        buffer2.delete(6, 29);
        System.out.println("buffer2 = " + buffer2);   //buffer2 = Центр «Турбо»
    }
}
