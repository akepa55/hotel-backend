package pl.tim.hotelbackend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true)
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REVIEW")
    private Long idReview;

    @Column(name = "ID_USER")
    private Long idUser;

    @Column(name = "ID_HOTEL")
    private Long idHotel;

    private Integer rating;
    private String text;

    public Review(Long idUser, Long idHotel, Integer rating, String text) {
        this.idUser = idUser;
        this.idHotel = idHotel;
        this.rating = rating;
        this.text = text;
    }
}
