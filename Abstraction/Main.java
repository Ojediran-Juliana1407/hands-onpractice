package Abstraction;

public class Main {
    public static void main(String[]args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        dog.sound();

        cat.eat();
        cat.sound();
    }
}
