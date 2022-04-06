package com.iot.smartgrid.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
        if(userName.equals("Ayush")){
            return new User("Ayush", "ayush", new ArrayList<>());
        }
        else {
            throw new UsernameNotFoundException("User name not found !!");
        }
    }
}
