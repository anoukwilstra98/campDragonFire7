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
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loginId")
    private int id;

    @NonNull
    @Column(name = "userName")
    private String userName;

    @NonNull
    @Column(name = "password")
    private String password;

    @NonNull
    @Column(name = "isAdmin")
    private boolean isAdmin;

    @NonNull
    @Column(name = "isActive")
    private boolean isActive;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personId", nullable = false) //todo now one-to-one, how to 0..1 to 1
    private Person person;
}
