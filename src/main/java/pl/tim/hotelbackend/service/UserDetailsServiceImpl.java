package pl.tim.hotelbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import pl.tim.hotelbackend.entity.AppUser;

import java.util.Optional;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AppUserService appUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Optional<AppUser> userDto = appUserService.findByUsername(s);

        if(userDto.isPresent()) {

            UserBuilder userBuilder = User.withUsername(userDto.get().getUsername());
            userBuilder.password(userDto.get().getPassword());
            userBuilder.roles(userDto.get().getRole());
            userBuilder.authorities(userDto.get().getRole());

            return userBuilder.build();
        }
        else throw new UsernameNotFoundException("Username " + s + " not found!");
    }
}
