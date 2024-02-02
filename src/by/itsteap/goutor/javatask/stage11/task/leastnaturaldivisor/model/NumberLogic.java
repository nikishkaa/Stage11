package by.itsteap.goutor.javatask.stage11.task.leastnaturaldivisor.model;

public class NumberLogic {
    public static final int ERROR = -1;

    public static int getLeastDivisor(int number) {

        if (number < 2) {
            return ERROR;
        }

        int divisor = number;

        int count = 2;

        while (count < number) {
            if (number % count == 0) {
                divisor = count;
                break;
            }

            count++;

        }


        return divisor;
    }
}
