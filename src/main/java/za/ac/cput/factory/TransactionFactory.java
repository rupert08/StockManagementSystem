package za.ac.cput.factory;

import za.ac.cput.domain.Transaction;

import java.util.Date;

/*
Transaction Factory
Author: Waylon Gaffley (221382305)
Date: 22 March 2024
 */
public class TransactionFactory {
    public static Transaction buildTransaction(String transactionId, String userId, String itemId,
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
