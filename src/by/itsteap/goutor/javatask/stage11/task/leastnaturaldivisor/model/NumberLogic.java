package by.itsteap.goutor.javatask.stage11.task.leastnaturaldivisor.model;

public class NumberLogic {
    public static final int ERROR = -1;

    public static int getLeastDivisor(int number) {

        if (number < 2) {
            return ERROR;
        }

        int divisor = number;


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                divisor = i;
                break;
            }
        }

        return divisor;
    }
}
