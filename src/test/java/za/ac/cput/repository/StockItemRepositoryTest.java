package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StockItem;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class StockItemRepositoryTest {

    private StockItemRepository repository;

    @BeforeEach
    void setUp() {
        repository = new StockItemRepository();
    }

    @Test
    void testAddStockItem() {
        StockItem item = createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        repository.add(item);
        assertEquals(1, repository.getAll().size(), "Repository should contain one item after addition");
        assertTrue(repository.getAll().contains(item), "Repository should contain the added item");
        System.out.println("Add StockItem Test Passed");
    }

    @Test
    void testGetStockItemById() {
        int itemId = 1; // Dynamic itemId
        StockItem item = createStockItem(itemId, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        repository.add(item);
        StockItem retrievedItem = repository.getById(itemId);
        assertNotNull(retrievedItem, "Retrieved item should not be null");
        assertEquals(item, retrievedItem, "Retrieved item should match the added item");
        System.out.println("Get StockItem by ID Test Passed");
    }

    @Test
    void testUpdateStockItem() {
        int itemId = 1; // Dynamic itemId
        StockItem item = createStockItem(itemId, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        repository.add(item);

        StockItem updatedItem = createStockItem(itemId, "Updated Laptop", "Updated powerful laptop", "Electronics", 10, "New Office", new Date(), "Updated TechSupplier", 2000.0, "Used");
        repository.update(updatedItem);

        StockItem retrievedItem = repository.getById(itemId);
        assertEquals(updatedItem, retrievedItem, "Retrieved updated item should match the updated item");
        System.out.println("Update StockItem Test Passed");
    }

    @Test
    void testDeleteStockItem() {
        int itemId = 1; // Dynamic itemId
        StockItem item = createStockItem(itemId, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        repository.add(item);

        assertTrue(repository.delete(itemId), "Deletion should be successful");
        assertEquals(0, repository.getAll().size(), "Repository should be empty after deletion");
        System.out.println("Delete StockItem Test Passed");
    }

    private StockItem createStockItem(int itemId, String name, String description, String category, int quantity,
                                      String location, Date purchaseDate, String supplier, double cost, String condition) {
        return new StockItem.Builder()
                .setItemID(itemId)
                .setName(name)
                .setDescription(description)
                .setCategory(category)
                .setQuantity(quantity)
                .setLocation(location)
                .setPurchaseDate(purchaseDate)
                .setSupplier(supplier)
                .setCost(cost)
                .setCondition(condition)
                .build();
    }
}

