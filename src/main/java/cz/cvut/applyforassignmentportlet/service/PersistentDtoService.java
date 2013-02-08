/**
 * 
 */
package cz.cvut.applyforassignmentportlet.service;

import java.util.List;

import cz.cvut.fit.bpm.api.dto.TaskDto;

/**
 * @author Simeon Kredatus
 *
 */
public interface PersistentDtoService<T> {
	
	void save (T object);
	List<T> getAll();
	
	/**
	 * Returns {@link TaskDto} object instance found by id.
	 * @param id
	 * @return
	 */
	<T> T getById(Long id);
}
