package Work_18;
import java.util.Scanner;

public class Task_2 {
    public static void exceptionDemo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer:\n");
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.print(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.print("Division by zero occurred.\n");
        }
        catch (NumberFormatException e) {
            System.out.print("Entered non-integer.\n");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
