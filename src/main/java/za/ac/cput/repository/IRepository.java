/* StockManagementSystem.java
IRepository class
Author: Rupert Van Niekerk (222894237)
Date: 25 March 2024
*/
package za.ac.cput.repository;

import java.util.List;

public interface IRepository<T> {
    //Create
    void add(T item);
   //Read
    T getById(int id);
   //Update
    void update(T item);
    //Delete
    boolean delete(int id);
    List<T> getAll();
}
