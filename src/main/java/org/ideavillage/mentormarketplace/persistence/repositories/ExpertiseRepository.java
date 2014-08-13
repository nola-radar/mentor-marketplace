
package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface ExpertiseRepository extends PagingAndSortingRepository<Expertise, Long> {
    
    Page<Expertise> findByExpertise(String expertise, Pageable pageable);
    
    Page<Expertise> findById(Integer id, Pageable pageable);
    
    Expertise findByExpertise(String expertise);
}
