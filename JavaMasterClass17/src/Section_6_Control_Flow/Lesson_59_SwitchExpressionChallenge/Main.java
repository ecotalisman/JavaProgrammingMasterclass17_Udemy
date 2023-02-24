package Section_6_Control_Flow.Lesson_59_SwitchExpressionChallenge;

public class Main {
    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printDayOfTheWeek(int day) {

        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }

        System.out.println(day + " stands for " + dayOfWeek);
    }
}

//    Create a method called printDayOfWeek, that takes an int parameter called day,
//    but doesn't return any values. Use the enhanced switch statement, to return the name of the day,
//    based on the parameter passed to the switch statement, so that 0 will return "Sunday",
//    1 will return "Monday", and so on. Any number  not between 0 and 6, should return "Invalid Day".
//
//    Use the enhanced switch statement as an expression, returning the result to a String
//    named dayOfTheWeek. Print both the day variable  and the dayOfTheWeek variable. In the main method,
//    call this method for the values 0 through 7.
//
//    Bonus: Create a second method called printWeekDay,
//    that uses an if then else statement, instead of a switch, to produce the same output.
//
//
// Створення методу під назвою printDayOfWeek, який приймає параметр int під назвою day,
// але не повертає жодних значень. Використовуйте розширений оператор switch, щоб повернути назву дня,
// на основі параметра, переданого оператору switch, так що 0 поверне "неділя",
// 1 поверне «понеділок» і так далі. Будь-яке число не між 0 і 6 має повертати "Недійсний день".
//
// Використовуйте розширений оператор switch як вираз, повертаючи результат до рядка
// з назвою dayOfTheWeek. Надрукуйте змінну day і dayOfTheWeek. В основному методі
// викликати цей метод для значень від 0 до 7.
//
// Бонус: створіть другий метод під назвою printWeekDay,
// який використовує оператор if then else замість перемикача для отримання того самого результату.