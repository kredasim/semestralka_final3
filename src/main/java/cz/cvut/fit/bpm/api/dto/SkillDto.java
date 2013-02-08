package cz.cvut.fit.bpm.api.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class SkillDto implements Serializable {
	@Id
	@GeneratedValue
	@Column
	private long id;
	
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column
    private int upperSkillId;
	@Column
    private String type;
	@Column
    private int rating;
	@Column
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