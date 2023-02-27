package Section_7_OOP_Part_1_Inheritance.CodingExercise_30_to_37.Ex_31_Person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
           this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        int fullName = Math.max((firstName.isEmpty() ? 0 : 1) + (lastName.isEmpty() ? 0 : 2), 0);
        if (fullName == 0) {
            return "";
        } else if (fullName == 1) {
            return firstName;
        } else if (fullName == 2) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }

//    Second Version:
    
//    public String getFullName() {
//        if (firstName.isEmpty() && lastName.isEmpty()) {
//            return "";
//        } else if (lastName.isEmpty()) {
//            return firstName;
//        } else if (firstName.isEmpty()) {
//            return lastName;
//        } else{
//            return firstName + " " + lastName;
//        }
//    }

}
