package Section_7_OOP_Part_1_Inheritance.CodingExercise_30_to_37.Ex_33_Point;

public class Point {

    private int x;
    private int y;

    public double distance() {
//        return (double) Math.sqrt((this.x - 0.0)*(this.x - 0.0) +
//                (this.y - 0.0)*(this.y - 0.0));
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return (double) Math.sqrt((this.x - x)*(this.x - x) +
                (this.y - y)*(this.y - y));
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

/*

You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance
variables) with name x and y of type int.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The
second constructor has parameters x and y of type int, and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as
double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point
and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance between this Point and
another Point as double.

How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

Where √ represents square root.


TEST EXAMPLE

→ TEST CODE:

Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());

OUTPUT

distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0

NOTE: Use Math.sqrt to calculate the square root √.

NOTE: Try to avoid duplicated code.

NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 7 methods.

NOTE: Do not add a main method to the solution code.



***********************TRANSLATE TO UKRAINIAN*************************************************

Опис методів:

Метод getX без параметрів повертає значення поля x.
Метод getY без параметрів повертає значення поля y.
Метод setX з одним параметром типу int встановлює значення поля x.
Метод setY з одним параметром типу int встановлює значення поля y.
Метод distance без параметрів повертає відстань між точкою, для якої викликається метод, і точкою з координатами (0, 0).
Метод distance з двома параметрами типу int повертає відстань між точкою, для якої викликається метод, і точкою з
вказаними координатами.
Метод distance з одним параметром типу Point повертає відстань між точкою, для якої викликається метод, і іншою точкою,
переданою як параметр.
Для обчислення відстані між двома точками використовується формула, яка була наведена у завданні:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

де (xA, yA) та (xB, yB) - координати точок A і B.

Уважно прочитайте завдання та реалізуйте всі необхідні методи. Не забудьте про модифікатор доступу "public" перед кожним
методом.


                Point() { this(0, 0); } та Point() { } пояснення:

Конструктор public Point() { } є конструктором за замовчуванням (no-arg constructor), який ініціалізує об'єкт класу
Point без будь-яких параметрів. В тілі цього конструктора нічого не виконується, тобто об'єкт створюється зі значеннями
полів x і y, які за замовчуванням мають значення 0.

Конструктор public Point() { this(0, 0); } також є конструктором за замовчуванням, але він використовує ключове слово
this для виклику іншого конструктора класу Point з двома параметрами. Таким чином, виклик цього конструктора ініціалізує
об'єкт класу Point з координатами (0, 0). Цей конструктор використовується для уникнення дублювання коду, оскільки один
з конструкторів передає значення 0 для обох параметрів, що еквівалентно конструктору без параметрів.

*/