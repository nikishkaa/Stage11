package by.itsteap.goutor.javatask.stage11.task.alldivisor.controller;

import by.itsteap.goutor.javatask.stage11.task.alldivisor.model.NumberLogic;
import by.itsteap.goutor.javatask.stage11.task.alldivisor.util.AllDivisorsUI;
import by.itsteap.goutor.javatask.stage11.util.numberinitializer.NumberInitializer;
import by.itsteap.goutor.javatask.stage11.util.view.PrintBuild;

public class Main {
    public static void main(String[] args) {
        int number = NumberInitializer.getUserNumber();

        StringBuilder BUILDER = NumberLogic.getAllDivisors(number);

        PrintBuild.printBuilder(AllDivisorsUI.getAllDivisorsUI(BUILDER));
    }
}
