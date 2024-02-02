package by.itsteap.goutor.javatask.stage11.task.alldivisor.controller;

import by.itsteap.goutor.javatask.stage11.task.alldivisor.model.AllDivisorsLogic;
import by.itsteap.goutor.javatask.stage11.task.alldivisor.util.AllDivisorsUI;
import by.itsteap.goutor.javatask.stage11.util.numberinitializer.NumberInitializer;
import by.itsteap.goutor.javatask.stage11.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = NumberInitializer.getUserNumber();

        int[] divisors = AllDivisorsLogic.getAllDivisors(number);

        Printer.print(AllDivisorsUI.getAllDivisorsUI(divisors));
    }
}
