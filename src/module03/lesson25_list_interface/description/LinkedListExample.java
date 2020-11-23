package module03.lesson25_list_interface.description;

import java.util.LinkedList;

/**
 * Класс LinkedListExample
 *
 * @author Kamila Meshcheryakova
 * created 26.09.2020
 */
public class LinkedListExample {
    public static void main(String[] args) {
        Student st1 = new Student("Olga", 20);
        Student st2 = new Student("Anna", 21);
        Student st3 = new Student("Ivan", 23);
        Student st4 = new Student("Inna", 19);
        Student st5 = new Student("Oleg", 22);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("studentLinkedList = " + studentLinkedList);
        System.out.println("studentLinkedList.get(4) = " + studentLinkedList.get(4));
        System.out.println("studentLinkedList.indexOf(st3) = " + studentLinkedList.indexOf(st3));

        Student st6 = new Student("Katya", 22);
        studentLinkedList.add(3, st6);
        System.out.println("studentLinkedList = " + studentLinkedList);
        studentLinkedList.remove(st6);
        System.out.println("studentLinkedList = " + studentLinkedList);
        System.out.println("studentLinkedList.getFirst() = " + studentLinkedList.getFirst());
        System.out.println("studentLinkedList.getLast() = " + studentLinkedList.getLast());

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
        return "Student[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
