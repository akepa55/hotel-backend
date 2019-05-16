package pl.tim.hotelbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.tim.hotelbackend.entity.AppUser;
import pl.tim.hotelbackend.repository.AppUserRepository;
import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public Iterable<AppUser> findAll() {
        return appUserRepository.findAll();
    }

    public Optional<AppUser> findById(Long id) {
        return appUserRepository.findById(id);
    }

    public Optional<AppUser> findByUsername(String username) { return appUserRepository.findByUsername(username); }

    public void save(AppUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        appUserRepository.save(user);
    }

    public void update(AppUser user) {
        appUserRepository.save(user);
    }

    public void deleteById(Long id) {
        appUserRepository.deleteById(id);
    }
}
