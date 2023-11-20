package Work_1;
import java.util.Scanner;

public class Task_3_check {

    public static void main(String[] args){
        String[] input = new String[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            input[i] = sc.nextLine();
        }

        Task_3.main(input);
    }
}
