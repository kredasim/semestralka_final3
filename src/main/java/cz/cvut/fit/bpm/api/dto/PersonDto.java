package cz.cvut.fit.bpm.api.dto;

import java.io.Serializable;

/**
 * Osoba Transfer Object.
 * 
 * Utilized when searching for a person.
 * 
 * 
 */
public class PersonDto implements Serializable {

	/** unique personal number. */
	private int personalNumber;

	private String username;
	private String firstName;
	private String lastName;
	private String titlesPre;
	private String titlesPost;

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitlesPre() {
        return titlesPre;
    }

    public void setTitlesPre(String titlesPre) {
        this.titlesPre = titlesPre;
    }

    public String getTitlesPost() {
        return titlesPost;
    }

    public void setTitlesPost(String titlesPost) {
        this.titlesPost = titlesPost;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "personalNumber=" + personalNumber +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", titlesPre='" + titlesPre + '\'' +
                ", titlesPost='" + titlesPost + '\'' +
                '}';
    }
}
