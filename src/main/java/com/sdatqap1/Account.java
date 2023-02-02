package com.sdatqap1;

public class Account {
    // Create a class Account with the following fields:
    // id (int), name (String), balance (double)
    private String id;
    private String name;
    private double balance;
    // Create a constructor that takes id and name as parameters and initialize balance to 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    // Create a constructor that takes id, name and balance as parameters
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // Create a getter for id
    public String getID() {
        return this.id;
    }
    // Create a getter for name
    public String getName() {
        return this.name;
    }
    // Create a getter for balance
    public double getBalance() {
        return this.balance;
    }
    // Create a method credit that takes an amount as parameter and adds it to the balance
    public double credit(double amount) {
        this.balance += amount;
        return this.balance;
    }
    // Create a method debit that takes an amount as parameter and subtracts it from the balance
    public double debit(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return this.balance;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
            return this.balance;
        }
    }
    // Create a method transferTo that takes another account and an amount as parameters,
    // and subtracts the amount from this account and adds it to the other account
    public double transferTo(Account another, double amount) {
        if (this.balance >= amount) {
            this.debit(amount);
            another.credit(amount);
            return this.balance;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
            return this.balance;
        }
    }
    // Override the toString method to return a string in the following format:
    public String toString() {
        return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
    }
}
