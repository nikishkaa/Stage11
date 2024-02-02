package by.itsteap.goutor.javatask.stage11.task.leastnaturaldivisor.controller;

import by.itsteap.goutor.javatask.stage11.task.leastnaturaldivisor.model.NumberLogic;
import by.itsteap.goutor.javatask.stage11.task.leastnaturaldivisor.util.DivisorUI;
import by.itsteap.goutor.javatask.stage11.util.numberinitializer.NumberInitializer;
import by.itsteap.goutor.javatask.stage11.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int number = NumberInitializer.getUserNumber();

        int divisor = NumberLogic.getLeastDivisor(number);


        Printer.print(DivisorUI.getDivisorUI(divisor));
    }
}
