package Work_19;

public class Task_1 {
    public static class InvalinINNException extends RuntimeException {
        public InvalinINNException(String message) {
            super(message);
        }
    }

    public void INNcheck(String number) throws InvalinINNException {
        if (number.length() < 17) {
            throw new InvalinINNException("Wrong number entered");
        }
        else {
            System.out.print("");
            //proceed
        }

    }
}
