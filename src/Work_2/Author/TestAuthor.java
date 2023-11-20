package Work_2.Author;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        /*Init test*/
        System.out.print("Enter name, email and gender of the author, separating them with Enter.\n");
        Author newRecord = new Author(Input.nextLine(), Input.nextLine(), Input.nextLine());

        /*toString test*/
        System.out.print("Entered data:");
        System.out.print(newRecord.toString());

        /*Setter and getter tests*/
        System.out.print("Enter new name for the existing record to change.\n");
        String newName = Input.nextLine();
        System.out.print("The previous name " + newRecord.getName());
        newRecord.setName(newName);
        System.out.print(" was changed to " + newRecord.getName() + ".");
    }
}
