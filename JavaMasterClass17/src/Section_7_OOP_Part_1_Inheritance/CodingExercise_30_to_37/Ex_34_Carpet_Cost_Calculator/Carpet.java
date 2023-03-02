package Section_7_OOP_Part_1_Inheritance.CodingExercise_30_to_37.Ex_34_Carpet_Cost_Calculator;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
