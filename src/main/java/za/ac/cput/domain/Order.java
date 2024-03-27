/* Order.java
Order class
Author: M.Tashreeq (220205663)
Date: 21 March 2024
*/
package za.ac.cput.domain;

import java.util.Date;

public class Order {
    private String orderId;
    private Date date;
    private String status;
    private String itemList;
    private String supplierId;

    public Order(Builder builder) {
        this.orderId = builder.orderId;
        this.date = builder.date;
        this.status = builder.status;
        this.itemList = builder.itemList;
        this.supplierId = builder.supplierId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getItemList() {
        return itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", itemList='" + itemList + '\'' +
                ", supplierId='" + supplierId + '\'' +
                '}';
    }

    public static class Builder{
        private String orderId;
        private Date date;
        private String status;
        private String itemList;
        private String supplierId;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setItemList(String itemList) {
            this.itemList = itemList;
            return this;
        }

        public Builder setSupplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        public Builder copy(Order order) {
            this.orderId = order.orderId;
            this.date = order.date;
            this.status = order.status;
            this.itemList = order.itemList;
            this.supplierId = order.supplierId;
            return this;
        }

        public Order build(){return new Order(this);}
    }
}
