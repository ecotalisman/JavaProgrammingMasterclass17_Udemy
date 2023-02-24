package Section_6_Control_Flow.Lesson_66_DigitSumChallenge;

public class Main {
    public static void main(String[] args) {


        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    private static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 9){
            // extract th least-significant digit
            sum += (number % 10);

            // drop the least-significant digit
            number /= 10;       // number like as number = number / 10;
        }

//      if number a single digit for example number = 4 we return sum = 0 + 4 = 4
        sum += number;

        return sum;

//**********************************************************************************************************************
        // It's My solution:
//        int count = 0;
//
//        while (number % 10 != 0) {
//            count += number % 10;
//            number = number / 10;
//
//            if (number / 10 != 0) {
//                count += number % 10;
//                number = number / 10;
//                continue;
//            }
//
//            System.out.println("Sum digits number " + count);
//
//        }
//        return count;
//**********************************************************************************************************************
    }
}