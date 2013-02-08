/**
 * 
 */
package cz.cvut.fit.bpm.api.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * Parent for all persistent entities.
 * @author Simeon Kredatus
 *
 */
public class CodebookEntity {

	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
