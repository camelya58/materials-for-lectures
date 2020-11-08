package module03.lesson35;

import java.io.*;

/**
 * Класс IOStreams
 *
 * @author Kamila Meshcheryakova
 * created 08.11.2020
 */
public class OutputStreams {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // 1
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // не надо явно вызывать close()
        String text = "Hello World!";
        // Переводим текст в байты
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Преобразование массива байтов в строку
        System.out.println(baos.toString());

        // 2
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file.txt"));
        bos.write(buffer, 0, buffer.length);
        bos.close();

        // 3
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("file2.txt"));
        // записываем значения
        dos.writeUTF("Джек Воробей");
        dos.writeInt(30);
        dos.writeDouble(20.58);
        dos.writeBoolean(false);
        System.out.println("Запись в файл выполнена");
        dos.close();

        // 4
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream console = new PrintStream(stream);
        console.println("Hello");
    }
}
