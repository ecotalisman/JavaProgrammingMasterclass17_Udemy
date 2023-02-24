package Section_6_Control_Flow.CodingExercise_13_to_29.Ex_14_Number_Of_Days_In_Month;

public class Main {
    public static void main(String[] args) {
//        NumberOfDaysInMonth.isLeapYear(-1600);
//        NumberOfDaysInMonth.isLeapYear(1600);
//        NumberOfDaysInMonth.isLeapYear(2017);
//        NumberOfDaysInMonth.isLeapYear(2000);
//        NumberOfDaysInMonth.isLeapYear(1924);
//        NumberOfDaysInMonth.isLeapYear(1800);

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));
    }
}