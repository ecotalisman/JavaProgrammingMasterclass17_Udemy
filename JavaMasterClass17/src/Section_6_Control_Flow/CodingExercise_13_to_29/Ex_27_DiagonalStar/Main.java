package Section_6_Control_Flow.CodingExercise_13_to_29.Ex_27_DiagonalStar;

public class Main {
    public static void main(String[] args) {

//        DiagonalStar.printSquareStar(6);
        My_Diagonal_Star.printSquareStar(10);
    }

}

/*

У завданні було запропоновано написати метод printSquareStar, який має виводити на екран зірочки у формі квадрата з
діагоналями зірок. Форма квадрата складається з числа рядків та стовпців, яке задається аргументом методу number.
Якщо число менше 5, то потрібно вивести "Недійсне значення". Усі рядки та стовпці мають складатися зі зірок, за
виключенням діагоналей, які мають складатися з пробілів та зірок.

Метод printSquareStar має складатися з кількох внутрішніх циклів, які перебирають рядки та стовпці квадрата.
Під час перебору потрібно перевіряти умови для виводу зірок та пробілів, які описані в завданні, та відповідно виводити зірки чи пробіли в консоль.

Також у завданні наведені приклади виводу квадрата з діагоналями зірок, які можна використовувати для перевірки коректності написаного коду.

****************************ENGLISH****************************************************************************************************************

Diagonal Star
Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*).
This should be accomplished by using loops (see examples below).



EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****

Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2

printSquareStar(8); should print the following:

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********


The patterns above consist of a number of rows and columns (where number is the number of rows to print).
For each row or column, stars are printed based on four conditions (Read them carefully):

In the first or last row

In the first or last column

When the row number equals the column number

When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)



HINT: Use a nested loop (a loop inside of a loop).

HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" ");
prints a space and does not "move" to another line.

HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .

NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
*/