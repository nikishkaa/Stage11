package by.itsteap.goutor.javatask.stage11.task.leastnaturaldivisor.util;

public class DivisorUI {
    public static String getDivisorUI(int divisor) {
        String msg = "Min least natural divisor is: ";

        return divisor > 0 ? msg + divisor : "Error";
    }
}
