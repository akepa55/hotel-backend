package pl.tim.hotelbackend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true)
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HOTEL")
    private Long idHotel;

    private String name;
    private String description;
    private Integer stars;
    private String address;
    private Double latitude;
    private Double longitude;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_HOTEL", referencedColumnName = "ID_HOTEL")
    private List<Review> hotelReviews;

    public Hotel(String name, String description, Integer stars, String address, Double latitude, Double longitude) {
        this.name = name;
        this.description = description;
        this.stars = stars;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
