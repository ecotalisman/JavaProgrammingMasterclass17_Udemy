package Section_7_OOP_Part_1_Inheritance.Lesson_92_InheritanceChallenge;

public class SalariedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustPay;
    }

    public void retire() {

        terminate("12/12/2025");
        isRetired = true;
    }
}
