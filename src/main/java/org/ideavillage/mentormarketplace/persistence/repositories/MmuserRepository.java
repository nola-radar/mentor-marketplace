package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.Mmuser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author 212395189
 */
public interface MmuserRepository extends PagingAndSortingRepository<Mmuser, Long> {
    
    Mmuser findByEmail(String email);
    
    long countByEmail(String email);
    
    Mmuser findByLinkedInId(String linkedInId);
    
    long countByLinkedInId(String linkedInId);
    
    Mmuser findByIsAdmin(String isAdmin);
}