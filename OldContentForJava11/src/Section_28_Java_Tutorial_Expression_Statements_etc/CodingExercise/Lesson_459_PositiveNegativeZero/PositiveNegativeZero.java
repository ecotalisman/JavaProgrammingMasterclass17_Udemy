package Section_28_Java_Tutorial_Expression_Statements_etc.CodingExercise.Lesson_459_PositiveNegativeZero;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
    }

    public static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
}
