/* OrderRepositoryTest.java
OrderRepositoryTest class
Author: M.Tashreeq (220205663)
Date: 23 March 2024
*/
package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Order;
import za.ac.cput.factory.OrderFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class OrderRepositoryTest {

    private OrderRepository repository;

    @BeforeEach
    void setUp() {
        repository = new OrderRepository();
    }

    @Test
    void testCreate() {
        Date date = new Date();
        Order order = OrderFactory.createOrder("123", date, "Pending", "item1,item2", "456");
        assertNotNull(repository.create(order), "Order should be created successfully");
        assertEquals(1, repository.getAll().size(), "Repository should contain one order after creation");
        assertTrue(repository.getAll().contains(order), "Repository should contain the created order");
    }


    @Test
    void testRead() {
        Date date = new Date();
        Order order = new Order.Builder()
                .setOrderId("123")
                .setDate(date)
                .setStatus("Pending")
                .setItemList("item1,item2")
                .setSupplierId("456")
                .build();

        repository.create(order);

        Order retrievedOrder = repository.read("123");
        assertNotNull(retrievedOrder, "Retrieved order should not be null");
        assertEquals(order, retrievedOrder, "Retrieved order should match the created order");
    }

    @Test
    void testUpdate() {
        Date date = new Date();
        Order order = new Order.Builder()
                .setOrderId("123")
                .setDate(date)
                .setStatus("Pending")
                .setItemList("item1,item2")
                .setSupplierId("456")
                .build();

        repository.create(order);

        order.setStatus("Completed");
        repository.update(order);

        Order updatedOrder = repository.read("123");
        assertNotNull(updatedOrder, "Updated order should not be null");
        assertEquals("Completed", updatedOrder.getStatus(), "Order status should be updated");
    }

    @Test
    void testDelete() {
        Date date = new Date();
        Order order = new Order.Builder()
                .setOrderId("123")
                .setDate(date)
                .setStatus("Pending")
                .setItemList("item1,item2")
                .setSupplierId("456")
                .build();

        repository.create(order);

        assertTrue(repository.delete("123"), "Order should be deleted successfully");
        assertNull(repository.read("123"), "Deleted order should not be found");
    }
}
