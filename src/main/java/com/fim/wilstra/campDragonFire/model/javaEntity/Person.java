package com.fim.wilstra.campDragonFire.model.javaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personId")
    private int id;
    @NonNull
    @Column(name = "firstName")
    private String firstName;

    @NonNull
    @Column(name = "lastName")
    private String lastName;

    @NonNull
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @OneToOne(mappedBy = "person")
    @JoinColumn(name = "employeeID")
    private Employee employee;


    @OneToOne(mappedBy = "person")
    private Login login;

    @ManyToOne
    @JoinColumn(name = "contactId")
    private Contact contact;

    @OneToOne(mappedBy = "person")
    private Renter renter;

}
