/* OrderFactory.java
OrderFactory class
Author: M.Tashreeq (220205663)
Date: 22 March 2024
*/
package za.ac.cput.factory;

import za.ac.cput.domain.Order;

import java.util.Date;

public class OrderFactory {
    public static Order createOrder(String orderId, Date date, String status, String itemList, String supplierId) {
        return new Order.Builder()
                .setOrderId(orderId)
                .setDate(date)
                .setStatus(status)
                .setItemList(itemList)
                .setSupplierId(supplierId)
                .build();
    }
}