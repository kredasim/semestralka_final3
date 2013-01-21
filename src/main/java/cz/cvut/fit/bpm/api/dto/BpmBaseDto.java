/* ===========================================================================
 * IBA CZ Confidential
 *
 * (c) Copyright IBA CZ 2011 ALL RIGHTS RESERVED
 * The source code for this program is not published or otherwise
 * divested of its trade secrets.
 *
 * =========================================================================== */
package cz.cvut.fit.bpm.api.dto;

/**
 * @author Miroslav Ligas <miroslav.ligas@ibacz.eu>
 */
public class BpmBaseDto {
    private String id;
    private BpmType system;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BpmType getSystem() {
        return system;
    }

    public void setSystem(BpmType system) {
        this.system = system;
    }
}
