package Work_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array.\n");
        int length = 0;

        if (sc.hasNextInt()) {
            length = sc.nextInt();
        }
        else {
            System.out.print("A non-integer was entered.\n");
            System.exit(-1);
        }

        int[] array = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.print(sum);
        System.out.print("\n");
        System.out.print(sum/length);

    }
}
