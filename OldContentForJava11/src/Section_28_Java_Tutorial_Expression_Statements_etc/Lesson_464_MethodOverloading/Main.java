package Section_28_Java_Tutorial_Expression_Statements_etc.Lesson_464_MethodOverloading;

public class Main {
    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);

//      my methods:
//        System.out.println(calcFeetAndInchesToCentimeters(6, -1));
//        System.out.println(calcFeetAndInchesToCentimeters(157));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

//      method Tim Buchalka:
        if ((feet < 0) || ((inches < 0) || inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;


//      my method:
//        if (feet >= 0) {
//            if (inches >= 0 & inches <= 12) {
//                return (feet * 12 + inches) * 2.54;
//            }
//        }
//        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) (inches / 12);
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);

//        My method:
//        if (inches >= 0) {
////            return (calcFeetAndInchesToCentimeters((int) (inches / 12), inches - (int) (inches / 12) * 12));
////            return (calcFeetAndInchesToCentimeters((int) (inches / 12), (int) inches % 12));
//        }
//        return -1;

    }
}