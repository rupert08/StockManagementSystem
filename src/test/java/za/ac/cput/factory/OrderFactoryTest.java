/* OrderFactoryTest.java
OrderFactoryTest class
Author: M.Tashreeq (220205663)
Date: 23 March 2024
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Order;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class OrderFactoryTest {

    @Test
    void testCreateOrder() {
        // Arrange
        String orderId = "123";
        Date date = new Date(); // Current date
        String status = "Pending";
        String itemList = "item1,item2";
        String supplierId = "456";

        // Act
        Order order = OrderFactory.createOrder(orderId, date, status, itemList, supplierId);

        // Assert
        assertNotNull(order, "Order should not be null");
        assertEquals(orderId, order.getOrderId(), "Order ID should match");
        assertEquals(date, order.getDate(), "Order date should match");
        assertEquals(status, order.getStatus(), "Order status should match");
        assertEquals(itemList, order.getItemList(), "Order item list should match");
        assertEquals(supplierId, order.getSupplierId(), "Supplier ID should match");
    }

    @Test
    void testCreateOrderWithInvalidData() {
        // Arrange
        String orderId = ""; // Empty order ID
        Date date = null; // Null date
        String status = "Pending";
        String itemList = "item1,item2";
        String supplierId = "456";

        // Act
        Order order = OrderFactory.createOrder(orderId, date, status, itemList, supplierId);

        // Assert
        assertNull(order, "Order should be null for invalid data");
    }
}