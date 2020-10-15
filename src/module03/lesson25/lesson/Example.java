package module03.lesson25.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        List<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList(10);

        list3.add("Hello");
        list3.add("Hi");
        list3.add("Bye");
        System.out.println("size = " + list3.size());
        System.out.println(list3);
        list3.add(1, "Yes");
        System.out.println(list3);

        System.out.println(list3.get(2));
        list3.set(2, "No");
        System.out.println(list3.get(2));

        System.out.println(list3.indexOf("Yes"));
        list3.add("Yes");
        System.out.println(list3.lastIndexOf("Yes"));
        System.out.println(list3.contains("No"));

        ArrayList<String> list4 = new ArrayList(list3);
        System.out.println(list4.containsAll(list3));

        list3.remove("Yes");
        System.out.println(list3);
        for (int i = 0; i < list3.size(); i++) {
            list3.remove(i);
        }
        System.out.println(list3);

//        for (String s: list4) {
//            list4.remove(s);
//        }
        System.out.println(list4);
        list3.clear();
        System.out.println(list3);


        String[] array = {"Olga", "Inna", "Anna"};

        List<String> list1 = Arrays.asList(array);
        list1.set(1, "Oleg");
        System.out.println(list1);

        List<String> list5 = List.of("Ivan", "Igor", "Dima");
      //  list5.add("Artem");
        System.out.println(list5);

        List<String> list6 = List.copyOf(list5);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("dog");
        arrayList.add("cat");
        arrayList.add("horse");
        arrayList.add("mouse");
        arrayList.add("rat");

        List<String> list7 = arrayList.subList(1, 3);
        list7.add("hamster");
        System.out.println(list7);
        System.out.println(arrayList);

        Object[] array1 = arrayList.toArray();
        System.out.println(Arrays.toString(array1));

        String[] arrayString = arrayList.toArray(array);
        System.out.println(Arrays.toString(arrayString));

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);

    }
}
