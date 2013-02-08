/**
 * 
 */
package cz.cvut.applyforassignmentportlet.dao;

import org.springframework.stereotype.Repository;

import cz.cvut.fit.bpm.api.dto.TaskDto;

/**
 * @author Simeon Kredatus
 *
 */
@Repository("taskDtoDao")
public class TaskDtoDao extends HibernateGenericDao<TaskDto> implements TaskDtoGenericDao {

}
