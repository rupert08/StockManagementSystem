package za.ac.cput.domain;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Inventory;
import za.ac.cput.domain.factory.InventoryFactory;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryFactoryTest {

    @Test
    void testBuildInventory() {
        String inventoryId = "123";
        String name = "Test Inventory";
        String location = "Test Location";
        String stockItemId = "456";

        Inventory inventory = InventoryFactory.buildInvertory(inventoryId, name, location, stockItemId);

        assertNotNull(inventory);
        assertEquals(inventoryId, inventory.getInventoryId());
        assertEquals(name, inventory.getName());
        assertEquals(location, inventory.getLocation());
        assertEquals(stockItemId, inventory.getStockItemId());
    }
}
