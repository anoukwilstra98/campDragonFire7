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
public class CampingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campingSpotId")
    private int id;

    @NonNull
    @Column(name = "spotName")
    private String spotName;

    @NonNull
    @Column(name = "hasElectricity")
    private boolean hasElectricity;

    @NonNull
    @Column(name = "maxPeople")
    private int maxPeople;

    @NonNull
    @Column(name = "pricePerNight")
    private float pricePerNight;

    @OneToMany(mappedBy = "campingSpot") //campingSpotId
    private List<RentedSpot> rentedSpots;

}
