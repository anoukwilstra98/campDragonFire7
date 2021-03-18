package com.fim.wilstra.campDragonFire.model.javaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookedActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookedActivityId")
    private int id;

    @NonNull
    @Column(name = "quantity")
    private int quantity;

    //nullable
    @Column(name = "remark")
    private String remark;

    @ManyToOne
    @JoinColumn(name = "activityid") //activityId
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "rentedspotid") //bookedBy
    private RentedSpot rentedSpot;



}
