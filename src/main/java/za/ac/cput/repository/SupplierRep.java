/* StockManagementSystem.java
This is my repository Repository class
Author: Lakhikhaya Mpumlwana (220204594)
Date: 25 March 2024
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Supplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SupplierRep implements SupplierRepository {

    private final Map<String, Supplier> supplierDatabase;

    public SupplierRep() {
        this.supplierDatabase = new HashMap<>();
    }

    @Override
    public Supplier save(Supplier entity) {
        supplierDatabase.put(entity.getSupplierId(), entity);
        return entity;
    }

    @Override
    public Supplier findById(String id) {

        return supplierDatabase.get(id);
    }

    @Override
    public List<Supplier> findAll() {
        return new ArrayList<>(supplierDatabase.values());
    }


    @Override
    public Supplier update(Supplier entity) {
        return supplierDatabase.put(entity.getSupplierId(), entity);
    }

    @Override
    public boolean delete(String id) {
        return supplierDatabase.remove(id) != null;
    }
}
