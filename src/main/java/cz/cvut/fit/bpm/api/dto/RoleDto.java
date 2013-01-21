package cz.cvut.fit.bpm.api.dto;

import java.io.Serializable;

public class RoleDto extends CodebookEntity implements Serializable {
	
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}