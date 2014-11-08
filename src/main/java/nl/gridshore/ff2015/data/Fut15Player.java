package nl.gridshore.ff2015.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Represents a fut 15 player object.
 *
 * @author Roberto van der Linden
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fut15Player {

    private String commonName;
    private String firstName;
    private String lastName;

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
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
}
