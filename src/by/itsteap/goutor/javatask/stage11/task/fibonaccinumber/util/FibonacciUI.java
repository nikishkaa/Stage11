package by.itsteap.goutor.javatask.stage11.task.fibonaccinumber.util;

public class FibonacciUI {
    public static String getFibonacciUI(int b) {

        String msg = "Your fibonacci number is: ";

        return b >= 0 ? msg + b : "Error";
    }
}
