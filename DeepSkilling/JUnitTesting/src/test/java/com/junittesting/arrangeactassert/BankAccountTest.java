package com.junittesting.arrangeactassert;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(10_000);
    }

    @After
    public void tearDow() {
        account = null;
    }

    @Test
    public void testDeposit() {

        //Arrange : things we need to set up(here, we need an account)
        double amount = 5_000;

        //Act : What we are testing on
        account.deposit(amount);

        //Assert : Check for expected result
        Assert.assertEquals(15_000, account.getBalance(),0.0);
    }
}
