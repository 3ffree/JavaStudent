package Work_20.Task2;

public class Calculator {
    public static <T extends Number> double add(T number1, T number2) {
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T extends Number> double multiply(T number1, T number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T extends Number> double divide(T number1, T number2) {
        return number1.doubleValue() / number2.doubleValue();
    }

    public static <T extends Number> double subtract(T number1, T number2) {
        return number1.doubleValue() - number2.doubleValue();
    }
}
