package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

/*
Transaction POJO
Author: Waylon Gaffley (221382305)
Date: 22 March 2024
 */
public class Transaction {
    private String transactionId;
    private String userId;
    private String itemId;
    private String transactionType;
    private int quantity;
    private Date date;

    private Transaction() {
    }

    private Transaction(Builder builder) {
        this.transactionId = builder.transactionId;
        this.userId = builder.userId;
        this.itemId = builder.itemId;
        this.transactionType = builder.transactionType;
        this.quantity = builder.quantity;
        this.date = builder.date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "TRANSACTION:" +
                "\nTransaction ID: " + transactionId +
                "\nUser ID: " + userId +
                "\nItem ID: " + itemId +
                "\nTransaction Type: " + transactionType  +
                "\nQuantity: " + quantity +
                "\nDate: " + date;
    }

    public static class Builder {
        private String transactionId;
        private String userId;
        private String itemId;
        private String transactionType;
        private int quantity;
        private Date date;

        public Builder setTransactionId(String transactionId){
            this.transactionId = transactionId;
            return this;
        }
        public Builder setUserId(String userId){
            this.userId = userId;
            return this;
        }
        public Builder setItemId(String itemId){
            this.itemId = itemId;
            return this;
        }
        public Builder setTransactionType(String transactionType){
            this.transactionType = transactionType;
            return this;
        }
        public Builder setQuantity(int quantity){
            this.quantity = quantity;
            return this;
        }
        public Builder setDate(Date date){
            this.date = date;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}