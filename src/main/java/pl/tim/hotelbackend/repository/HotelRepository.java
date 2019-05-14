package pl.tim.hotelbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.tim.hotelbackend.entity.Hotel;

import java.util.Collection;
import java.util.List;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {

    Iterable<Hotel> findAllByNameContainsIgnoreCase(String fragment);
}
