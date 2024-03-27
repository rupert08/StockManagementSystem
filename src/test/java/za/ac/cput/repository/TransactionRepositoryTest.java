package za.ac.cput.repository;
/*
Transaction Repository Test
Author: Waylon Gaffley (221382305)
Date: 22 March 2024
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Transaction;
import za.ac.cput.factory.TransactionFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class TransactionRepositoryTest {
    private static ITransactionRepository repository = TransactionRepository.getRepository();
    private Transaction transaction1 = TransactionFactory.buildTransaction("10", "10", "11", "Cash", 10, new Date());
    private Transaction transaction2 = TransactionFactory.buildTransaction("20", "20", "1", "Card", 5, new Date());

    @Test
    @Order(1)
    void create() {
        Transaction created = repository.create(transaction1);
        assertNotNull(created);
        System.out.println(created);
        System.out.println("New Transaction Created Test Passed!");
    }

    @Test
    @Order(2)
    void read() {
        String transactionID = "20";
        Transaction read = repository.read(transactionID);
        assertNotEquals(read, transaction2);
        System.out.println("\nRead Test Passed" + "\n");
    }

    @Test
    @Order(4)
    void update() {
        String transactionId = "1"; // Dynamic userId
        Transaction transaction = createTransaction(transactionId, "1", "2", "Card", 5, new Date());
        repository.create(transaction);

        Transaction updatedTransaction = createTransaction(transactionId, "1", "2", "Online Purchase", 5, new Date());
        repository.update(updatedTransaction);

        Transaction retrievedTransaction = repository.read(transactionId);
        assertNotNull(transactionId);
        assertEquals(updatedTransaction, repository.read("1"));
        System.out.println("\nOriginal Transaction -->" + transaction);
        System.out.println("\nUpdated Transaction -->" + updatedTransaction);
        System.out.println("Update Transaction Test Passed");
    }

    @Test
    @Order(5)
    void delete() {
        assertTrue(repository.delete(transaction1.getTransactionId()));
        System.out.println("\nSuccessfully Deleted Transaction Record");
    }

    @Test
    @Order(3)
    void getAll() {
        System.out.println(repository.getAll());
    }

    private Transaction createTransaction(String transactionId, String userId, String itemId,
                                          String transactionType, int quantity, Date date) {

        return new Transaction.Builder().setTransactionId(transactionId)
                .setUserId(userId)
                .setItemId(itemId)
                .setTransactionType(transactionType)
                .setQuantity(quantity)
                .setDate(date)
                .build();
    }
}