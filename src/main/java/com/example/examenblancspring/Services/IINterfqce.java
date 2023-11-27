package com.example.examenblancspring.Services;

import com.example.examenblancspring.Entities.Clinique;
import com.example.examenblancspring.Entities.Medecin;
import com.example.examenblancspring.Entities.Patient;
import com.example.examenblancspring.Entities.RendezVous;

public interface IINterfqce {

    public Clinique addClinique(Clinique clinique);
    public Medecin addMedecinAndAssignToClinique(Medecin medecin,long cliniqueId);
    public Patient addPatient(Patient patient);
    public void addRDVAndAssignMeAndPatient(RendezVous rendezVous,long idMedecin,long idPatient);
    public int getNbrRendezVousMedecin(long idMedecin);
}
