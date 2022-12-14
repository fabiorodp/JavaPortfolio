package com.signup_signin.appuser;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor  //ref to: https://www.javatpoint.com/lombok-java
public class AppUserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG = "User %s not fund";
    private final AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException{
        return appUserRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND_MSG, email)));
    }
}
