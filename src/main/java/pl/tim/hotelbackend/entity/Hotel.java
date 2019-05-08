package pl.tim.hotelbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/*The entity annotations will be uncommented once we add a proper DB.
The Id and GeneratedValue is crucial for proper identification with the tables in db.
 */
//@Entity
public class Hotel {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer michelinStars;
    private String address;
    private Double latitude;
    private Double longitude;

    public Hotel() {

    }

    public Hotel(Long id, String name, String description, Integer michelinStars, String address, Double latitude, Double longitude) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.michelinStars = michelinStars;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMichelinStars() {
        return michelinStars;
    }

    public void setMichelinStars(Integer michelinStars) {
        this.michelinStars = michelinStars;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
