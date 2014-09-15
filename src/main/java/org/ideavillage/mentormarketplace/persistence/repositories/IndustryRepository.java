package org.ideavillage.mentormarketplace.persistence.repositories;

import java.util.List;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface IndustryRepository extends PagingAndSortingRepository<Industry, Long> {

    List<Industry> findByFounderIndustryList(Founder founder);

    List<Industry> findByMentorIndustryList(Mentor mentor);
}
