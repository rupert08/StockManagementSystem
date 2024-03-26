/* IRepository.java
IRepository class
Author: Rupert Van Niekerk (222894237)
Date: 25 March 2024
*/
package za.ac.cput.repository;

import za.ac.cput.domain.StockItem;

public interface IRepository<T,ID> {
    //Create
    StockItem create(T t);
   //Read
    T read(ID id);
   //Update
    StockItem update(T t);
    //Delete
    boolean delete(ID id);

}
