/**
 * 
 */
package cz.cvut.fit.bpm.api.service;

import java.util.List;

import cz.cvut.fit.bpm.api.dto.SkillDto;

/**
 * Service for maintaning {@link SkillDto} objects.
 * @author Simeon Kredatus
 *
 */
public interface SkillDtoService {

	List<SkillDto> getSkillsForUser(Long id);
}
