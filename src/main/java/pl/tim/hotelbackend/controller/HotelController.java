package pl.tim.hotelbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tim.hotelbackend.entity.Hotel;
import pl.tim.hotelbackend.repository.HotelRepository;

import java.util.List;
import java.util.Optional;

/*This is a REST controller so we mark it accordingly
I guess you should treat it like a set of methods that can be called on a certain page?
*/
@RestController

/*This is the initial mapping, this means that the main "page" of the app will be at
localhost:8080/tim/hotels
And every other mapping added from now on, will be added to this one
*/
@RequestMapping("/tim/hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    //We autowire this in constructor so spring auto-magically instantiates our repository
    @Autowired
    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    /*This method will be called whenever we are hit with a GET call under the
    localhost:8080/tim/hotels/all address
    as a response we will return every hotel object in JSON from our repo.
    */
    @GetMapping("/all")
    public List<Hotel> getHotels() {
        return hotelRepository.getAll();
    }

    /*This method has a GET mapping without a name so this means that we listen for any GET
    mapping that happens to have an id parameter under the
    localhost:8080/tim/hotels address.
    The proper syntax looks like this:
    localhost:8080/tim/hotels?id=1
    This will hit this method with id == 1 and return a hotel with this id to the body of the page
     */
    @GetMapping
    public Optional<Hotel> getHotelById(@RequestParam Long id) {
        return hotelRepository.getHotelById(id);
    }


    /*Just like above, we listen under the
    localhost:8080/tim/hotels address but for POST calls this time.
    We only accept POST calls that have a valid JSON Hotel object and if that's so, then we add the new hotel to DB.
     */
    @PostMapping
    public void addHotel(@RequestBody Hotel hotel) {
        hotelRepository.add(hotel);
    }

    /*Again like above we listen under
    localhost:8080/tim/hotels but for DELETE calls.
    We also need an id parameter like in getById method earlier so if we get for example
    localhost:8080/tim/hotels?id=1 with DELETE call then we delete the hotel with the id from our DB.
    */
    @DeleteMapping
    public void deleteHotel(@RequestParam Long id) {
        hotelRepository.delete(id);
    }
}
