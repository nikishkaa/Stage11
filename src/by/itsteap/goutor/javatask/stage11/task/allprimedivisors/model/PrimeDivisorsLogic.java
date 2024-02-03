package by.itsteap.goutor.javatask.stage11.task.allprimedivisors.model;

public class PrimeDivisorsLogic {
    public static int[] getAllPrimeDivisors(int number) {

        if (number < 2) {
            return new int[]{-1};
        }

        int[] primeDivisors = new int[10];
        int count = 0;


        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {

                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {

                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeDivisors[count++] = i;
                }
            }
        }


        return primeDivisors;
    }
}
