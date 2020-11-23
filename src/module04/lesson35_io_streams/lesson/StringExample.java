package module04.lesson35_io_streams.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringExample {
    public static void main(String[] args) throws IOException {
        String text = "To be or not to be";

        StringReader reader = new StringReader(text);
        StringWriter writer = new StringWriter();

        BufferedReader br = new BufferedReader(reader);

        String line;
        while ((line = br.readLine()) != null) {
            writer.write(line);
        }

        String result = writer.toString();
        System.out.println(result);
    }
}
