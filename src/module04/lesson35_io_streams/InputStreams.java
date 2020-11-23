package module04.lesson35_io_streams;

import java.io.*;

/**
 * Класс InputStreams
 *
 * @author Kamila Meshcheryakova
 * created 08.11.2020
 */
public class InputStreams {
    public static void main(String[] args) throws IOException {
        // 1
        String text = "Welcome!";
        ByteArrayInputStream bais = new ByteArrayInputStream(text.getBytes());
        byte[] bytes = bais.readAllBytes();
        for (byte b : bytes) {
            System.out.print((char) b);
        }
        System.out.println();
        // 2
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"));
        while (bis.available() > 0) {
            System.out.print((char) bis.read());
        }
        System.out.println();
        bis.close();

        // 3
        DataInputStream dis = new DataInputStream(new FileInputStream("file2.txt"));
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println("Чтение из файла завершено");
        dis.close();
    }
}
