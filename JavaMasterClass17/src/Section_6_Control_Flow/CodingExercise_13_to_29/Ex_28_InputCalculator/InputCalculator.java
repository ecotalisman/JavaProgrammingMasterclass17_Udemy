package Section_6_Control_Flow.CodingExercise_13_to_29.Ex_28_InputCalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine(); // handle input buffer
        }

        long average = 0;
        if (count > 0) {
            average = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}
