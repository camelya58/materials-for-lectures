package module03.lesson25_list_interface.lesson;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExampleLinkedList {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Student st1 = new Student("Inna", 20);
        Student st2 = new Student("Olga", 22);
        Student st3 = new Student("Ivan", 20);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        System.out.println(students.indexOf(st3));
        System.out.println(students.get(2));

        ListIterator<Student> listIterator = students.listIterator();

        String s = "tenet";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> listIterator1 = list.listIterator();
        ListIterator<Character> listIterator2 = list.listIterator(list.size());
        boolean isPalindrome = true;
        while(listIterator1.hasNext() && listIterator2.hasPrevious()) {
            if (!listIterator1.next().equals(listIterator2.previous())) {
                isPalindrome = false;
                break;
            }
         }
        if (isPalindrome) {
            System.out.printf("It's a palindrome - %s", s);
        }


    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
