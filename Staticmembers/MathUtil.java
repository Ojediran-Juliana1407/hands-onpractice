package Staticmembers;

public class MathUtil {
    private static int addCount;
    private static int multiplyCount;

    public static int add (int a,int b) {
        addCount++;
        return a + b;
    }
    public static int multiply(int a,int b) {
        multiplyCount++;
        return a * b;
    }
    public static int getAddCount() {
        return addCount;
    }
    public static int getMultiplyCount() {
        return multiplyCount;
    }
    public static void resetCounts() {
        addCount = 0;
        multiplyCount = 0;
    }
}
