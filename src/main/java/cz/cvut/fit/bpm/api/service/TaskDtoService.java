/**
 * 
 */
package cz.cvut.fit.bpm.api.service;

import cz.cvut.fit.bpm.api.dto.TaskDto;

/**
 * Service for maintaining {@link TaskDto} objects.
 * @author Simeon Kredatus
 * 
 */
public interface TaskDtoService {

	/**
	 * Returns {@link TaskDto} object instance found by id.
	 * @param id
	 * @return
	 */
	TaskDto getById(Long id);
}
