package pl.szczesny.dataservice.domain.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
            @Column(name = "id", nullable = false)
            @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "name", nullable = true)
    String name;
    @Column(name = "surname", nullable = true)
    String surname;
    @Column(name = "email", length = 100, nullable = false)
    String email;

    public static void main(String[] args) {
        User Piotrek = User.builder().name("Piotr").surname("Szes").email("piotr.szczesny@dupa.pl").build();
    }



}
