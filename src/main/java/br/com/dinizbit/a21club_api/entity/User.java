package br.com.dinizbit.a21club_api.entity;

import br.com.dinizbit.a21club_api.entity.enums.Role;
import br.com.dinizbit.a21club_api.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    @Column(name = "name", nullable = false, length = 150)
    private String name;
    @Column(name = "lastName", nullable = false, length = 150)
    private String lastName;
    @Column(name= "foneUser", nullable = false, length = 20)
    private String foneUser;
    @Column(name = "emailUser", unique = true, nullable = false, length = 120)
    private String emailUser;
    @Column(name = "userneme", unique = true, nullable = false, length = 30)
    private String userneme;
    @Column(name = "password", nullable = false, length = 200)
    private String password;
    @Column(name = "nameContact", nullable = false, length = 120)
    private String nameContact;
    @Column(name = "foneContact", nullable = false, length = 20)
    private String foneContact;
    @Column(name= "cpf", nullable = false, length = 11)
    private String cpf;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 100)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 100)
    private Status status ;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime created_at;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @CreatedBy
    @Column(name = "created_by")
    private String created_by;
    @LastModifiedBy
    @Column(name = "modified_by")
    private String modified_by;

    @OneToOne
    @JoinColumn(name = "idAddress")
    private Address address;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(idUser, user.idUser);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idUser);
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                '}';
    }
}
