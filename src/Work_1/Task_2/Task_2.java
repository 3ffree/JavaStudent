package Work_1.Task_2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array.");
        int length = 0;

        if (sc.hasNextInt()) {
            length = sc.nextInt();
        }
        else {
            System.out.print("A non-integer was entered.");
            System.exit(-1);
        }

        /*Sum and average using while loop*/

        int[] array = new int[length];
        int sum = 0;
        int i = 0;
        while (i < length) {
            array[i] = sc.nextInt();
            sum += array[i];
            i ++;
        }

        System.out.print(sum/length);
        System.out.print('\n');

        /*Min and max search using while loop*/
        /*Using sum as a starting min value, assuming that an array consists of positive integers*/

        int min = sum;
        int max = 0;
        i = 0;
        while (i < length) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }

        System.out.print(min);
        System.out.print('\n');
        System.out.print(max);
        System.out.print('\n');



    }
}
