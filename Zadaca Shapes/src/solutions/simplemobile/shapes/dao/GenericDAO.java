package solutions.simplemobile.shapes.dao;

import java.util.List;

/*
 * Define all needed CRUD operations.
 */
public interface GenericDAO<T> {
	public List<T> getShapes();
	
//	public T findById(Integer id);
//	public void save(T t);
	// ... remove(delete), update
}
