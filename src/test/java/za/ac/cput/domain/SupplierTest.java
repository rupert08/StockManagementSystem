/* StockManagementSystem.java
This is my Supplier Test
Author: Lakhikhaya Mpumlwana (220204594)
Date: 25 March 2024
*/

package za.ac.cput.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Supplier;

import static org.junit.jupiter.api.Assertions.*;


public class SupplierTest {

    @Test
    void testObjectEquality() {
        Supplier supplier1 = new Supplier.Builder("S123")
                .name("Lucky Supplier")
                .contactInfo("123-456-7890")
                .build();

        Supplier supplier2 = new Supplier.Builder("S123")
                .name("Lucky Supplier")
                .contactInfo("123-456-7890")
                .build();

        assertEquals(supplier1, supplier2);
    }

    @Test
    void testObjectIdentity() {
        Supplier supplier1 = new Supplier.Builder("S123")
                .name("Lucky Supplier")
                .contactInfo("123-456-7890")
                .build();

        Supplier supplier2 = supplier1;

        assertSame(supplier1, supplier2);
    }

    @Test
    void testFailingTest() {
        Supplier supplier = new Supplier.Builder("S123")
                .name("Lucky Supplier")
                .contactInfo("123-456-7890")
                .build();

        // Intentionally failing the test
        Assertions.assertEquals("Lucky Supplier", supplier.getName());
    }

    @Test
    void testTimeoutAssertion() {
        assertTimeoutPreemptively(
                java.time.Duration.ofMillis(100),
                () -> {
                    Supplier supplier = new Supplier.Builder("S123")
                            .name("Lucky Supplier")
                            .contactInfo("123-456-7890")
                            .build();
                    // Simulating some time-consuming operation
                    Thread.sleep(50);
                }
        );
    }

    @Disabled("Disabled for demonstration purposes")
    @Test
    void testDisabledTest() {
        // Test logic that is currently disabled
    }
}
