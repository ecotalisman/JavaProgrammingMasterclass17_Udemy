package Section_6_Control_Flow.Lesson_61_TheForStatementChallenge;

public class Main {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; count < 3 && i <= 50 ; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static int isCount(int number) {

        int count = 0;
        for (int i = 2; i <= number; i++) {
           if( isPrime(i)) {
               count++;
               System.out.println(i);
               if (count == 3) {
                   break;
               }
           }
        }
        return count;
    }
}