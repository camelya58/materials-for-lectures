package module02.lesson12.description;

import java.util.ArrayList;

/**
 * Класс TypeErasure
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
public class TypeErasure {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        // ArrayList al1 = new ArrayList(); - JVM видит это как хранение Object, т.к. generics появились в 5 версии

        int i = al1.get(0);
        // int i = (Integer) al1.get(0); - приведение к нужному типу для совместимости кода
    }

    // нельзя таким образом перегрузить методы из-за стирания типов
    public void abc(Info<String> info) { // для JVM это Info<Object> info
        String s = info.getValue();
    }

//    public void abc(Info<Integer> info) { // для JVM это Info<Object> info
//        Integer i = info.getValue();
//    }
}

class Parent {

    public void abc(Info<String> info) { // для JVM это Info<Object> info
        String s = info.getValue();
    }
}

class Child extends Parent {

 // также нельзя переопределить таким образом метод
 // хоть и происходит стирание типов, в дальнейшем может последовать приведение типов, которое выполнится некорректно
//    @Override
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}
