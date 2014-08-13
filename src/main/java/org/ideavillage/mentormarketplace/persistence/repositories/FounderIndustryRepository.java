/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.FounderIndustry;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface FounderIndustryRepository extends PagingAndSortingRepository<FounderIndustry, Long> {
    
    FounderIndustry findById(Integer id);
    
    FounderIndustry findByFounderId(Integer founderId);
    
    FounderIndustry findByIndustryId(Integer industryId);
}