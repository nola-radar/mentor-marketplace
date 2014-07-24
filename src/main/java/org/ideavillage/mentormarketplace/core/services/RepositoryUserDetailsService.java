package org.ideavillage.mentormarketplace.core.services;

import java.util.ArrayList;
import org.ideavillage.mentormarketplace.persistence.domain.MMUser;
import org.ideavillage.mentormarketplace.persistence.repositories.MMUserRepository;
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
 *
 * @author Petri Kainulainen
 */
public class RepositoryUserDetailsService implements UserDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryUserDetailsService.class);

    @Autowired
    private MMUserRepository repository;

    /**
     * Loads the user information.
     *
     * @param username The username of the requested user.
     * @return The information of the user.
     * @throws UsernameNotFoundException Thrown if no user is found with the given username.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LOGGER.info("Loading user by username: {}", username);

        MMUser user = repository.findByEmail(username);
        LOGGER.info("Found user: {}", user);

        if (user == null) {
            throw new UsernameNotFoundException("No user found with username: " + username);
        }

        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        
        if(user.getEmail().equals("ndupuis08@gmail.com")){
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            }

        SocialUser principal = new SocialUser(user.getEmail(), "SocialUser", authorities);

        LOGGER.info("Returning user details: {}", principal);

        return principal;
    }
}
