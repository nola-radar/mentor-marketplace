/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;

import org.ideavillage.mentormarketplace.persistence.domain.MentorIndustry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author jlbates
 */
public interface MentorIndustryRepository extends PagingAndSortingRepository<MentorIndustry, Long> {
    
}
