package Section_28_Java_Tutorial_Expression_Statements_etc.CodingExercise.Lesson_461_SpeedConverter;

public class Main {
    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(-2.0);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(-2.0);
    }
}