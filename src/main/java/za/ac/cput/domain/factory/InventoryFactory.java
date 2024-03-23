package za.ac.cput.domain.factory;

import za.ac.cput.domain.Inventory;

public class InventoryFactory {
    public static  Inventory buildInvertory(String inventoryId,String name,String location,String stockItemId){
        return new Inventory.Builder().setInventoryId(inventoryId).setName(name).setLocation(location).setStockItemId(stockItemId).build();
    }
}
