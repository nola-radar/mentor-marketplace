/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.FounderExpertise;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface FounderExpertiseRepository extends PagingAndSortingRepository<FounderExpertise, Long> {
    
    FounderExpertise findById(Integer id);
    
    FounderExpertise findByFounderId(Integer founderId);
    
    FounderExpertise findByExpertiseId(Integer expertiseId);
    
}
