package by.itsteap.goutor.javatask.stage11.util.numberinitializer;

import by.itsteap.goutor.javatask.stage11.util.view.Printer;

import java.util.Scanner;

public class NumberInitializer {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserNumber() {
        Printer.print("Enter your digit: ");
        return SCANNER.nextInt();
    }
}
