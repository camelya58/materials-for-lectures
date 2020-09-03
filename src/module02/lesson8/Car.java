package module02.lesson8;

/**
 * Класс Car
 *
 * @author Kamila Meshcheryakova
 * created 29.08.2020
 */
public class Car {

    String model;
    Engine engine;
    Passenger passenger;

    public Car(String model) {
        this.model = model;
        engine = new Engine(360);
    }

    public Car(String model, Passenger passenger) {
        this.model = model;
        engine = new Engine(360);
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", passenger=" + passenger +
                '}';
    }
}
