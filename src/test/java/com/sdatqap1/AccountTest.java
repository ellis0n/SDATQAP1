package com.sdatqap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testCredit() {
        Account account = new Account("709", "Salty Dan");
        account.credit(100.0);
        double expected = 100.0;
        double actual = account.getBalance();
        assertEquals(expected, actual);
        System.out.println("Test credit() passed");
    }

    @Test
    void testDebit() {
        Account account = new Account("709", "Salty Dan", 100.0);
        account.debit(50.0);
        double expected = 50.0;
        double actual = account.getBalance();
        assertEquals(expected, actual);
        System.out.println("Test debit() passed");
    }

    @Test
    void testInsufficientDebit(){
        Account account = new Account("709", "Salty Dan", 0.0);
        account.debit(100.0);
        double expected = 0.0;
        double actual = account.getBalance();
        assertEquals(expected, actual);
        System.out.println("Test insufficient debit() passed");
    }

    @Test
    void transferTo() {
        Account account1 = new Account("710", "Joe Batt", 200.0);
        Account account2 = new Account("711", "Gambo Don", 0.0);
        account1.transferTo(account2, 100.0);
        double expected = 100.0;
        double actual1 = account1.getBalance();
        double actual2 = account2.getBalance();
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }

    @Test
    void testInsufficientTransferTo() {
        Account account1 = new Account("712", "Donnie Dumphey", 0.0);
        Account account2 = new Account("713", "Hobo Bill", 200.0);
        account1.transferTo(account2, 200.0);
        double expected1 = 0.0;
        double expected2 = 200.00;
        double actual1 = account1.getBalance();
        double actual2 = account2.getBalance();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}