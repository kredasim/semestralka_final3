/**
 * 
 */
package cz.cvut.assignmentmanager.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import cz.cvut.applyforassignmentportlet.service.PersistentDtoService;
import cz.cvut.fit.bpm.api.dto.ProjectDto;
import cz.cvut.fit.bpm.api.dto.TaskDto;
import cz.cvut.fit.bpm.common.controller.AbstractDTOController;

/**
 * @author Simeon Kredatus
 *
 */
@ManagedBean(name = "assignmentManager")
@ViewScoped
public class AssignmentManagerController extends AbstractDTOController<TaskDto> {

	@ManagedProperty("#{dummyTaskDtoService}")
	private PersistentDtoService<TaskDto> persistentDtoService;
	
	@PostConstruct
	public void init() {
		//init dto here
		TaskDto dto = new TaskDto();
		dto.setProject(new ProjectDto());
		setDto(dto);
	}
	
	public void save() {
		persistentDtoService.save(getDto());
	}

	public PersistentDtoService<TaskDto> getPersistentDtoService() {
		return persistentDtoService;
	}

	public void setPersistentDtoService(PersistentDtoService<TaskDto> persistentDtoService) {
		this.persistentDtoService = persistentDtoService;
	}
}
