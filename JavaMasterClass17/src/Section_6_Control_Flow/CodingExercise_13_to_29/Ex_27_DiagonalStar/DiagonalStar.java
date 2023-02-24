package Section_6_Control_Flow.CodingExercise_13_to_29.Ex_27_DiagonalStar;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || col == 1 || col == number || row == col || col == number - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
Пояснення:

Перевіряємо, чи менше число за 5. Якщо так, виводимо повідомлення про недійсне значення і завершуємо метод за допомогою оператора return.
Використовуючи два вкладені цикли for, перебираємо кожен рядок і стовпець в квадратній матриці.
Якщо поточна позиція відповідає одній з чотирьох умов, виводимо *, інакше - пробіл.
Для переходу до наступного рядка використовуємо метод System.out.println().
*/
