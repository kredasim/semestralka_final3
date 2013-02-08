/**
 * 
 */
package cz.cvut.applyforassignmentportlet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cz.cvut.applyforassignmentportlet.dao.TaskDtoGenericDao;
import cz.cvut.fit.bpm.api.dto.TaskDto;

/**
 * @author Simeon Kredatus
 * 
 */
@Service("dummyTaskDtoService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersistentTaskDtoService implements PersistentDtoService<TaskDto> {

	private TaskDtoGenericDao taskDtoDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskDto getById(Long id) {
		TaskDto ret = taskDtoDao.findById(id);
		return ret;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void save(TaskDto object) {
		taskDtoDao.save(object);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TaskDto> getAll() {
		return taskDtoDao.getAll();
	}

	/**
	 * @param taskDtoDao
	 *            the taskDtoDao to set
	 */
	@Autowired
	public void setTaskDtoDao(TaskDtoGenericDao taskDtoDao) {
		this.taskDtoDao = taskDtoDao;
	}
}
