/* InventoryRepository.java
InventoryRepository model class
Author: Thapelo Xaba (222400471)
Date: 22 March 2024
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Inventory;
import java.util.List;

public interface InventoryRepository {
    Inventory save(Inventory inventory);
    Inventory findById(String inventoryId);
    List<Inventory> findAll();
    Inventory update(Inventory inventory);
    void deleteById(String inventoryId);
}
