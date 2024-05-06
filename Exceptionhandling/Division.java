package Exceptionhandling;

public class Division {
    public static void divide(int dividend, int divisor) {
        try {
            int result = dividend / divisor;
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed...try again");
        } finally {
            System.out.println("Division done");
        }
    }
}
