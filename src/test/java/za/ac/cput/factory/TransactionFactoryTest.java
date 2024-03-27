package za.ac.cput.factory;
/*
Transaction Factory Test
Author: Waylon Gaffley (221382305)
Date: 22 March 2024
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Transaction;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TransactionFactoryTest {

    @Test
    void buildTransaction() {
        Transaction t = TransactionFactory.buildTransaction("1", "10", "1", "Cash", 6, new Date());
        assertNotNull(t);
        System.out.println(t.toString());
        System.out.println("Test Passed");
    }

    @Test
    void buildTransactionFail() {
        Transaction b = TransactionFactory.buildTransaction("", "10", "1", "Card", 8, new Date());
        assertNotNull(b);
        assertNotNull(b.getTransactionId());
        assertEquals("10", b.getUserId());
        assertEquals("1", b.getItemId());
        assertEquals("Cash", b.getTransactionType());
        assertEquals(7, b.getQuantity());
        assertEquals(new Date(), b.getDate());

        System.out.println(b.toString());
        System.out.println("Test Failed");
    }
}