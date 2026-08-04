package session01;

/*
    * Study/Coding Session 2.1 (Module 02) - Classes, Objects, and the OOP Paradigm
    * Pratical problem: Create a BankAccount class with the following attributes: account number, account holder, and balance. Create a constructor and a displayData() method. In the main method, instantiate two different accounts and display their data.
    * 
    * Applied concepts:
    * - What is a programming paradigm and why does OOP exist;
    * - Class as template / Object as instance;
    * - Attributes (object state) and Methods (object behavior);
    * - Constructors: the special method that creates the object;
    * - The word ´this´: referencing the object itself;
    * - new: creating instances in heap memory.
*/

public class BankAccount {

    // Attributes — object state
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor — special method called with "new"
    // "this" refers to the object itself, differentiating attribute from parameter
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method — object behavior
    void displayData() {
        System.out.println("=== BANK ACCOUNT ===");
        System.out.println("Number  : " + this.accountNumber);
        System.out.println("Account Holder : " + this.accountHolder);
        System.out.printf("Balance   : $ %.2f%n", this.balance);
    }
}
