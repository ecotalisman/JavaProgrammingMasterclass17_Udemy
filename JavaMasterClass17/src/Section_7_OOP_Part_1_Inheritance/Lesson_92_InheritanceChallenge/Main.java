package Section_7_OOP_Part_1_Inheritance.Lesson_92_InheritanceChallenge;

public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}

/*

Your challenge is to create the Worker class, the Employee class, and either the SalariedEmployee,
or the HourlyEmployee class. You don't have to do both, but if you want to, go right ahead.

For each class, create the attributes and methods shown on this diagram.

Note that Employee has no methods of its own. Create a main method that will create either a
SalariedEmployee or HourlyEmployee, and call the methods, getAge, collectPay,
and the method shown for the specific type of class you decide to implement.

So if you implement SalariedEmployee, then execute retire().

If you implement HourlyEmployee, then execute getDoublePay().

*/