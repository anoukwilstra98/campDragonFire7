package com.fim.wilstra.campDragonFire.model.javaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foodOrderId")
    private int id;

    @NonNull
    @Column(name = "dateBookingFor")
    private Date dateBookingFor;

    //nullable
    @Column(name = "remark")
    private String remark;

    @ManyToOne
    @JoinColumn(name = "rentedspotid") //bookedBy
    private RentedSpot rentedSpot;

    @OneToMany(mappedBy = "foodOrder")
    private List<FoodPartOrder> foodPartOrders;

}
