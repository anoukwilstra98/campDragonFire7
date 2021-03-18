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
    @Column(name = "alreadyPaid")
    private double alreadyPaid;

    @NonNull
    @Column(name = "hasCampingCard")
    private boolean hasCampingCard;

    @NonNull
    @OneToMany(mappedBy = "renter") //documentId
    private List<Document> documents;

    @OneToOne
    @JoinColumn(name = "renterId", insertable = false, updatable = false)
    private Person person;

    @OneToMany(mappedBy = "renter")
    private List<RentedSpot> rentedSpots;
}
