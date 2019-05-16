package pl.tim.hotelbackend.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.tim.hotelbackend.entity.*;
import pl.tim.hotelbackend.service.AppUserService;
import pl.tim.hotelbackend.service.HotelService;
import pl.tim.hotelbackend.service.ReviewService;

@Component
public class InitialDataLoader {

    @Autowired private HotelService hotelService;
    @Autowired private ReviewService reviewService;
    @Autowired private AppUserService appUserService;

    @EventListener
    public void loadInitialDataIntoDb(ApplicationReadyEvent event) {

        AppUser user1 = new AppUser("adrianek55@poczta.pl", "akepa", "akepa", ERole.ADMIN.getName());
        AppUser user2 = new AppUser("piotras39@poczta.pl", "pmotyka", "pmotyka", ERole.ADMIN.getName());
        AppUser user3 = new AppUser("jan.kowalski@poczta.pl", "jkowal", "jkowal", ERole.USER.getName());

        Hotel hotel1 = new Hotel("The Hotelo", "Wspaniały hotel w stylu brazylijsim.", 3, "Gdańsk Kwiatowa 14", 29.0d, 40.0d);
        Hotel hotel2 = new Hotel("Hotel El Dorado", "Amerykański hotel najlepszy w mieście", 5, "Kraków Pimpadła 18B", 83.0d, 18.2d);

        Review review1 = new Review(3L, 1L, 2, "Nie no słaby hotel, nie polecam. Miłego dnia życzę i pozdrawiam cieplutko Jan Kowalski.");

        appUserService.save(user1);
        appUserService.save(user2);
        appUserService.save(user3);

        hotelService.save(hotel1);
        hotelService.save(hotel2);

        reviewService.save(review1);
    }
}
