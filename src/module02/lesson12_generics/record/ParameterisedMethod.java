package module02.lesson12_generics.record;

import java.util.ArrayList;

public class ParameterisedMethod {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Olga");
        arrayList.add("Ivan");
        arrayList.add("Inna");
        System.out.println(GenericMethod.getSecondValue(arrayList));
    }
}

class GenericMethod {

    public static <T> T getSecondValue(ArrayList<T> al) {
       return al.get(1);
    }
}
