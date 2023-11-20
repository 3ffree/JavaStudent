package Work_2.Point;

import java.sql.Array;

public class Tester {
    private final Circle[] array;
    private final int length;

    public Tester(int length) {
        this.length = length;
        this.array = new Circle[length];
    }

    public Circle[] getArray() {
        return array;
    }

    public void addToArray(Circle item, int position) {
        this.array[position] = item;
    }

    public int getLength() {
        return length;
    }

}
