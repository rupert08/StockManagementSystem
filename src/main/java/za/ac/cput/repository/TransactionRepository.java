package za.ac.cput.repository;
/*
Transaction Class Repository
Author: Waylon Gaffley (221382305)
Date: 22 March 2024
 */
import za.ac.cput.domain.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository implements ITransactionRepository {
    private static ITransactionRepository repository = null;
    private List<Transaction> transactionList;

    private TransactionRepository() {
        transactionList = new ArrayList<Transaction>();
    }

    public static ITransactionRepository getRepository() {
        if (repository == null) {
            repository = new TransactionRepository();
        }
        return  repository;
    }

    @Override
    public Transaction create(Transaction transaction) {
        boolean success = transactionList.add(transaction);
        if (success) {
            return transaction;
        } else
            return null;
    }

    @Override
    public Transaction read(String id) {
        for (Transaction a : transactionList) {
            if (a.getTransactionId().equals(id))
                return a;
        }
        return null;
    }

    @Override
    public Transaction update(Transaction transaction) {
        String transactionId = transaction.getTransactionId();
        Transaction existingTransaction = read(transactionId);
        if (existingTransaction != null) {
            transactionList.remove(existingTransaction);
            transactionList.add(transaction);
            return transaction;
        }
        return null;
    }

    public boolean delete(String id) {
        Transaction deletedTransaction = read(id);
        if (deletedTransaction == null)
            return false;

        return (transactionList.remove(deletedTransaction));
    }

    @Override
    public List<Transaction> getAll() {
        return transactionList;
    }

}
