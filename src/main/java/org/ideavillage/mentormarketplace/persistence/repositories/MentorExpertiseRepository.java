/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;
import java.util.Collection;
import org.ideavillage.mentormarketplace.persistence.domain.MentorExpertise;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author jlbates
 */
public interface MentorExpertiseRepository extends PagingAndSortingRepository<MentorExpertise, Long>{

    Collection<MentorExpertise> findByMentorId(Integer mentorId);
    
    Collection<MentorExpertise> findByExpertiseId(Integer expertiseId);
    
}