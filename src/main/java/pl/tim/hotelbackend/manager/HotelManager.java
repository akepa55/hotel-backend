package pl.tim.hotelbackend.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tim.hotelbackend.entity.Hotel;
import pl.tim.hotelbackend.repository.HotelRepository;

import java.util.Optional;

@Service
public class HotelManager {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelManager(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Iterable<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    public Optional<Hotel> findById(Long id) {
        return hotelRepository.findById(id);
    }

    public void save(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    public void update(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    public void deleteById(Long id) {
        hotelRepository.deleteById(id);
    }
}
