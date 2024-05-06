package Class;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Starting the car");
    }

    public void stop() {
        System.out.println("stopping the car");
    }
}
