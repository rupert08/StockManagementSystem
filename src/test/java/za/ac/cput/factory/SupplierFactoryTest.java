/* StockManagementSystem.java
This is my Supplier Factory Test
Author: Lakhikhaya Mpumlwana (220204594)
Date: 25 March 2024
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SupplierFactoryTest {

    private Supplier supplier;

    @BeforeEach
    void setUp() {

        supplier = SupplierFactory.createSupplier("S123", "Lucky Supplier", "123-456-7890");
    }

    @AfterEach
    void tearDown() {

        supplier = null;
    }

    @Test
    void testCreateSupplier() {

        assertNotNull(supplier);

        assertEquals("S123", supplier.getSupplierId());
        assertEquals("Lucky Supplier", supplier.getName());
        assertEquals("123-456-7890", supplier.getContactInfo());
    }
}