package module04.lesson;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
//
        try (BufferedReader reader1 = new BufferedReader(new FileReader("file.txt"));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("file2.txt"))) {
            String title;
            while (reader1.ready()) {
                title = reader1.readLine();
                writer1.write(title);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        BufferedReader reader1 = null;
//        BufferedWriter writer1 = null;
//        try {
//            reader1 = new BufferedReader(new FileReader("file.txt"));
//            writer1 = new BufferedWriter(new FileWriter("file2.txt"));
//            String title;
//            while (reader1.ready()) {
//                title = reader1.readLine();
//                writer1.write(title);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            reader1.close();
//            writer1.close();
//        }

        InputStream inputStream;
        OutputStream outputStream;

        Reader reader;
        Writer writer;

        String text = "To be or not to be...";

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(text.getBytes());
        //byte[] bytes = byteArrayInputStream.readAllBytes();
        for (byte b: byteArrayInputStream.readAllBytes()) {
            System.out.print((char) b);
        }
        System.out.println();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes1 = text.getBytes();
       // baos.write(bytes1);
        System.out.println(baos.toString());

        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("file2.txt"));
        // записываем значения
        dos.writeUTF("Джек Воробей");
        dos.writeInt(30);
        dos.writeDouble(20.58);
        dos.writeBoolean(false);
        System.out.println("Запись в файл выполнена");
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("file2.txt"));
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println("Чтение из файла завершено");
        dis.close();
    }
}
