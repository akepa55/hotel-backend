package pl.tim.hotelbackend.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private Long idUser;

    private String email;

    @Column(unique = true)
    private String login;

    private String password;
    private String role;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER")
    private List<Review> myReviews;

    public User(String email, String login, String password, String role, List<Review> myReviews) {
        this.email = email;
        this.login = login;
        this.password = password;
        this.role = role;
        this.myReviews = myReviews;
    }

    public User(String email, String login, String password, String role) {
        this.email = email;
        this.login = login;
        this.password = password;
        this.role = role;
    }
}
