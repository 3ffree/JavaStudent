package Work_1.Task_4;


public class Task_4 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            String str = String.format("%.4f", (float) 1/i);
            System.out.print(str);
            System.out.print('\n');
        }
    }
}
