package Section_7_OOP_Part_1_Inheritance.CodingExercise_30_to_37.Ex_35_ComplexOperations;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public void add(double real, double imaginary) {
       this.real += real;
       this.imaginary += imaginary;
    }
    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}

/*

    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

Цей метод додає комплексне число до поточного комплексного числа, представленого об'єктом класу ComplexNumber.

Першим кроком метод приймає параметр типу ComplexNumber, який відображає комплексне число, що буде додано до поточного
комплексного числа.

Далі, метод використовує методи getReal() та getImaginary() об'єкту переданого параметра ComplexNumber, щоб отримати
значення його дійсної і уявної частин. Потім до дійсної частини поточного об'єкту ComplexNumber додається дійсна
частина переданого об'єкту ComplexNumber, а до уявної частини поточного об'єкту ComplexNumber додається уявна частина
переданого об'єкту ComplexNumber. Це виконується за допомогою операторів "+=".

У результаті виконання методу add() об'єкт, який викликав метод add() буде містити суму двох комплексних чисел. Якщо,
наприклад, поточний об'єкт ComplexNumber містить комплексне число 2 + 3i, а переданий параметр містить комплексне
число 4 - 2i, то після виконання методу add() поточний об'єкт буде містити комплексне число 6 + i.

*/