package Work_3.Task_2;
import java.util.Arrays;
import java.util.Random;
import Shortcuts.Sort;

public class IsSortedRandom {

    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(90) + 10;
        }
        System.out.print(Arrays.toString(arr) + '\n');

        boolean flag = true;

        for(int i = 1; i < 4; i++) {
            flag &= (arr[i-1] < arr[i]);
        }

        System.out.print(flag);
    }

}
