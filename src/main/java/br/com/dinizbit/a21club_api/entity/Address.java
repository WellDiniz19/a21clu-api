package br.com.dinizbit.a21club_api.entity;

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
@Table(name = "addresses")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAddress")
    private Long idAddress;
    @Column(name = "street", nullable = false, length = 150)
    private String street;
    @Column(name = "number_house", nullable = false, length = 10)
    private int number_house;
    @Column(name = "complete", nullable = false, length = 50)
    private String complete;
    @Column(name = "zipcode", nullable = false)
    private int zipCode;
    @Column(name = "district", nullable = false, length = 150)
    private String district;
    @Column(name = "uf", nullable = false, length = 2)
    private String uf;
    @Column(name = "country",nullable = false)
    private String country;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(idAddress, address.idAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idAddress);
    }

    @Override
    public String toString() {
        return "Address{" +
                "idAddress=" + idAddress +
                '}';
    }

}
