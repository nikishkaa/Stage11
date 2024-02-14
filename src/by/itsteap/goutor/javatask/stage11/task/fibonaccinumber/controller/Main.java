package by.itsteap.goutor.javatask.stage11.task.fibonaccinumber.controller;

import by.itsteap.goutor.javatask.stage11.task.fibonaccinumber.model.NumberLogic;
import by.itsteap.goutor.javatask.stage11.task.fibonaccinumber.util.FibonacciUI;
import by.itsteap.goutor.javatask.stage11.task.fibonaccinumber.util.NumberFibonacciInitializer;
import by.itsteap.goutor.javatask.stage11.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = NumberFibonacciInitializer.getFibonacciNumber();

        int b = NumberLogic.getFibonacciNumber(number);


        Printer.print(FibonacciUI.getFibonacciUI(b));
    }
}
