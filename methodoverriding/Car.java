package methodoverriding;

public class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
    public void drive(int speed) {
        System.out.println("driving a car at " + speed + "km/h");
    }
    public void drive(String destination) {
        System.out.println("driving a car to " + destination + " ");
    }
    public void drive (int speed,String destination) {
        System.out.println("Driving a car at " + speed + "km/h to " + destination + " ");
    }
}
