package org.ideavillage.mentormarketplace.persistence.repositories;

import java.util.List;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface ExpertiseRepository extends PagingAndSortingRepository<Expertise, Long> {

    List<Expertise> findByFounderExpertiseList(Founder founder);

    List<Expertise> findByMentorExpertiseList(Mentor mentor);
}
