package Constructor;

public class Main {
    public static void main(String[]args) {
        Student student1 = new Student();
        Student student2 = new Student("Adam Julie",22);

        student1.displayInfo();
        student2.displayInfo();
    }
}
