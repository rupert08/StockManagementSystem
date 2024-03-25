/* StockManagementSystem.java
StockItemRepository class
Author: Rupert Van Niekerk (222894237)
Date: 25 March 2024
*/
package za.ac.cput.repository;

import za.ac.cput.domain.StockItem;

import java.util.ArrayList;
import java.util.List;

public class StockItemRepository implements IStockItemRepository {
    private List<StockItem> stockItems;

    public StockItemRepository() {
        this.stockItems = new ArrayList<>();
    }

    @Override
    public void add(StockItem item) {
        stockItems.add(item);
    }

    @Override
    public StockItem getById(int id) {
        for (StockItem item : stockItems) {
            if (item.getItemID() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void update(StockItem item) {
        for (int i = 0; i < stockItems.size(); i++) {
            if (stockItems.get(i).getItemID() == item.getItemID()) {
                stockItems.set(i, item);
                break;
            }
        }
    }

    @Override
    public boolean delete(int id) {
        StockItem stockItemToDelete = getById(id);
        if(stockItemToDelete == null)
            return  false;
        return (stockItems.remove(stockItemToDelete));
       // stockItems.removeIf(item -> item.getItemID() == id);
    }

    @Override
    public List<StockItem> getAll() {
        return new ArrayList<>(stockItems);
    }
}

