package Class;

public class Main {
    public static void main(String[]args) {
        Car car1 = new Car("benz","SUV",2010);
        Car car2 = new Car("Toyota","camry",2020);

        car1.start();
        car2.stop();
    }
}
