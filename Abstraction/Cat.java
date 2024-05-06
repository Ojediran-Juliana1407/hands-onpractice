package Abstraction;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("eat cat food");
    }
    public void sound() {
        System.out.println("moewing");
    }
}
