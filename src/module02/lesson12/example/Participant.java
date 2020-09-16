package module02.lesson12.example;

/**
 * Класс Participant
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
public abstract class Participant {

    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
