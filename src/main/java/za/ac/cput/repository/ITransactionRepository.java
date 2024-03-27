package za.ac.cput.repository;
/*
Transaction Interface Repository
Author: Waylon Gaffley (221382305)
Date: 22 March 2024
 */

import za.ac.cput.domain.Transaction;

import java.util.List;

public interface ITransactionRepository extends IRepository<Transaction, String>{
    List<Transaction> getAll();
}
