/* StockManagementSystem.java
StockItem model class
Author: Rupert Van Niekerk (222894237)
Date: 22 March 2024
*/
package za.ac.cput.domain;

import java.util.Date;

public class StockItem {
    private int itemID;
    private String name;
    private String description;
    private String category;
    private int quantity;
    private String location;
    private Date purchaseDate;
    private String supplier;
    private double cost;
    private String condition;

    // Private constructor
    private StockItem() {
    }

    // Constructor with Builder
    private StockItem(Builder builder) {
        this.itemID = builder.itemID;
        this.name = builder.name;
        this.description = builder.description;
        this.category = builder.category;
        this.quantity = builder.quantity;
        this.location = builder.location;
        this.purchaseDate = builder.purchaseDate;
        this.supplier = builder.supplier;
        this.cost = builder.cost;
        this.condition = builder.condition;
    }

    // Getters
    public int getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLocation() {
        return location;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getCost() {
        return cost;
    }

    public String getCondition() {
        return condition;
    }

    // Builder class
    public static class Builder {
        private int itemID;
        private String name;
        private String description;
        private String category;
        private int quantity;
        private String location;
        private Date purchaseDate;
        private String supplier;
        private double cost;
        private String condition;

        // Setter methods
        public Builder setItemID(int itemID) {
            this.itemID = itemID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setPurchaseDate(Date purchaseDate) {
            this.purchaseDate = purchaseDate;
            return this;
        }

        public Builder setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }

        public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public Builder setCondition(String condition) {
            this.condition = condition;
            return this;
        }

        // Build method
        public StockItem build() {
            return new StockItem(this);
        }
    }

    // Override toString method
    @Override
    public String toString() {
        return "StockItem{" +
                "itemID=" + itemID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", location='" + location + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", supplier='" + supplier + '\'' +
                ", cost=" + cost +
                ", condition='" + condition + '\'' +
                '}';
    }
}

