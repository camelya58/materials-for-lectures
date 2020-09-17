package module02.lesson12.lesson;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList list = new ArrayList();
        list.add(2);
        int i = list.get(0);
        // int i = (Integer) list.get(0);

    }
   // public void abc(Info<Integer> info) {}
    public void abc(Info<String> info) {}

}

class Parent {
    public void abc(Info<Integer> info) {}
}

class Child extends Parent {

  //  public void abc(Info<String> info) {}
}
