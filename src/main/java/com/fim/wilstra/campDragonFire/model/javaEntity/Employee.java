package com.fim.wilstra.campDragonFire.model.javaEntity;

import com.fim.wilstra.campDragonFire.model.enums.MainFunction;
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
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private long id;

    //nullable
    @Column(name = "mainFunction")
    @Enumerated(EnumType.STRING)
    private MainFunction mainFunction;

    @NonNull
    @Column(name = "employeeNumber")
    private String employeeNumber;


    @OneToMany(mappedBy = "employee")
    private Set<Activity> activities;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;
}
