package pl.tim.hotelbackend.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.tim.hotelbackend.entity.Hotel;
import pl.tim.hotelbackend.entity.Review;
import pl.tim.hotelbackend.entity.User;

@Component
public class InitialDataLoader {

    @Autowired private HotelRepository hotelRepository;
    @Autowired private ReviewRepository reviewRepository;
    @Autowired private UserRepository userRepository;

    @EventListener
    public void loadInitialDataIntoDb(ApplicationReadyEvent event) {

        User user1 = new User("adrianek55@poczta.pl", "adrianek55", "qwe123qwe", "admin");
        User user2 = new User("piotras39@poczta.pl", "piotras39", "ewq321ewq", "admin");
        User user3 = new User("jan.kowalski@poczta.pl", "jk89", "topkex", "user");

        Hotel hotel1 = new Hotel("The Hotelo", "Wspaniały hotel w stylu brazylijsim.", 3, "Gdańsk Kwiatowa 14", 29.0d, 40.0d);
        Hotel hotel2 = new Hotel("Hotel El Dorado", "Amerykański hotel najlepszy w mieście", 5, "Kraków Pimpadła 18B", 83.0d, 18.2d);

        Review review1 = new Review(3L, 1L, 2, "Nie no słaby hotel, nie polecam. Miłego dnia życzę i pozdrawiam cieplutko Jan Kowalski.");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        hotelRepository.save(hotel1);
        hotelRepository.save(hotel2);

        reviewRepository.save(review1);
    }
}
