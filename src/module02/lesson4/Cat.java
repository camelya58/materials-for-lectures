package module02.lesson4;

/**
 * Класс Cat
 *
 * @author Kamila Meshcheryakova
 * created 19.08.2020
 */
public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
