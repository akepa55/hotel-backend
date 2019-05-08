package pl.tim.hotelbackend.repository;

import org.springframework.stereotype.Repository;
import pl.tim.hotelbackend.entity.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*We mark it as repo for further stuff
atm it's only a stupid list, but y'all gonna add some proper DB later
 */
@Repository
public class HotelRepository {
    private List<Hotel> hotels;

    public HotelRepository() {
        hotels = new ArrayList<>();
        hotels.add(new Hotel(1L, "Groman", "Hotel groman to fajny hotel", 3, "Pruszków, Wojska Polskiego 500", 52.1101706d, 20.888284d));
    }

    public List<Hotel> getAll() {
        return hotels;
    }

    public Optional<Hotel> getHotelById(Long hotelId) {
        return hotels.stream().filter(hotel -> hotel.getId() == hotelId).findFirst();
    }

    public void add(Hotel hotel) {
        hotels.add(hotel);
    }

    public void delete(Long id) {
        hotels.removeIf(hotel -> hotel.getId() == id);
    }
}
