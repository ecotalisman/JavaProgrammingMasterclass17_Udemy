package Section_7_OOP_Part_1_Inheritance.Lesson_79_ClassesChallenge;

public class Main {
    public static void main(String[] args) {

//         Account accountOne = new Account();
//         accountOne.setNumber(1);
//         accountOne.setBalance(1000);
//         accountOne.setName("Test1");
//         accountOne.setName("Test1@gmail.com");
//         accountOne.setName("3807775500");
//
//         accountOne.depositMoney(500);
//         accountOne.creditMoney(120.50);
//         accountOne.creditMoney(1400);


//        Account_TimBuchalka bobsAccount = new Account_TimBuchalka("12345", 500.00,
//                "Bob Brown", "myemail@bob.com",
//                "(087) 123-4567");

        Account_TimBuchalka bobsAccount = new Account_TimBuchalka();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        Account_TimBuchalka timsAccount = new Account_TimBuchalka("Tim",
                "tim@email.com", "12345");
        System.out.println("AccountNo:" + timsAccount.getNumber() +
                "; name " + timsAccount.getCustomerName());
    }
}

/*

Create a new class for a bank account. Create fields for account characteristics like:
account number;
account balance;
customer name;
email;
and phone number

Create getters and setters for each field.

Create two additional methods:
- one for depositing funds into the account;
- and one for withdrawing funds from the account

A customer should not be allowed to withdraw funds,
if that withdrawal takes their balance negative. Create a new project called ClassesChallenge, with
the usual Main class with the usual main method. You'll create an instance of an Account class,
and then test your withdrawal and deposit methods. You'll print information to the console,
that confirms what the balance is after the methods are called.

So, the challenge here is to create the Bank Account Blueprint, that has five instance fields.
You want to make this class encapsulated, so you'll make all your attributes private,
and set up getter and setter methods for your attributes.

In addition, you'll have two behavioral methods, for depositing funds, and withdrawing funds.

In addition to this class, you'll set up a Main class, with a main method,
that creates at least one instance of the Bank Account class, and simulates depositing and
withdrawing money from the account. And you may also want to add some
System.out.println statements, to the two methods above as well, to confirm

how much was deposited or withdrawn.

**************************************TRANSLATE TO UKRAINIAN**************************************************

Створити новий клас для банківського рахунку. Створіть поля для характеристик рахунку, таких як:
номер рахунку;
баланс рахунку;
ім'я клієнта;
електронна пошта;
та номер телефону.

Створіть методи-геттери та методи-сеттери для кожного поля.

Створіть два додаткових методи:
для внесення грошей на рахунок;
та для зняття грошей з рахунку.

Клієнту не слід дозволяти знімати гроші, якщо це зняття призведе до від'ємного балансу.

Створіть новий проект з назвою "ClassesChallenge", звичайний Main клас зі звичайним методом main.

Ви створите екземпляр класу Account, а потім протестуєте свої методи зняття та внесення грошей.
Ви виведете інформацію в консоль, яка підтверджує баланс після виклику методів.

Отже, викликання полягає в створенні Банківського Аккаунту, який має п'ять полів екземпляру.
Ви хочете зробити цей клас інкапсульованим, тому ви зробите всі свої атрибути приватними
та налаштуєте методи-геттери та методи-сеттери для атрибутів.

Крім того, у вас є два методи поведінки для внесення грошей та зняття грошей.

Крім цього класу, ви налаштуєте головний клас з головним методом,
який створює принаймні один екземпляр класу Банківський Аккаунт і імітує внесення та
зняття грошей з рахунку. Вам також може знадобитися додати деякі
оператори System.out.println до двох методів вище, щоб підтвердити,
скільки грошей було внесено або знято.

*/