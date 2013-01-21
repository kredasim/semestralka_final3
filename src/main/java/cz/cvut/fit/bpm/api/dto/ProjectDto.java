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

/**
 * @author Miroslav Ligas <miroslav.ligas@ibacz.eu>
 */
public class ProjectDto extends CodebookEntity implements Serializable {
    private String name;

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
