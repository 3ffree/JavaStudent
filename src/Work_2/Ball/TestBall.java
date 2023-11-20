package Work_2.Ball;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        /*Init test*/
        System.out.print("Enter starting coordinates.\n");
        Ball newRecord = new Ball(Input.nextDouble(), Input.nextDouble());

        /*toString test*/
        System.out.print("Entered data: ");
        System.out.print(newRecord);

        /*Setter and getter tests*/
        System.out.print("Enter new x coordinate for the existing ball to change.\n");
        double newX = Input.nextDouble();
        System.out.print("The previous name " + newRecord.getX() + ' ' + newRecord.getY() + '\n');
        newRecord.setX(newX);
        System.out.print(" was changed to " + newRecord.getX() + ".\n");

        /*Move test*/
        System.out.print("Enter coordinates for the movement vector.\n");
        double moveX = Input.nextDouble();
        double moveY = Input.nextDouble();
        newRecord.move(moveX, moveY);
        System.out.print("The ball has been moved to" + newRecord + '\n');
    }
}
