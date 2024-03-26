/* StockItemFactoryTest.java
StockItemFactoryTest class
Author: Rupert Van Niekerk (222894237)
Date: 23 March 2024
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StockItem;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StockItemFactoryTest {

    @Test
    void testObjectEquality() {
        StockItem item1 = StockItemFactory.createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        StockItem item2 = StockItemFactory.createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");

        assertEquals(item1.toString(), item2.toString(), "Objects should be equal");
        System.out.println("Object Equality Test Passed");
    }

    @Test
    void testObjectIdentity() {
        StockItem item1 = StockItemFactory.createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        StockItem item2 = item1;

        assertSame(item1, item2, "Objects should be the same");
        System.out.println("Object Identity Test Passed");
    }

    @Test
    void testFailingTest() {
        System.out.println("Failing Test Executed");
        fail("This test intentionally fails");
    }

    @Test
    void testTimeout() {
        assertTimeoutPreemptively(
                java.time.Duration.ofMillis(100),
                () -> {
                    // Simulate a time-consuming operation
                    Thread.sleep(50);
                },
                "Operation took longer than expected"
        );
        System.out.println("Timeout Test Passed");
    }

    @Test
    @Disabled
    void testDisabledTest() {
        System.out.println("Disabled Test Executed");
    }
    @Test
    void testNotNull() {
        StockItem item = StockItemFactory.createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        assertNotNull(item, "Created item should not be null");
        System.out.println("Not Null Test Passed");
    }

}
