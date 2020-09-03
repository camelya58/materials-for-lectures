package module02.lesson8;

/**
 * Класс Aggregation
 *
 * @author Kamila Meshcheryakova
 * created 29.08.2020
 */
public class AggregationComposition {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Oleg");
        Car car = new Car("BMW");
        System.out.println(car);

        Car car1 = new Car("Solaris", passenger);
        System.out.println(car1);

        car.setPassenger(passenger);
        System.out.println(car);

        // car1.setEngine(car.getEngine());
    }
}