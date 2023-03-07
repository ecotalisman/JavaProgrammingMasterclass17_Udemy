package Section_7_OOP_Part_1_Inheritance.CodingExercise_30_to_37.Ex_36_Cylinder;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {

        return radius * radius * Math.PI;
    }
}
