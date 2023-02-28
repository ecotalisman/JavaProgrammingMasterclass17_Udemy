package Section_7_OOP_Part_1_Inheritance.Lesson_82_ConstructorChallenge;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Nobody", "nobody@nowhere.com");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

/*

So for this challenge, you'll want to:

1. Create a new class, called Customer, with three fields:
 * name;
 * credit limit;
 * and email address.

Create the getter methods only, for each field. You don't need to create the setters.

Create three constructors for this class:
 * First, create a constructor for all three fields which should assign the arguments directly to the instance fields.

 * Second, create a no args constructor that calls another constructor, passing some literal values for each argument.

 * And lastly, create a constructor with just the name and email parameters, which also calls another constructor.


*/