package org.ideavillage.mentormarketplace.web.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author 212395189
 */
public class RegistrationForm {

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 255)
    @Email
    private String email;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 255)
    private String linkedInId;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the linkedInId
     */
    public String getLinkedInId() {
        return linkedInId;
    }

    /**
     * @param linkedInId the linkedInId to set
     */
    public void setLinkedInId(String linkedInId) {
        this.linkedInId = linkedInId;
    }
}
