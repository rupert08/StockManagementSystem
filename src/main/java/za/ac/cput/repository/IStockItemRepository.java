/* StockManagementSystem.java
IStockItemRepository class
Author: Rupert Van Niekerk (222894237)
Date: 25 March 2024
*/
package za.ac.cput.repository;

import za.ac.cput.domain.StockItem;

import java.util.List;

public interface IStockItemRepository extends IRepository<StockItem> {
    // Additional method specific to StockItemRepository
    List<StockItem> getAll();
}

