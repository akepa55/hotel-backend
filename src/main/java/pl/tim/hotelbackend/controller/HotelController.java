package pl.tim.hotelbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tim.hotelbackend.entity.Hotel;
import pl.tim.hotelbackend.service.HotelService;
import java.util.Optional;

@RestController
@RequestMapping("/hotels")
@CrossOrigin
public class HotelController {

    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping()
    public Iterable<Hotel> getAllHotels() {
        return hotelService.findAll();
    }

    @GetMapping("/")
    public Iterable<Hotel> getAllHotelsWithNameLike(@RequestParam("nameLike") String nameLike) { return hotelService.findAllByNameLike(nameLike); }

    @GetMapping("/{id}")
    public Optional<Hotel> getHotelById(@PathVariable Long id) {
        return hotelService.findById(id);
    }

    @PostMapping
    public void addHotel(@RequestBody Hotel hotel) {
        hotelService.save(hotel);
    }

    @PutMapping
    public void updateHotel(@RequestBody Hotel hotel) { hotelService.save(hotel); }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        hotelService.deleteById(id);
    }
}
