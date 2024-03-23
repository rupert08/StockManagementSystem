package za.ac.cput.domain.repository;
import za.ac.cput.domain.Inventory;
import za.ac.cput.domain.repositoryInterface.InventoryRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryRepositoryImpl implements InventoryRepository {
    private final Map<String, Inventory> inventoryMap;

    public InventoryRepositoryImpl() {
        this.inventoryMap = new HashMap<>();
    }

    @Override
    public Inventory save(Inventory inventory) {
        return inventoryMap.put(inventory.getInventoryId(), inventory);
    }

    @Override
    public Inventory findById(String inventoryId) {
        return inventoryMap.get(inventoryId);
    }

    @Override
    public List<Inventory> findAll() {
        return new ArrayList<>(inventoryMap.values());
    }

    @Override
    public Inventory update(Inventory inventory) {
        return inventoryMap.put(inventory.getInventoryId(), inventory);
    }

    @Override
    public void deleteById(String inventoryId) {
        inventoryMap.remove(inventoryId);
    }
}