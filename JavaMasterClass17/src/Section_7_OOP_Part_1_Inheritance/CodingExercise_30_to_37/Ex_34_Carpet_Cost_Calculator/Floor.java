package Section_7_OOP_Part_1_Inheritance.CodingExercise_30_to_37.Ex_34_Carpet_Cost_Calculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getArea() {
        return width * length;
    }
}
