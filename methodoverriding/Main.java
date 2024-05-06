package methodoverriding;

public class Main {
    public static void main(String[]args) {
        Car car = new Car();

        car.drive();

        car.drive(50);
        car.drive("London");
        car.drive(45,"Paris");

    }
}
