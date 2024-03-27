/* IOrderRepository.java
IOrderRepository class
Author: M.Tashreeq (220205663)
Date: 23 March 2024
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Order;

import java.util.List;

public interface IOrderRepository extends IRepository<Order, String> {
    Order read(String orderId);
    List<Order> getAll();
}