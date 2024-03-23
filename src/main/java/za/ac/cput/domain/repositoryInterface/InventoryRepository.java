package za.ac.cput.domain.repositoryInterface;

import za.ac.cput.domain.Inventory;
import java.util.List;

public interface InventoryRepository {
    Inventory save(Inventory inventory);
    Inventory findById(String inventoryId);
    List<Inventory> findAll();
    Inventory update(Inventory inventory);
    void deleteById(String inventoryId);
}
