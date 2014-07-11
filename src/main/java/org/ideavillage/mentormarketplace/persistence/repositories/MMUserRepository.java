package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.MMUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author 212395189
 */
public interface MMUserRepository extends PagingAndSortingRepository<MMUser, Long> {
    
    MMUser findByEmail(String email);
    
    long countByEmail(String email);
    
    MMUser findByLinkedInId(String linkedInId);
    
    long countByLinkedInId(String linkedInId);
}
