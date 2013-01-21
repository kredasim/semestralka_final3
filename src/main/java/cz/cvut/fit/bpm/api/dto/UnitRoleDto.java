package cz.cvut.fit.bpm.api.dto;

import java.io.Serializable;
import java.util.List;

public class UnitRoleDto extends CodebookEntity implements Serializable {
    private RoleDto role;
    private String description;
    private List<PersonDto> nomination;
    private List<SkillDto> skillDtoList;

    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PersonDto> getNomination() {
        return nomination;
    }

    public void setNomination(List<PersonDto> nomination) {
        this.nomination = nomination;
    }

    public List<SkillDto> getSkillDtoList() {
        return skillDtoList;
    }

    public void setSkillDtoList(List<SkillDto> skillDtoList) {
        this.skillDtoList = skillDtoList;
    }

    @Override
    public String toString() {
        return "UnitRoleDto{" +
                "role=" + role +
                ", description='" + description + '\'' +
                ", nomination=" + nomination +
                ", skillDtoList=" + skillDtoList +
                '}';
    }
}