package pl.tim.hotelbackend.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString()
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private Long idUser;

    @Column(unique = true)
    private String username;

    private String password;

    private String email;

    private String role;

    private LocalDate creationDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER")
    private List<Review> myReviews;

    public AppUser(String email, String username, String password, String role, List<Review> myReviews) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        this.myReviews = myReviews;
        this.creationDate = LocalDate.now();
    }

    public AppUser(String email, String username, String password, String role) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        this.creationDate = LocalDate.now();
    }
}
