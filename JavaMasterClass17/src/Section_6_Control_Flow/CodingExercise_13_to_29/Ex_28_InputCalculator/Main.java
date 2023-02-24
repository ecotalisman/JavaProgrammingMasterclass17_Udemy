package Section_6_Control_Flow.CodingExercise_13_to_29.Ex_28_InputCalculator;

public class Main {
    public static void main(String[] args) {

        InputCalculator.inputThenPrintSumAndAverage();

    }
}

/*

Input Calculator
Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.



EXAMPLES OF INPUT/OUTPUT:

EXAMPLE 1:

INPUT:

1
2
3
4
5
a
OUTPUT

SUM = 15 AVG = 3



EXAMPLE 2:

INPUT:

hello

OUTPUT:

SUM = 0 AVG = 0

TIP: Use Scanner to read an input from the user.

TIP: Use casting when calling the round method since it needs double as a parameter.

NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.

NOTE: Be mindful of spaces in the printed message.

NOTE: Be mindful of users who may type an invalid input right away (see example above).

NOTE: The method inputThenPrintSumAndAverage should be defined as public static like we have been doing so far in the course.

NOTE: Do not add the main method to the solution code.


***************************************TRANSLATE TO UKRAINIAN********************************************************************

Завдання полягає в написанні методу з назвою inputThenPrintSumAndAverage без параметрів, який зчитує цілі числа з клавіатури
та виводить на екран суму та середнє арифметичне введених чисел. Якщо користувач введе щось, що не є цілим числом, то на екрані
має вивестись повідомлення "SUM = XX AVG = YY", де XX - сума введених цілих чисел, YY - середнє арифметичне введених чисел
(заокруглене до цілого).

Для виконання цього завдання необхідно використовувати Scanner для зчитування введення від користувача. Потім потрібно
розібратися з введеними даними та порахувати суму та середнє арифметичне, а також вивести на екран результат у відповідному
форматі. Scanner - це об'єкт, що дозволяє зчитувати введення з консолі або іншого потоку введення даних. У цьому коді він
створюється та використовується для зчитування введення від користувача, після чого закривається за допомогою методу close().
Це робиться для звільнення ресурсів та запобігання витоку пам'яті.

*/