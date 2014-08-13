/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;

import java.util.Collection;
import org.ideavillage.mentormarketplace.persistence.domain.FounderIndustry;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface FounderIndustryRepository extends PagingAndSortingRepository<FounderIndustry, Long> {
    
    Collection<FounderIndustry> findByMentorId(Integer founderId);
    
    Collection<FounderIndustry> findByExpertiseId(Integer industryId);
}