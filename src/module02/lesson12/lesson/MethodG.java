package module02.lesson12.lesson;

import java.util.ArrayList;

public class MethodG {

    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
