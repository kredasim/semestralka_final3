/* ===========================================================================
 * IBA CZ Confidential
 *
 * (c) Copyright IBA CZ 2011 ALL RIGHTS RESERVED
 * The source code for this program is not published or otherwise
 * divested of its trade secrets.
 *
 * =========================================================================== */
package cz.cvut.fit.bpm.api.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Miroslav Ligas <miroslav.ligas@ibacz.eu>
 */
@Entity
public class ProjectDto implements Serializable {
	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProjectDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
