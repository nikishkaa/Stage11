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


        int count = 2;

        while (count <= number) {

            if (number % count == 0) {
                BUILDER.append(count).append(" ");
                count++;
            }

            count++;

        }

        return BUILDER;
    }

}
