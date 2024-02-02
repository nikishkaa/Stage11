package by.itsteap.goutor.javatask.stage11.util.numberinitializer;

import java.util.Scanner;

public class NumberInitializer {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserNumber() {

        return SCANNER.nextInt();
    }
}
