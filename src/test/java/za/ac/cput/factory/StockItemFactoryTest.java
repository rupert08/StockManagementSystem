package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StockItem;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class StockItemFactoryTest {

    @Test
    public void testCreateStockItem() {
        StockItem item = StockItemFactory.createStockItem(
               1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");

        assertNotNull(item, "StockItem should not be null");
        assertEquals(1, item.getItemID(), "ItemID should match");
        assertEquals("Laptop", item.getName(), "Name should match");
        assertEquals("Powerful laptop", item.getDescription(), "Description should match");
        assertEquals("Electronics", item.getCategory(), "Category should match");
        assertEquals(5, item.getQuantity(), "Quantity should match");
        assertEquals("Office", item.getLocation(), "Location should match");
        assertNotNull(item.getPurchaseDate(), "PurchaseDate should not be null");
        assertEquals("TechSupplier", item.getSupplier(), "Supplier should match");
        assertEquals(1500.0, item.getCost(), 0.001, "Cost should match");
        assertEquals("New", item.getCondition(), "Condition should match");

        //System.out.println(item.toString());
        System.out.println("StockItemFactory Test Passed");
    }
}
