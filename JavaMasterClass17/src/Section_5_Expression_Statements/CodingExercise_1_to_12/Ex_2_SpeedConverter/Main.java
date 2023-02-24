package Section_5_Expression_Statements.CodingExercise_1_to_12.Ex_2_SpeedConverter;

public class Main {
    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(-2.0);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(-2.0);
    }
}