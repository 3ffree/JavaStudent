package Work_20.Task2;

public class MinMax<T extends Comparable<T>> {
    double[] array;

    public MinMax(double[] array) {
        this.array = array;
    }

    public double getMin() {

        double min = Double.POSITIVE_INFINITY;
        for (double v : this.array) {
            min = Double.min(min, v);
        }
        return min;
    }

    public double getMax() {

        double max = Double.POSITIVE_INFINITY;
        for (double v : this.array) {
            max = Double.max(max, v);
        }
        return max;
    }
}
