package by.itsteap.goutor.javatask.stage11.task.alldivisor.model;

public class AllDivisorsLogic {
    public static int[] getAllDivisors(int number) {

        if (number < 2) {
            return new int[]{-1};
        }

        int[] divisors = new int[10];


        int count = 2;
        int arrayCount = 1;

        while (count <= number) {

            if (number % count == 0) {
                divisors[divisors.length - arrayCount] = count;
                arrayCount++;
                count++;
            }

            count++;

        }

        return divisors;
    }

}
