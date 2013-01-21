/* ===========================================================================
 * IBA CZ Confidential
 *
 * (c) Copyright IBA CZ 2011 ALL RIGHTS RESERVED
 * The source code for this program is not published or otherwise
 * divested of its trade secrets.
 *
 * =========================================================================== */
package cz.cvut.fit.bpm.api.service;

import java.util.List;

import cz.cvut.fit.bpm.api.dto.BpmProcessDto;

/**
 * @author Miroslav Ligas <miroslav.ligas@ibacz.eu>
 */
public interface ProcessService {

    /**
     * Returns all available processes for specified user.
     *
     * @param userId user identifier.
     * @return list of processes.
     */
    List<BpmProcessDto> getAllProcessesForUser(String userId);

    /**
     * Method starts the process identified by process identifier string.
     *
     * @param processId process identifier.
     * @return id of the started process instance.
     */
    String startProcess(String processId);
}
