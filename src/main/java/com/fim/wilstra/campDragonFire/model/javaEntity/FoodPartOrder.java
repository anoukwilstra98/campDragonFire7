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
//"položka"
public class FoodPartOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "partorderid")
    private int id;

    @NonNull
    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "foodItemId")
    private FoodItem foodItem;

    @ManyToOne
    @JoinColumn(name = "foodOrderId")
    private FoodOrder foodOrder;
}
