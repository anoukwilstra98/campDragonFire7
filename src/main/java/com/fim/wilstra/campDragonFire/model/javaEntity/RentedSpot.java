package com.fim.wilstra.campDragonFire.model.javaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class RentedSpot {

    @Id
    @GeneratedValue
    @Column(name = "rentedSpotId", insertable = false, updatable = false)
    private long id;

    @NonNull
    @Column(name = "numberOfPeople")
    private int numberOfPeople;

    @NonNull
    @Column(name = "fromDate")
    private Date fromDate;

    @NonNull
    @Column(name = "untilDate")
    private Date untilDate;

    //nullable
    @Column(name = "remark")
    private String remark;

    @ManyToOne
    @JoinColumn(name = "rentedSpotId", insertable = false, updatable = false)
    private CampingSpot campingSpot;

    @ManyToOne
    @JoinColumn(name = "renterId") //renterId
    private Renter renter;

    @OneToMany(mappedBy = "rentedSpot")
    private Set<BookedActivity> activities;

    @OneToMany(mappedBy = "rentedSpot")
    private Set<FoodOrder> foodOrders;
}
