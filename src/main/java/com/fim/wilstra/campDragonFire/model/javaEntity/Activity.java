package com.fim.wilstra.campDragonFire.model.javaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data //getters, setters, toString, equals, hash...
@Table(name = "Activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activityId")
    private int id;

    @NonNull
    @Column(name = "activityName")
    private String activityName;

    @NonNull
    @Column(name = "price")
    private double price;

    @NonNull
    @Column(name = "dateActivity")
    private Date dateActivity;

    @Column(name = "category")
    private String category;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @OneToMany(mappedBy = "activity")
    private List<BookedActivity> bookedActivities;



}

