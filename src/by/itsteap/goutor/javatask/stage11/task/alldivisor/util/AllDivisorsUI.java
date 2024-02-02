package by.itsteap.goutor.javatask.stage11.task.alldivisor.util;

import java.util.Arrays;

public class AllDivisorsUI {
    public static String getAllDivisorsUI(int[] divisors) {

        String msg = "All divisors your number is: ";

        return msg + getNumberString(divisors);
    }


    private static String getNumberString(int[] divisors) {

        return Arrays.toString(divisors);
    }
}
