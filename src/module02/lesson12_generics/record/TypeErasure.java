package module02.lesson12_generics.record;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        String s = (String) list.get(0);


    }

    public void abc(Info<String> info) {
        String s =  info.getValue();
    }

//    public void abc(Info<Integer> info) {
//
//    }
}

class Parent {

    public void abc(Info<String> info) {
        String s =  info.getValue();
    }
}

class Child extends Parent {

//    public void abc(Info<Integer> info) {
//
//    }
}