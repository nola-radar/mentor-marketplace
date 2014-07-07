package org.ideavillage.mentormarketplace.core.services;

import java.util.ArrayList;
import org.ideavillage.mentormarketplace.persistence.domain.Entrepreneur;
import org.ideavillage.mentormarketplace.persistence.repositories.EntrepreneurRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUser;

/**
 * This class loads the requested user by using a Spring Data JPA repository.
 * @author Petri Kainulainen
 */
public class RepositoryUserDetailsService implements UserDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryUserDetailsService.class);

    @Autowired
    private EntrepreneurRepository repository;

    /**
     * Loads the user information.
     * @param username  The username of the requested user.
     * @return  The information of the user.
     * @throws UsernameNotFoundException    Thrown if no user is found with the given username.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LOGGER.debug("Loading user by username: {}", username);

        Entrepreneur user = repository.findByLinkedInId(username);
        LOGGER.debug("Found user: {}", user);

        if (user == null) {
            throw new UsernameNotFoundException("No user found with username: " + username);
        }
        
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("entrepreneur"));

        SocialUser principal = new SocialUser(user.getLinkedInId(), "SocialUser", authorities);

        LOGGER.debug("Returning user details: {}", principal);

        return principal;
    }
}