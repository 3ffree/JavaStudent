package Work_3.Task_1;
import java.util.Random;
import java.util.Arrays;
import Shortcuts.Sort;
public class RandomArray {

    public static void main(String[] args) {
        Double[] array = new Double[5];
        Random newRand = new Random();

        for (int i = 0; i < 5; i++) {
            array[i] = newRand.nextDouble();
        }

        System.out.println(Arrays.toString(array));
        Sort.HeapSort(array,5);
        System.out.println(Arrays.toString(array));
    }
}
