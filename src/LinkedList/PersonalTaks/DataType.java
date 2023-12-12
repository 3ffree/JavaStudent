package LinkedList.PersonalTaks;

public class DataType {

    private final int[] arr;
    private int arr_size;

    public DataType() {
        this.arr = new int[5];
        this.arr_size = 0;
    }

    public int[] getArr() {
        return arr;
    }

    public int getArr_size() {
        return arr_size;
    }

    public void addArr(int num) {
        //Returns True if list was not overflown

        this.arr_size += 1;
        this.arr[arr_size] = num;

        int i = arr_size - 1;
        while (i > 0 && this.arr[i] < this.arr[i - 1]) {
            int temp = this.arr[i];
            this.arr[i] = this.arr[i - 1];
            this.arr[i - 1] = temp;

            i--;
        }
    }

    public boolean checkArr() {
        return (this.arr_size >= 5);
    }
}
