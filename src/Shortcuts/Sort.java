package Shortcuts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {

    public static class BinaryHeap {
        private final Double[] array;
        private int current;

        public BinaryHeap(Double[] array) {
            this.array = array;
            this.current = 0;
        }

        public void siftUp(Double value) {
            this.array[this.current++] = value;
            int i = this.current - 1;

            while ((i > 0) && (this.array[i] > this.array[(i-1)/2])) {
                Double temp = this.array[i];
                this.array[i] = this.array[(i-1)/2];
                this.array[(i-1)/2] = temp;

                i = (i-1)/2;
            }
        }

        public Double siftDown() {
            Double result = this.array[0];

            if (this.current != 1) {

                Double temp = this.array[0];
                this.array[0] = this.array[(this.current--) - 1];
                this.array[this.current] = temp;

                int i = 0;
                while (2 * i + 1 < this.current) {
                    int j = 2 * i + 1;
                    if (2 * i + 2 < this.current && this.array[2 * i + 2] > this.array[j]) {
                        j = 2 * i + 2;
                    }
                    if (this.array[i] >= this.array[j]) {
                        break;
                    } else {

                        Double temp1 = this.array[i];
                        this.array[i] = this.array[j];
                        this.array[j] = temp1;

                        i = j;
                    }
                }
                return result;
            }
            else {
                this.current--;
                return result;
            }

        }
    }

    public static BinaryHeap Heapify(Double[] array, int size) {
        BinaryHeap pref = new BinaryHeap(array);
        for (int i = 0; i < size; i++) {
            pref.siftUp(array[i]);
        }
        return pref;
    }

    public static Double[] HeapSort(Double[] array, int size) {
        BinaryHeap object = Heapify(array, size);
        int i = size - 1;
        while (object.current != 0) {
            array[i--] = object.siftDown();
        }
        return array;
    }
}

