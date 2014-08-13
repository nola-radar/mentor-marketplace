
package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface IndustryRepository extends PagingAndSortingRepository<Industry, Long> {
    
    Page<Industry> findByIndustry(String industry, Pageable pageable);
    
    Page<Industry> findById(Integer id, Pageable pageable);
    
    Industry findByIndustry(String industry);
    
}
