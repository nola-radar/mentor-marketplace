package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * A Spring repository for getting Mentors from the database. Check the Spring Data documentation for the list of
 * methods you get by extending PagingAndSortingRepository (and in turn, CrudRepository and Repository). Below are a few
 * examples of methods that you can create to get lists or counts of instances without needing to write an
 * implementation. The implementation classes are automatically created by Spring (using configuration set up in
 * WEB-INF/configs/spring-jpa.xml).
 *
 * @author 212395189
 * @see <a href="http://docs.spring.io/spring-data/data-commons/docs/current/reference/html/repositories.html">Spring
 * Data Repositories</a>
 */

public interface MentorRepository extends PagingAndSortingRepository<Mentor, Long> {

    long countByFirstName(String firstName);

    long countByLastName(String lastName);

    long countByIndustry(String industry);
    
    long countByAreasOfExpertise(String areasOfExpertise);
    
    long countByBackground(String background);
    
    long countByWebsite(String website);
    
    long countByFacebook(String facebook);
    
    long countByTwitter(String twitter);
    
    long countByOtherSocialMedia(String otherSocialMedia);
    
    long countByLinkedInId(String linkedInId);
    
    long countByLinkedInPictureURL(String linkedInPictureURL);
    
    long countByLinkedInCurrentCompany(String linkedInCurrentCompany);
    
    long countByLinkedInCurrentJobTitle(String linkedInCurrentJobTitle);

    Page<Mentor> findByFirstName(String firstName, Pageable pageable);
    
    Page<Mentor> findByLastName(String lastName, Pageable pageable);
    
    Page<Mentor> findByBackground(String background, Pageable pageable);
    
    Page<Mentor> findByWebsite(String website, Pageable pageable);
    
    Page<Mentor> findByFacebook(String facebook, Pageable pageable);
    
    Page<Mentor> findByTwitter(String twitter, Pageable pageable);
    
    Page<Mentor> findByOtherSocialMedia(String otherSocialMedia, Pageable pageable);

    Mentor findByLinkedInId(String linkedInId);
    
    Mentor findByLinkedInPictureURL(String linkedInPictureURL);
    
    Mentor findByLinkedInCurrentCompany(String linkedInCurrentCompany);
    
    Mentor findByLinkedInCurrentJobTitle(String linkedInCurrentJobTitle);
}