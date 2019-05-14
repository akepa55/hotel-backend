package pl.tim.hotelbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tim.hotelbackend.entity.Hotel;
import pl.tim.hotelbackend.repository.HotelRepository;

import java.util.Optional;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Iterable<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    public Iterable<Hotel> findAllByNameLike(String fragment) { return hotelRepository.findAllByNameContainsIgnoreCase(fragment); }

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
