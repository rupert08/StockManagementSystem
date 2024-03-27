/* OrderRepository.java
OrderFactoryTest class
Author: M.Tashreeq (220205663)
Date: 22 March 2024
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderRepository implements IRepository<Order, String>   {
    private List<Order> orders;

    public OrderRepository() {
        orders = new ArrayList<>();
    }

    @Override
    public Order create(Order order) {
        orders.add(order);
        return order;
    }

    @Override
    public Order read(String orderId) {
        for (Order order : orders) {
            if (Objects.equals(order.getOrderId(), orderId)) {
                return order;
            }
        }
        return null;
    }

    @Override
    public Order update(Order order) {
        String orderId = order.getOrderId();
        Order existingOrder = read(orderId);
        if (existingOrder != null) {
            orders.remove(existingOrder);
            orders.add(order);
            return order;
        }
        return null;
    }

    @Override
    public boolean delete(String orderId) {
        Order orderToDelete = read(orderId);
        if (orderToDelete == null)
            return false;
        return orders.remove(orderToDelete);
    }

    public List<Order> getAll() {
        return new ArrayList<>(orders);
    }
}