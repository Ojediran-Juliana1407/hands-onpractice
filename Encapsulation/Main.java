package Encapsulation;

public class Main {
    public static void main(String[]args) {
        Employee employee = new Employee("Adams Juliana",5,4000.00);

        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: " + employee.getSalary());
    }
}
