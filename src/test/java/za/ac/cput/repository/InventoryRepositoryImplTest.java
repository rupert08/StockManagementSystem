package za.ac.cput.repository;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Inventory;
//import za.ac.cput.repositoryInterface.InventoryRepository;

import java.util.List;

public class InventoryRepositoryImplTest {

    private InventoryRepository inventoryRepository;

    @BeforeEach
    void setUp() {
        inventoryRepository = new InventoryRepositoryImpl();
    }

    @Test
    void testSave() {
        Inventory inventory = new Inventory.Builder()
                .setInventoryId("1")
                .setName("Test Inventory")
                .setLocation("Test Location")
                .setStockItemId("123")
                .build();

        Inventory savedInventory = inventoryRepository.save(inventory);
        assertNotNull(savedInventory);
        assertEquals("1", savedInventory.getInventoryId());
    }

    @Test
    void testFindById() {
        Inventory inventory = new Inventory.Builder()
                .setInventoryId("1")
                .setName("Test Inventory")
                .setLocation("Test Location")
                .setStockItemId("123")
                .build();

        inventoryRepository.save(inventory);
        Inventory foundInventory = inventoryRepository.findById("1");
        assertNotNull(foundInventory);
        assertEquals("Test Inventory", foundInventory.getName());
    }

    @Test
    void testFindAll() {
        inventoryRepository.save(new Inventory.Builder().setInventoryId("1").setName("Inventory 1").build());
        inventoryRepository.save(new Inventory.Builder().setInventoryId("2").setName("Inventory 2").build());

        List<Inventory> inventories = inventoryRepository.findAll();
        assertNotNull(inventories);
        assertEquals(2, inventories.size());
    }

    @Test
    void testUpdate() {
        Inventory inventory = new Inventory.Builder()
                .setInventoryId("1")
                .setName("Test Inventory")
                .setLocation("Test Location")
                .setStockItemId("123")
                .build();

        inventoryRepository.save(inventory);

        inventory.setName("Updated Inventory");
        Inventory updatedInventory = inventoryRepository.update(inventory);
        assertNotNull(updatedInventory);
        assertEquals("Updated Inventory", updatedInventory.getName());
    }

    @Test
    void testDeleteById() {
        Inventory inventory = new Inventory.Builder()
                .setInventoryId("1")
                .setName("Test Inventory")
                .setLocation("Test Location")
                .setStockItemId("123")
                .build();

        inventoryRepository.save(inventory);
        inventoryRepository.deleteById("1");
        assertNull(inventoryRepository.findById("1"));
    }
}
