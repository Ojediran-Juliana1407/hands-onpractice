package Constructor;

public class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "not known";
        this.age = 18;
    }
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: "+name + ", Age: " + age);
    }
}
