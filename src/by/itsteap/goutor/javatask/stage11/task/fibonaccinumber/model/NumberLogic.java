package by.itsteap.goutor.javatask.stage11.task.fibonaccinumber.model;

public class NumberLogic {
    public static final int FIRST_FIBONACCI = 0;
    public static final int SECOND_FIBONACCI = 1;

    public static int getFibonacciNumber(int number) {

        if (number <= 1) {
            return -1;
        }

        int a = FIRST_FIBONACCI;
        int b = SECOND_FIBONACCI;


        for (int i = 3; i <= number; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

}
