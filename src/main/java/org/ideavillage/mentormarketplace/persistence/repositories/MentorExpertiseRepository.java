/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.ideavillage.mentormarketplace.persistence.domain.MentorIndustry;

/**
 *
 * @author jlbates
 */
public interface MentorExpertiseRepository extends PagingAndSortingRepository<MentorIndustry, Long>{
    
}