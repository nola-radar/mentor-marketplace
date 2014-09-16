package org.ideavillage.mentormarketplace.persistence.repositories;

import java.util.List;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mmuser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * A Spring repository for getting Founders from the database. Check the Spring Data documentation for the list of
 * methods you get by extending PagingAndSortingRepository (and in turn, CrudRepository and Repository). Below are a few
 * examples of methods that you can create to get lists or counts of instances without needing to write an
 * implementation. The implementation classes are automatically created by Spring (using configuration set up in
 * WEB-INF/configs/spring-jpa.xml).
 *
 * @author 212395189
 * @see <a href="http://docs.spring.io/spring-data/data-commons/docs/current/reference/html/repositories.html">Spring
 * Data Repositories</a>
 */
public interface FounderRepository extends JpaRepository<Founder, Long> {

    Founder findByLinkedInId(String linkedInId);

    Founder findByMmuser(Mmuser mmuser);
    
    Founder findByMmuserId(Long Id);

    List<Founder> findByIndustryListInAndExpertiseListIn(List<Industry> industries, List<Expertise> expertises);

    List<Founder> findByIndustryListIn(List<Industry> industries);

    List<Founder> findByExpertiseListIn(List<Expertise> expertises);
    
    
}
