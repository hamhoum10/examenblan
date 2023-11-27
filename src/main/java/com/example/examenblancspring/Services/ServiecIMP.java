package com.example.examenblancspring.Services;

import com.example.examenblancspring.Entities.Clinique;
import com.example.examenblancspring.Entities.Medecin;
import com.example.examenblancspring.Entities.Patient;
import com.example.examenblancspring.Entities.RendezVous;
import com.example.examenblancspring.Repo.CliniqueRepo;
import com.example.examenblancspring.Repo.MedecinRepo;
import com.example.examenblancspring.Repo.PatientRepo;
import com.example.examenblancspring.Repo.RDVRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ServiecIMP implements IINterfqce {
private CliniqueRepo cliniqueRepo;
private MedecinRepo medecinRepo;
private PatientRepo patientRepo;
private RDVRepo rdvRepo;

    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepo.save(clinique);
    }

    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, long cliniqueId) {
        Clinique clinique = cliniqueRepo.findById(cliniqueId).orElse(null);
        List<Clinique> cliniques = new ArrayList<>();
        cliniques.add(clinique);
        medecin.setClinique(cliniques);


        return medecinRepo.save(medecin);
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public void addRDVAndAssignMeAndPatient(RendezVous rendezVous, long idMedecin, long idPatient) {
        Medecin medecin = medecinRepo.findById(idMedecin).orElse(null);
        rendezVous.setMedecin(medecin);
        Patient patient = patientRepo.findById(idPatient).orElse(null);
        rendezVous.setPatient(patient);
         rdvRepo.save(rendezVous);
    }

    @Override
    public int getNbrRendezVousMedecin(long idMedecin) {
        return 0;
    }
}
