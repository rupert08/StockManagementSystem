
/* InventoryFactory.java
InventoryFactory class
Author: Thapelo Xaba (222400471)
Date: 22 March 2024
*/
package za.ac.cput.factory;

import za.ac.cput.domain.Inventory;

public class InventoryFactory {
    public static  Inventory buildInvertory(String inventoryId,String name,String location,String stockItemId){
        return new Inventory.Builder().setInventoryId(inventoryId).setName(name).setLocation(location).setStockItemId(stockItemId).build();
    }
}
