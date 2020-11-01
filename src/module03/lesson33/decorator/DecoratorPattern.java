package module03.lesson33.decorator;

/**
 * Класс DecoratorPattern
 *
 * @author Kamila Meshcheryakova
 * created 01.11.2020
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car blueUnknownCar = new BlueCarDecorator(new UnknownCar());
        sportCar.draw();
        System.out.println();
        blueUnknownCar.draw();
    }
}

interface Car {
    void draw();
}
class SportCar implements Car {
    public void draw() {
        System.out.println("SportCar");
    }
}
class UnknownCar implements Car {
    public void draw() {
        System.out.println("UnknownCar");
    }
}
abstract class CarDecorator implements Car {
    protected Car decorated;
    public CarDecorator(Car decorated){
        this.decorated = decorated;
    }
    public void draw(){
        decorated.draw();
    }
}
class BlueCarDecorator extends CarDecorator {
    public BlueCarDecorator(Car decorated) {
        super(decorated);
    }
    public void draw() {
        decorated.draw();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: blue");
    }
}
