package Section_6_Control_Flow.Lesson_74_MinAndMaxChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        while (true) {
            System.out.println("Введіть число, або будь-який символ для виходу:");
            String input = scanner.nextLine();

            // перевіряємо чи є введені дані числом
            if (!input.matches("-?\\d+(\\.\\d+)?")) {
                break; // виходимо з циклу якщо не число
            }

            // парсимо введене число
            double num = Double.parseDouble(input);

            // оновлюємо мінімальне та максимальне значення
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // виводимо максимум та мінімум введених чисел, якщо вони були
        if (min != Double.MAX_VALUE && max != Double.MIN_VALUE) {
            System.out.println("Мінімальне число: " + min);
            System.out.println("Максимальне число: " + max);
        } else {
            System.out.println("Ви не ввели жодного числа");
        }
    }
}


/*

You'll be using an endless loop which:

- Prompts the user to enter a number, or any character to quit.

- Validates if the user-entered data really is a number, you can choose either
an integer, or double validation method.

- If the user-entered data is not a number, quit the loop.

- Keep track of the minimum number entered.

- Keep track of the maximum number entered.

If the user has previously entered a set of numbers (or even just one), display the minimum,
and maximum number, which the user entered.

So you'll want to create a loop, that continues to
process, until the user enters non-numeric data. You'll prompt the user to enter a number,
or type a character to quit each iteration. After the user enters some data, you'll
read the input as a String, and then test if it can be parsed to a number.

You can decide if you want to solicit integers or decimal numbers, from the user.

If the user entered a valid number, you'll want to see if it is less than what you
have for a minimum number, and if it is, you'll set that to the current number.

You'll do the same check for maximum number. For example, after one valid numeric entry,

minimum and maximum numbers, should be the same number.


**************TRANSLATE TO UKRAINIAN************************************************************


У цій задачі вам потрібно створити цикл, який буде працювати постійно, поки користувач не введе нечислові дані.

 - Кожен раз програма повинна запитувати користувача, щоб він ввів число або символ, який буде використовуватись
для виходу з циклу.

- Далі вам потрібно перевірити, чи введені користувачем дані є числом.

- Ви можете використовувати метод перевірки на ціле число або дійсне число.

- Якщо користувач ввів будь-який символ, програма повинна завершити свою роботу і вивести максимум та мінімум
з усіх введених раніше чисел (якщо такі були).

- Також вам потрібно визначити, чи користувач вводить цілі числа або числа з десятковими значеннями (double), і
використовувати відповідний метод для перевірки введених даних.


У цілому, вам потрібно створити програму, яка працюватиме в циклі, запитуватиме користувача ввести число або
символ для виходу, перевірятиме, чи введені дані є числом, і зберігатиме максимум та мінімум з усіх введених чисел.
Після виходу з циклу програма повинна вивести максимум та мінімум введених чисел, якщо такі були.

*/