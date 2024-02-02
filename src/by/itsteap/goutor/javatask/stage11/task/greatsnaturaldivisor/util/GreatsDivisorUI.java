package by.itsteap.goutor.javatask.stage11.task.greatsnaturaldivisor.util;

public class GreatsDivisorUI {
    public static String getGreatsDivisorUI(int divisor) {
        String msg = "Greats natural divisor your doigit is: ";

        return divisor > 0 ? msg + divisor : "Error";
    }
}
