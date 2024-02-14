package by.itsteap.goutor.javatask.stage11.task.allprimedivisors.model;

public class NumberLogic {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getAllPrimeDivisors(int number) {

        if (number < 2) {
            return BUILDER.append("Invalid value");
        }


        double t = Math.sqrt(number);

        for (int i = 2; i <= t; i++) {
            if (number % i == 0) {

                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {

                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    BUILDER.append(i).append(" ");
                }
            }
        }


        return BUILDER;
    }
}
