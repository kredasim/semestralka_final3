/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.applyforassignmentportlet.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.util.PortalUtil;

import cz.cvut.applyforassignmentportlet.service.PersistentDtoService;
import cz.cvut.fit.bpm.api.dto.AttachmentDto;
import cz.cvut.fit.bpm.api.dto.TaskDto;
import cz.cvut.fit.bpm.common.WorkflowService;
import cz.cvut.portlet.common.CommonConstants;
//import cz.cvut.fit.industry.api.WorkflowConstants;

/**
 * Controller for view page of this portlet.
 * @author Simeon Kredatus
 *
 */
@ManagedBean
@ViewScoped
public class ViewTaskController implements Serializable {

	//Logger
    private static final Logger LOG = LoggerFactory.getLogger(ViewTaskController.class);

    /**
	 * 
	 */
	private static final long serialVersionUID = 9037053633902916249L;
    

    @ManagedProperty("#{workflowService}")
    private WorkflowService workflowService;
    
    @ManagedProperty("#{dummyTaskDtoService}")
    private PersistentDtoService<TaskDto> taskDtoService;


    /**
     * TODO finish after the method of parameter passing will be known.
     * Method starts new process instance of process called {@link WorkflowConstants.APPLY_FOR_TASK_PROCESS_KEY}.
     * Then the usertask 1 is executed to apply for the offered role.
     * @param roleId
     * @throws IOException 
     */
    public void applyFor() throws IOException {
//    	LOG.info("Applying for role: " + getDto().getName());
//    	String processId = workflowService.startProcess(WorkflowConstants.APPLY_FOR_TASK_PROCESS_KEY);
//    	workflowService.completeTaskByProcessId(null, processId, null);
    	redirectHome();
    }
    
    
    public void redirectHome() throws IOException {
    	try {
    		FacesContext.getCurrentInstance().getExternalContext().redirect(PortalUtil.getHomeURL((HttpServletRequest) FacesContext.getCurrentInstance()
    				.getExternalContext().getRequest()));
		} catch (Exception e) {
			LOG.error("Exception while redirecting to home url: " + e.getMessage());
		}
    }
    
    /**
     * TODO connect to alfresco
     * @param attachment
     * @throws IOException
     */
    public void downloadAttachment(AttachmentDto attachment) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("DownloadServlet-1.0-SNAPSHOT/download.do");
    }

    public TaskDto getTask() {
    	FacesContext context = FacesContext.getCurrentInstance();
        PortletRequest request = (PortletRequest) context.getExternalContext().getRequest();
        String param = request.getParameter(CommonConstants.ASSIGNMENT_ID_PARAM);
        Long id = null;
        if (param != null) {
        	id = Long.parseLong(param);
        }
        if (id != null) {
        	return taskDtoService.getById(id);
        }
    	return null;
    }
    
	public WorkflowService getWorkflowService() {
		return workflowService;
	}

	public void setWorkflowService(WorkflowService workflowService) {
		this.workflowService = workflowService;
	}


	public PersistentDtoService<TaskDto> getTaskDtoService() {
		return taskDtoService;
	}


	public void setTaskDtoService(PersistentDtoService<TaskDto> taskDtoService) {
		this.taskDtoService = taskDtoService;
	}
	
	

	
}
