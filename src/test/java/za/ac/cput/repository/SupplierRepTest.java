/* StockManagementSystem.java
This is my Supplier Repository Test
Author: Lakhikhaya Mpumlwana (220204594)
Date: 25 March 2024
*/
package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Supplier;
import static org.junit.jupiter.api.Assertions.*;

class SupplierRepTest {

    private SupplierRepository supplierRepository;

    @BeforeEach
    void setUp() {

        supplierRepository = new SupplierRep();
    }

    @Test
    void save_ShouldSaveSupplier() {

        Supplier supplier = new Supplier("S123", "Supplier A", "123-456-7890");

        Supplier savedSupplier = supplierRepository.save(supplier);

        assertNotNull(savedSupplier);

    }


}
