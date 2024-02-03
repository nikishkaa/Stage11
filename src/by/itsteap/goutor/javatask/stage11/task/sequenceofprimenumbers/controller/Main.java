package by.itsteap.goutor.javatask.stage11.task.sequenceofprimenumbers.controller;

import by.itsteap.goutor.javatask.stage11.task.sequenceofprimenumbers.model.SequenceLogic;
import by.itsteap.goutor.javatask.stage11.task.sequenceofprimenumbers.util.SequenceUI;
import by.itsteap.goutor.javatask.stage11.util.numberinitializer.NumberInitializer;
import by.itsteap.goutor.javatask.stage11.util.view.Printer;


public class Main {
    public static void main(String[] args) {
        int number = NumberInitializer.getUserNumber();

        int[] sequence = SequenceLogic.getSequence(number);


        Printer.print(SequenceUI.getSequenceUI(sequence));
    }
}
