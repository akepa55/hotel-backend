package pl.tim.hotelbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tim.hotelbackend.entity.AppUser;
import pl.tim.hotelbackend.service.AppUserService;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class AppUserController {

    private AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping()
    public Iterable<AppUser> getAllUsers() {
        return appUserService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AppUser> getUserById(@PathVariable Long id) {
        return appUserService.findById(id);
    }

    @PostMapping
    public void addUser(@RequestBody AppUser user) {
        appUserService.save(user);
    }

    @PutMapping
    public void updateUser(@RequestBody AppUser user) {
        appUserService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        appUserService.deleteById(id);
    }
}
