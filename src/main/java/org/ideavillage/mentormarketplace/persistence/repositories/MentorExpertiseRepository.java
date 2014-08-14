package org.ideavillage.mentormarketplace.persistence.repositories;

import java.util.Collection;
import org.ideavillage.mentormarketplace.persistence.domain.MentorExpertise;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface MentorExpertiseRepository extends PagingAndSortingRepository<MentorExpertise, Long> {

    Collection<MentorExpertise> findByMentorId(Integer mentorId);

    Collection<MentorExpertise> findByExpertiseId(Integer expertiseId);

}
