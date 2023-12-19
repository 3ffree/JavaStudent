package Work_18.Task_5;

public class Task_5 {
    public static void main(String[] args) {
        ThrowDemo obj = new ThrowDemo();

        try{
            obj.getKey();
        }
        catch (NullPointerException e) {
            System.out.print(e.getMessage());
        }

    }
}
