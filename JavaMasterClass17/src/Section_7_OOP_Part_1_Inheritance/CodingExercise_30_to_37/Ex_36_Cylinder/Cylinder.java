package Section_7_OOP_Part_1_Inheritance.CodingExercise_30_to_37.Ex_36_Cylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }
}
