package Section_6_Control_Flow.CodingExercise_13_to_29.Ex_27_DiagonalStar;

public class My_Diagonal_Star {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid value");
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number ; j++) {
                if (i == number || j == number || i == 1 || j == 1 || i == j || j == number - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
