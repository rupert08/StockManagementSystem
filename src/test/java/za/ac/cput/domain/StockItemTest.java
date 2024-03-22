package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class StockItemTest {

    @Test
    public void testStockItemEquality() {
        StockItem item1 = new StockItem.Builder()
                .setItemID(1)
                .setName("Laptop")
                .setDescription("Powerful laptop")
                .setCategory("Electronics")
                .setQuantity(5)
                .setLocation("Office")
                .setPurchaseDate(new Date())
                .setSupplier("TechSupplier")
                .setCost(1500.0)
                .setCondition("New")
                .build();

        StockItem item2;
        item2 = item1;

        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);

        assertEquals(item1, item2, "Objects should be equal");
        System.out.println("*StockItem Equality Test Passed*");
    }

    @Test
    public void testStockItemIdentity() {
        StockItem.Builder itemBuilder = new StockItem.Builder()
                .setItemID(1)
                .setName("Laptop")
                .setDescription("Powerful laptop")
                .setCategory("Electronics")
                .setQuantity(5)
                .setLocation("Office")
                .setPurchaseDate(new Date())
                .setSupplier("TechSupplier")
                .setCost(1500.0)
                .setCondition("New");

        StockItem item1 = itemBuilder.build();
        StockItem item2;
        item2 = item1;

        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);

        assertSame(item1, item2, "Objects should be the same");
        System.out.println("*StockItem Identity Test Passed*");
    }

    @Test
    public void testFailingTest() {
        System.out.println("*Failing Test Executed*");
        fail("*This test intentionally fails*");
    }

    @Test
    public void testTimeout() {
        assertTimeoutPreemptively(
                java.time.Duration.ofMillis(100),
                () -> {
                    // Simulate a time-consuming operation
                    Thread.sleep(50);
                },
                "Operation took longer than expected"
        );
        System.out.println("*Timeout Test Passed*");
    }

    @Test
    @Disabled
    public void testDisabledTest() {
        System.out.println("Disabled Test Executed");
    }
}
