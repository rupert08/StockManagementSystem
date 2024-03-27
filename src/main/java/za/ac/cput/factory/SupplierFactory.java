/* StockManagementSystem.java
This is my Supplier Factory class
Author: Lakhikhaya Mpumlwana (220204594)
Date: 24 March 2024
*/
package za.ac.cput.factory;

import za.ac.cput.domain.Supplier;

public class SupplierFactory {
    public static Supplier createSupplier(String supplierId, String name, String contactInfo) {
        return new Supplier.Builder(supplierId)
                .name(name)
                .contactInfo(contactInfo)
                .build();
    }
}
