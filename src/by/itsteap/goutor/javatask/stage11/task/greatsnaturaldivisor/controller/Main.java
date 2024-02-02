package by.itsteap.goutor.javatask.stage11.task.greatsnaturaldivisor.controller;

import by.itsteap.goutor.javatask.stage11.task.greatsnaturaldivisor.model.DivisorLogic;
import by.itsteap.goutor.javatask.stage11.task.greatsnaturaldivisor.util.GreatsDivisorUI;
import by.itsteap.goutor.javatask.stage11.util.numberinitializer.NumberInitializer;
import by.itsteap.goutor.javatask.stage11.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = NumberInitializer.getUserNumber();

        int divisor = DivisorLogic.getGreatsNaturalDivisor(number);


        Printer.print(GreatsDivisorUI.getGreatsDivisorUI(divisor));
    }
}
