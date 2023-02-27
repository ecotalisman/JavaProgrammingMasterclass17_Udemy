package Section_7_OOP_Part_1_Inheritance.Lesson_79_ClassesChallenge;
public class Account {

    private int number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " dollars. New balance is " +
                balance + " dollars.");
    }

    public void creditMoney(double credit) {
        if (balance >= credit) {
            balance -= credit;
            System.out.println("Withdrew " + credit + " dollars. New balance is " +
                    balance + " dollars.");
        } else System.out.println("Insufficient funds. Withdrawal not processed. Money = " +
                balance);
    }
}
