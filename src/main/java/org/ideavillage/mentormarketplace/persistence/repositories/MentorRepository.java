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

    long countByLinkedInId(String linkedInId);

    long countByIndustry(String industry);
    
    long countByFirstName(String firstName);

    Mentor findByLinkedInId(String linkedInId);

    Page<Mentor> findByIndustry(String industry, Pageable pageable);
    
    Page<Mentor> findByFirstName(String firstName, Pageable pageable);
}
