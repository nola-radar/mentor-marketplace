
package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface ExpertiseRepository extends PagingAndSortingRepository<Expertise, Long> {

    Expertise findById(Integer id);
    
    Expertise findByExpertise(String expertise);
}
