package org.ideavillage.mentormarketplace.web.forms;

import java.util.List;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;

/**
 *
 */
public class ExploreForm {

    private List<Industry> industryList;

    private List<Expertise> expertiseList;

    public List<Industry> getIndustryList() {
        return industryList;
    }

    public void setIndustryList(List<Industry> industryList) {
        this.industryList = industryList;
    }

    public List<Expertise> getExpertiseList() {
        return expertiseList;
    }

    public void setExpertiseList(List<Expertise> expertiseList) {
        this.expertiseList = expertiseList;
    }
}
