package by.itsteap.goutor.javatask.stage11.task.allprimedivisors.controller;

import by.itsteap.goutor.javatask.stage11.task.allprimedivisors.model.PrimeDivisorsLogic;
import by.itsteap.goutor.javatask.stage11.task.allprimedivisors.util.PrimeDivisorsUI;
import by.itsteap.goutor.javatask.stage11.util.numberinitializer.NumberInitializer;
import by.itsteap.goutor.javatask.stage11.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = NumberInitializer.getUserNumber();

        int[] primeDivisors = PrimeDivisorsLogic.getAllPrimeDivisors(number);


        Printer.print(PrimeDivisorsUI.getPrimeDivisorsUI(primeDivisors));
    }
}
