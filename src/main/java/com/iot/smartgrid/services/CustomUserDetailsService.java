package com.iot.smartgrid.services;

//import com.iot.smartgrid.model.CustomUserDetails;
//import com.iot.smartgrid.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

//    @Autowired
//    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException
    {

//        final User user = this.userRepository.findByUsername(userName);
//
//        if(user==null){
//            throw new UsernameNotFoundException("User not found");
//        }
//        else{
//            return new CustomUserDetails(user);
//        }
       //
        if(userName.equals("Ayush")){
            return new User("Ayush", "ayush", new ArrayList<>());
        }
        else {
            throw new UsernameNotFoundException("User name not found !!");
        }
    }
}
