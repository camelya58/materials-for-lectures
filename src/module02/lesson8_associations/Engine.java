package module02.lesson8_associations;

/**
 * Класс Engine
 *
 * @author Kamila Meshcheryakova
 * created 29.08.2020
 */
class Engine {
    int power;

    public Engine(int p) {
        power = p;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }
}
