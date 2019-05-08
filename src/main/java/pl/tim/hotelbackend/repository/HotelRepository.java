package pl.tim.hotelbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.tim.hotelbackend.entity.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*We mark it as repo for further stuff
atm it's only a stupid list, but y'all gonna add some proper DB later
 */
@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {



}
