/* StockItemRepository.java
StockItemRepository class
Author: Rupert Van Niekerk (222894237)
Date: 25 March 2024
*/
package za.ac.cput.repository;

import za.ac.cput.domain.StockItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StockItemRepository implements IRepository<StockItem, Integer> {

    private List<StockItem> stockItems;

    public StockItemRepository() {
        stockItems = new ArrayList<>();
    }

    @Override
    public StockItem create(StockItem item) {
        stockItems.add(item);
        return item;
    }

    @Override
    public StockItem read(Integer id) {
        for (StockItem item : stockItems) {
            if (Objects.equals(item.getItemID(), id)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public StockItem update(StockItem item) {
        int itemId = item.getItemID();
        StockItem existingItem = read(itemId);
        if (existingItem != null) {
            stockItems.remove(existingItem);
            stockItems.add(item);
            return item;
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        StockItem stockItemToDelete = read(id);
        if (stockItemToDelete == null)
            return false;
        return stockItems.remove(stockItemToDelete);
    }


    public List<StockItem> getAll() {
        return new ArrayList<>(stockItems);
    }
}
