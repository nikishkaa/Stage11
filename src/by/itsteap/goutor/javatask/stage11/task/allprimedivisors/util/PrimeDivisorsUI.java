package by.itsteap.goutor.javatask.stage11.task.allprimedivisors.util;

import java.util.Arrays;

public class PrimeDivisorsUI {
    public static String getPrimeDivisorsUI(int[] primeDivisors) {

        String msg = "All prime divisors is: ";

        return msg + getArraysString(primeDivisors);
    }


    private static String getArraysString(int[] primeDivisors) {

        return Arrays.toString(primeDivisors);
    }

}
