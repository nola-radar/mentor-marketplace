package org.ideavillage.mentormarketplace.persistence.repositories;

import java.util.Collection;
import org.ideavillage.mentormarketplace.persistence.domain.MentorIndustry;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface MentorIndustryRepository extends PagingAndSortingRepository<MentorIndustry, Long> {

    Collection<MentorIndustry> findByMentorId(Integer mentorId);

    Collection<MentorIndustry> findByIndustryId(Integer industryId);
}
