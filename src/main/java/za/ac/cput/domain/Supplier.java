/* StockManagementSystem.java
This is my Supplier class
Author: Lakhikhaya Mpumlwana (220204594)
Date: 23 March 2024
*/
package za.ac.cput.domain;

import java.util.Objects;

public class Supplier {

    private  String supplierId;
    private  String name;
    private  String contactInfo;

    public Supplier(Builder builder) {
        this.supplierId = builder.supplierId;
        this.name = builder.name;
        this.contactInfo = builder.contactInfo;
    }

    public Supplier(String s123, String supplierA, String s) {
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public static class Builder {
        private final String supplierId;
        private String name;
        private String contactInfo;

        public Builder(String supplierId) {
            this.supplierId = supplierId;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder contactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public Supplier build() {
            return new Supplier(this);
        }

        public Builder copy(Supplier supplier) {
            this.name = supplier.name;
            this.contactInfo = supplier.contactInfo;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier sup = (Supplier) o;
        return Objects.equals(supplierId, sup.supplierId) &&
                Objects.equals(name, sup.name) &&
                Objects.equals(contactInfo, sup.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, name, contactInfo);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}