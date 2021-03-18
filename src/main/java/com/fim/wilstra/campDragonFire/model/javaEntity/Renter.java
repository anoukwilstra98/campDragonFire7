package com.fim.wilstra.campDragonFire.model.javaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Renter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RenterID")
    private long id;

    @NonNull
    @Column(name = "alreadyPaid")
    private double alreadyPaid;

    @NonNull
    @Column(name = "hasCampingCard")
    private boolean hasCampingCard;

    @NonNull
    @OneToMany(mappedBy ="renter") //documentId
    private Set<Document> documents;

    @OneToOne
    @JoinColumn(name = "personid")
    private Person person;

    @OneToMany(mappedBy = "renter")
    private Set<RentedSpot> rentedSpots;
}
