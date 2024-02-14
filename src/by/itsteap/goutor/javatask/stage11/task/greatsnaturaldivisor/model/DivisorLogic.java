package by.itsteap.goutor.javatask.stage11.task.greatsnaturaldivisor.model;

public class DivisorLogic {
    public static final int ERROR = -1;

    public static int getGreatsNaturalDivisor(int number) {
        if (number < 2) {
            return ERROR;
        }

        int divisor = number;

        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0 && i != 1) {
                divisor = i;
                break;
            }
        }

        return divisor;
    }
}
