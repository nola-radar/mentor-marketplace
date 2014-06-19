package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.Entrepreneur;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author 212395189
 */
public interface EntrepreneurRepository extends PagingAndSortingRepository<Entrepreneur, Long> {
    
    long countByLinkedInId(String linkedInId);
    long countByIndustry(String industry);

    Entrepreneur findByLinkedInId(String linkedInId);

    Entrepreneur findByIndustry(String industry);
}
