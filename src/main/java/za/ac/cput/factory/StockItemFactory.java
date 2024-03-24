package za.ac.cput.factory;
import za.ac.cput.domain.StockItem;

import java.util.Date;

public class StockItemFactory {
    public static StockItem createStockItem(int itemID, String name, String description, String category,
                                            int quantity, String location, Date purchaseDate, String supplier,
                                            double cost, String condition) {
        return new StockItem.Builder()
                .setItemID(itemID)
                .setName(name)
                .setDescription(description)
                .setCategory(category)
                .setQuantity(quantity)
                .setLocation(location)
                .setPurchaseDate(purchaseDate)
                .setSupplier(supplier)
                .setCost(cost)
                .setCondition(condition)
                .build();
    }
}
