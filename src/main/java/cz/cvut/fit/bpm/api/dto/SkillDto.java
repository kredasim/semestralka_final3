package cz.cvut.fit.bpm.api.dto;

import java.io.Serializable;

public class SkillDto extends CodebookEntity implements Serializable {

    private int upperSkillId;
    private String type;
    private int rating;
    private boolean mandatory;

    public int getUpperSkillId() {
        return upperSkillId;
    }

    public void setUpperSkillId(int upperSkillId) {
        this.upperSkillId = upperSkillId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    @Override
    public String toString() {
        return "SkillDto{" +
                "upperSkillId=" + upperSkillId +
                ", type='" + type + '\'' +
                ", rating=" + rating +
                ", mandatory=" + mandatory +
                '}';
    }
}