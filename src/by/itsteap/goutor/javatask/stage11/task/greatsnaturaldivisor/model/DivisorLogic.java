package by.itsteap.goutor.javatask.stage11.task.greatsnaturaldivisor.model;

public class DivisorLogic {
    public static final int ERROR = -1;

    public static int getGreatsNaturalDivisor(int number) {
        if (number < 2) {
            return ERROR;
        }

        int divisor = number;
        int count = number - 1;

        while (count > 0) {

            if (number % count == 0 && count != 1) {
                divisor = count;
                break;
            }

            count--;
        }


        return divisor;
    }
}
