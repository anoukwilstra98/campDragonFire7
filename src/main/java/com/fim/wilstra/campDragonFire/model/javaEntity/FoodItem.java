package com.fim.wilstra.campDragonFire.model.javaEntity;

import com.fim.wilstra.campDragonFire.model.enums.MealTime;
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
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FoodItemId")
    private long id;

    @NonNull
    @Column(name = "foodItemName")
    private String foodItemName;

    @NonNull
    @Column(name = "numberAvailable")
    private int numberAvailable;

    //nullable
    @Column(name = "forMealTime")
    @Enumerated(EnumType.STRING)
    private MealTime forMealTime;

    //nullable
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "foodItem")
    private Set<FoodPartOrder> foodPartOrders;
}
