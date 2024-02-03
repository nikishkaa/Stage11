package by.itsteap.goutor.javatask.stage11.task.fibonaccinumber.util;

import by.itsteap.goutor.javatask.stage11.util.view.Printer;

import java.util.Scanner;

public class NumberFibonacciInitializer {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getFibonacciNumber() {
        Printer.print("Get number of fibonacci number: ");
        return SCANNER.nextInt();
    }
}
