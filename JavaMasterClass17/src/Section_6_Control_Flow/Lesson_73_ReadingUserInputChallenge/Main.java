package Section_6_Control_Flow.Lesson_73_ReadingUserInputChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(getInputNumber(2));
    }
    public static String getInputNumber(int number) {

        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        double sum = 0;

        while (valid) {
            for (int i = 1; i <= number; i++) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.println("Enter number #" + i);
                    try {
                        double addNumber = Double.parseDouble(scanner.nextLine());
                        if (addNumber <= 0) {
                            throw new IllegalArgumentException("Number must be positive!");
                        }
                        sum += addNumber;
                        validInput = true;
                    } catch (NumberFormatException e){
                        System.out.println("Invalid input! Please enter a valid number...");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            valid = false;
        }
        return "Sum of all numbers = " + sum;
    }
}

/*

In this challenge, you'll read 5 valid numbers from the console, entered by the user,
and print the sum of those five numbers.

You'll want to check that the numbers entered, are valid integers.

If not, print out the message "Invalid number" to the console, but continue looping, until
you do have 5 valid numbers.

Before the user enters each number, prompt them with the message, "Enter number #x:",
where x represents the count, 1, 2, 3, etc.

And as an example there, the first message would look something like,
"Enter number #1:", the next, "Enter number #2:", and so on.

And so, the hints for doing this are, Firstly, use a while loop, or a do while loop.
Use a Scanner object, and the nextLine method, to read input as a String.

Use Integer.parseInt, as we did in the previous videos.

You'll need some local variables, to keep track of the count of valid integers,
as well as the sum of the integers.

РІШЕННЯ:

Цей код містить додаткову перевірку введеного числа на те, чи є воно додатнім. Якщо введене число менше або
дорівнює нулю, метод кидає виключення IllegalArgumentException зі відповідним повідомленням. Також, я додав
додатковий цикл для кожного введення, щоб гарантувати, що користувач вводить правильне значення.


Ask-1
розпиши як змінюється значення validInput (в коді що ти написав для внутрішнього циклу try catch) в середині циклу, не можу зрозуміти

Answer-1
Змінна validInput в даному випадку використовується для визначення того, чи було введено коректне число з консолі.
Значення цієї змінної залежить від успішності виконання блоку try. Якщо введене число коректне (це число і більше 0),
то змінна validInput встановлюється на true, інакше на false. Далі на кожній ітерації внутрішнього циклу, якщо validInput дорівнює
false, то зовнішній цикл продовжується, а користувач повинен ввести число знову.

Зверніть увагу, що змінна validInput визначається внутрішньо в блоку try, тому її значення зберігається лише на поточній ітерації
циклу. Якщо наступна ітерація циклу починається зі значення validInput = true, то це не має жодного відношення до попередніх ітерацій.
Це означає, що змінна validInput завжди починається зі значення false на кожній ітерації внутрішнього циклу.

Отже, якщо користувач вводить коректне число, на поточній ітерації змінна validInput буде мати значення true, і внутрішній цикл завершиться.
Якщо користувач вводить некоректне число, на поточній ітерації змінна validInput буде мати значення false, і внутрішній цикл продовжиться.


Ask-2
що означає throw new IllegalArgumentException в коді що ти дав розпиши детально про це

Answer-2
У Java throw - це ключове слово, яке використовується для створення та викидання виключення (exception). Коли ми використовуємо
throw, ми кажемо програмі, що сталася помилка, і потрібно припинити виконання програми, повернувши помилку на рівень вище у стек викликів.

IllegalArgumentException - це підклас виключення (exception), яке може бути викликане в разі, коли аргумент методу переданий недійсний.
Наприклад, якщо метод очікує отримати числове значення, але отримує рядок, то виникає недійсний аргумент.

Тому, коли ми використовуємо throw new IllegalArgumentException(), ми створюємо новий об'єкт виключення IllegalArgumentException і
викидаємо його, щоб повідомити про недійсний аргумент методу. Це призводить до того, що виконання методу припиняється та виключення
передається вище по стеку викликів. Вище по стеку викликів може бути обробка виключення за допомогою блоку try-catch, або програма
припиняє свою роботу і виводить стек викликів та інформацію про помилку.


input.matches("-?\\d+(\\.\\d+)?")

Цей рядок коду використовує регулярні вирази, щоб перевірити, чи введений користувачем рядок є числом або ні.

Розглянемо розбиття рядка на складові:

-? - це означає, що перед числом може бути або мінусовий знак (для від'ємних чисел), або його не буде (для додатніх чисел).

\\d+ - це означає, що після мінусового знака або в його відсутності буде одне або більше цифрових символів. Наприклад, "123" або "-456".

(\\.\\d+)? - це означає, що після цифрових символів може або не може бути крапка (для дробових чисел), і якщо вона є, то слід за нею одне
або більше цифрових символів. Тобто, воно може бути або без дробової частини ("123"), або з дробовою частиною ("123.456").

Отже, рядок -?\\d+(\\.\\d+)? означає, що введений рядок може починатися з мінусового знака, якщо число від'ємне, а потім містити одне або
більше цифрових символів, а після них може бути крапка і одне або більше цифрових символів. Цей рядок повертає true, якщо введений рядок
відповідає цьому шаблону, і false - якщо ні. Таким чином, умова input.matches("-?\\d+(\\.\\d+)?") перевіряє, чи введене користувачем значення є дійсним числом.

*/