package Section_7_OOP_Part_1_Inheritance.CodingExercise_30_to_37.Ex_37_PoolArea;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getVolume() {
        return height * getArea();
    }
    public double getHeight() {
        return height;
    }
}
