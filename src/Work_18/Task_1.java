package Work_18;

public class Task_1 {
    public static void exceptionDemo() {
        try {
            System.out.print(2 / 0);
        }
        catch (ArithmeticException e) {
            System.out.print("Attempted division by zero.\n");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
