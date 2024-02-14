package by.itsteap.goutor.javatask.stage11.task.alldivisor.model;

public class NumberLogic {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getAllDivisors(int number) {

        if (number < 2) {
            return BUILDER.append("Invalid value");
        }


        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                BUILDER.append(i).append(" ");
            }
        }


        return BUILDER;
    }

}
