package by.itsteap.goutor.javatask.stage11.task.sequenceofprimenumbers.model;

public class SequenceLogic {

    public static int[] getSequence(int number) {

        if (number < 1) {
            return new int[]{-1};
        }

        int[] sequence = new int[number];
        int index = 0;

        int i = 2;
        while (index < number) {
            boolean isPrime = true;

            int j = 2;
            while (j * j <= i && isPrime) {
                if (i % j == 0) {
                    isPrime = false;
                }
                j++;
            }

            if (isPrime) {
                sequence[index++] = i;
            }

            i++;
        }

        return sequence;
    }
}