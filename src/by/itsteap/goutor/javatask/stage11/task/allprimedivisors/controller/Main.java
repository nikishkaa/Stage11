package by.itsteap.goutor.javatask.stage11.task.allprimedivisors.controller;

import by.itsteap.goutor.javatask.stage11.task.allprimedivisors.model.NumberLogic;
import by.itsteap.goutor.javatask.stage11.task.allprimedivisors.util.UserUI;
import by.itsteap.goutor.javatask.stage11.util.numberinitializer.NumberInitializer;
import by.itsteap.goutor.javatask.stage11.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = NumberInitializer.getUserNumber();

        StringBuilder primeDivisors = NumberLogic.getAllPrimeDivisors(number);


        Printer.print(UserUI.getPrimeDivisorsUI(primeDivisors));
    }
}
