/* StockManagementSystem.java
This is my SupplierRepository interface
Author: Lakhikhaya Mpumlwana (220204594)
Date: 25 March 2024
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Supplier;

import java.util.List;

public interface SupplierRepository {
    Supplier save(Supplier entity);
    Supplier findById(String id);
    List<Supplier> findAll();
    Supplier update(Supplier entity);
    boolean delete(String id);
}
