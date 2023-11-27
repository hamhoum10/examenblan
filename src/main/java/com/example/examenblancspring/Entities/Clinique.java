package com.example.examenblancspring.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Clinique  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClimique;
    private String nomClinique;
    private String adresse;
    private int telephone;
    @ManyToMany (mappedBy = "clinique")
    private List<Medecin>  medecin;

}
