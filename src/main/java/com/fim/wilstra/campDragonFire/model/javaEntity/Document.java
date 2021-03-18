package com.fim.wilstra.campDragonFire.model.javaEntity;

import com.fim.wilstra.campDragonFire.model.enums.DocumentType;
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
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documentId")
    private long id;

    @NonNull
    @Column(name = "documentNumber")
    private String documentNumber;

    @NonNull
    @Column(name = "documentType")
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;

    @NonNull
    @Column(name = "nationality")
    private String Nationality;

    @NonNull
    @Column(name = "validUntil")
    private Date validUntil;

    //nullable
    @Column(name = "visaNumber")
    private String visaNumber;

    @ManyToOne
    @JoinColumn(name= "renterId")
    private Renter renter;

}
