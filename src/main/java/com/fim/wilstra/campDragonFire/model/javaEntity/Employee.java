package com.fim.wilstra.campDragonFire.model.javaEntity;

import com.fim.wilstra.campDragonFire.model.enums.MainFunction;
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
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private int id;

    @NonNull
    @Column(name = "firstname")
    private String firstName;

    @NonNull
    @Column(name = "lastName")
    private String lastName;

    //nullable
    @Column(name = "mainFunction")
    @Enumerated(EnumType.STRING)
    private MainFunction mainFunction;

    @OneToMany(mappedBy = "employee")
    private List<Activity> activities;

    @OneToOne
    private Login login;

    @ManyToOne
    @JoinColumn(name = "contactId")
    private Contact contact;

}
