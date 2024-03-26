/* StockItemRepositoryTest.java
StockItemRepositoryTest class
Author: Rupert Van Niekerk (222894237)
Date: 25 March 2024
*/package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StockItem;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StockItemRepositoryTest {

    private StockItemRepository repository;

    @BeforeEach
    void setUp() {
        repository = new StockItemRepository();
    }

    @Test
    void testCreate() {
        StockItem item = createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        assertNotNull(repository.create(item), "Item should be created successfully");
        assertEquals(1, repository.getAll().size(), "Repository should contain one item after creation");
        assertTrue(repository.getAll().contains(item), "Repository should contain the created item");
        System.out.println("Create Test Passed");
    }

    @Test
    void testRead() {
        StockItem item = createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        repository.create(item);
        assertNotNull(repository.read(1), "Retrieved item should not be null");
        assertEquals(item, repository.read(1), "Retrieved item should match the created item");
        System.out.println("Read Test Passed");
    }

    @Test
    void testUpdate() {
        StockItem item = createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        repository.create(item);
        StockItem updatedItem = createStockItem(1, "Updated Laptop", "Updated powerful laptop", "Electronics", 10, "New Office", new Date(), "Updated TechSupplier", 2000.0, "Used");
        assertNotNull(repository.update(updatedItem), "Updated item should not be null");
        assertEquals(updatedItem, repository.read(1), "Retrieved updated item should match the updated item");
        System.out.println("Update Test Passed");
    }

    @Test
    void testDelete() {
        StockItem item = createStockItem(1, "Laptop", "Powerful laptop", "Electronics", 5, "Office", new Date(), "TechSupplier", 1500.0, "New");
        repository.create(item);
        assertTrue(repository.delete(1), "Deletion should be successful");
        assertEquals(0, repository.getAll().size(), "Repository should be empty after deletion");
        System.out.println("Delete Test Passed");
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
