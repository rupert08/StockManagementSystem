/* IRepository.java
IRepository class
Author: Rupert Van Niekerk (222894237)
Date: 25 March 2024
*/
package za.ac.cput.repository;



public interface IRepository<T,ID> {
    //Create
    T create(T t);
   //Read
    T read(ID id);
   //Update
    T update(T t);
    //Delete
    boolean delete(ID id);

}
