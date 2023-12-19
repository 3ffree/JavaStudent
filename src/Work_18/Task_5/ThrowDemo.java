package Work_18.Task_5;
import java.util.Scanner;

public class ThrowDemo {

    public ThrowDemo() {}
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                String key = myScanner.next();
                this.printDetails(key);
                break;
            }
            catch (Exception e) {
                System.out.print(e.getMessage() + "\n");
                System.out.print("Try again.\n");
            }
        }
    }
    private void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    private String getDetails(String key) throws Exception{
        if(key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "Data checked: " + key;
    }
}
