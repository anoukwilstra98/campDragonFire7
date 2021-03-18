package com.fim.wilstra.campDragonFire.model.javaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Renter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "renterID", insertable = false, updatable = false)
    private int id;

    @NonNull
    @Column(name = "firstname")
    private String firstName;

    @NonNull
    @Column(name = "lastName")
    private String lastName;

    @NonNull
    @Column(name = "alreadyPaid")
    private double alreadyPaid;

    @NonNull
    @Column(name = "hasCampingCard")
    private boolean hasCampingCard;

    @NonNull
    @OneToMany(mappedBy = "renter") //documentId
    private List<Document> documents;

    @OneToMany(mappedBy = "renter")
    private List<RentedSpot> rentedSpots;

    @OneToOne(mappedBy = "renter")
    private Login login;

    @ManyToOne
    @JoinColumn(name = "contactId")
    private Contact contact;



}
