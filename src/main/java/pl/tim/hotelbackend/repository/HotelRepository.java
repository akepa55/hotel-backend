package pl.tim.hotelbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.tim.hotelbackend.entity.Hotel;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {

}
