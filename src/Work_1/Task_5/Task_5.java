package Work_1.Task_5;
import java.util.Scanner;

public class Task_5 {
    
    public static int factorial(int n) {
        
        if (n < 0) {
            System.out.print("Factorial doesn't have proper definition, even using Gamma function.\n");
            return -1;
        }
        else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer, which factorial you want to calculate.\n");
        int input = sc.nextInt();

        int output = Task_5.factorial(input);
        System.out.print(output);
    }
}
